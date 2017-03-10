package com.melcocrown.smartroom.hotsos.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;



import com.melcocrown.smartroom.hotsos.config.HotSOSClientConfig;
import com.melcocrown.smartroom.hotsos.config.HotSOSClientConfigImpl;
import com.melcocrown.smartroom.hotsos.dao.ServiceOrderDAO;
import com.tech.m.api.MTechAPI;
import com.tech.m.api.MTechAPI_Service;
import com.tech.m.api.issue.Issue;
import com.tech.m.api.room.Room;
import com.tech.m.api.serviceorder.ServiceOrder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HostSosWsSender implements Runnable
{
	private MTechAPI_Service apiService;
	private MTechAPI apiClient;
	private com.tech.m.api.issue.ObjectFactory issueFactory = new com.tech.m.api.issue.ObjectFactory();
	private com.tech.m.api.room.ObjectFactory roomFactory = new com.tech.m.api.room.ObjectFactory(); 
	private com.tech.m.api.serviceorder.ObjectFactory soFactory = new com.tech.m.api.serviceorder.ObjectFactory();
	private com.tech.m.api.ObjectFactory factory = new com.tech.m.api.ObjectFactory();
	private JAXBElement<String> roomRushId;
	private Issue roomRush;
	private JAXBElement<Issue> roomRushJaxb;
	private static final Logger LOG = LoggerFactory.getLogger(HostSosWsSender.class);
	private static HotSOSClientConfig hotSosClientConfig;
//	public HostSosWsSender() throws MalformedURLException{
//		apiService = new MTechAPI_Service(new URL("file:src/dist/conf/schema/soap.xml"));
//		apiClient=apiService.getPort(MTechAPI.class);
//		
//		BindingProvider bindProv = (BindingProvider) apiClient;
//		java.util.List<Handler> handlers = bindProv.getBinding().getHandlerChain();
//		handlers.add(new WSSecurityHeaderSOAPHandler("Melco_Crown_System", "test123"));
//		//handlers.add(new WsLoggingHandler());
//		bindProv.getBinding().setHandlerChain(handlers);
//		
//	}
//	
  	public HostSosWsSender(){}
	
	public HostSosWsSender(HotSOSClientConfig hotsosConfig) throws MalformedURLException
	{
		this.apiService = new MTechAPI_Service(new URL(hotsosConfig.getWsdlUrl()));
		apiClient=apiService.getPort(MTechAPI.class);
		
		BindingProvider bindProv = (BindingProvider) apiClient;
		java.util.List<Handler> handlers = bindProv.getBinding().getHandlerChain();
		handlers.add(new WSSecurityHeaderSOAPHandler(hotsosConfig.getHotSOSUserName(),hotsosConfig.getHotSOSPassword()));
		//handlers.add(new WsLoggingHandler());
		bindProv.getBinding().setHandlerChain(handlers);
		
	}
	
	public void createServiceOrder(String rmNum,String serviceType)
	{
		LOG.info("createRushRoomServiceOrder roomNumber:"+rmNum+" serviceType:"+serviceType);
		try
		{
			ApplicationContext context =
		    		new ClassPathXmlApplicationContext("file:conf/Spring-Module.xml");

			ServiceOrderDAO serviceOrderDAO = (ServiceOrderDAO) context.getBean("customerDAO");
			String issueId = serviceOrderDAO.findIssueIdByIssueName(serviceType);
			LOG.info("issueId:"+issueId);
			roomRushId = factory.createApiObjectID(issueId);
			roomRush = issueFactory.createIssue();
			roomRush.setID(roomRushId);
			roomRushJaxb = soFactory.createServiceOrderIssue(roomRush);
			
			JAXBElement<String> roomNumber = roomFactory.createRoomRoomNumber(rmNum);
			Room room = roomFactory.createRoom();
			room.setRoomNumber(roomNumber);
			JAXBElement<Room> roomJaxb = soFactory.createServiceOrderLocation(room);
			
			ServiceOrder createSo = soFactory.createServiceOrder();
			createSo.setLocation(roomJaxb);
			createSo.setIssue(roomRushJaxb);
			LOG.info("calling create so api:"+createSo.toString());
			ServiceOrder returnObj = (ServiceOrder)apiClient.send(createSo);
			String serviceOrderId = returnObj.getID().getValue();
			LOG.info("retuen created service order ID:"+serviceOrderId);
			serviceOrderDAO.storeServiceOrderInfo(serviceOrderId, rmNum);
		   
		}
		catch(Exception e)
		{
			LOG.error("createRushRoomServiceOrderError:"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public ServiceOrder getServiceOrder(String orderId)
	{
		LOG.info("call getServiceOrder api with ordreId::"+orderId);
		try{
			ServiceOrder getSo = soFactory.createServiceOrder();
			JAXBElement<String> getSoId = factory.createApiObjectID(orderId);
			getSo.setID(getSoId);
			
			ServiceOrder returnSo = (ServiceOrder) apiClient.get(getSo);
			System.out.println(returnSo.toString());
			System.out.println("so id:"+returnSo.getID().getValue());
			System.out.println("so status:"+returnSo.getStatus().getValue());
			
			return returnSo;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	

	@Override
	public void run() {

		//Subscribe Kafka
		
		//Send message to HotSOS
		System.out.println("start send message to HotSOS....");
		HostSosWsSender sender;
		try {
			hotSosClientConfig = new HotSOSClientConfigImpl();
		
			sender = new HostSosWsSender(hotSosClientConfig);
			sender.createServiceOrder("1","MakeUpRoom");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("complete");

	}
}
