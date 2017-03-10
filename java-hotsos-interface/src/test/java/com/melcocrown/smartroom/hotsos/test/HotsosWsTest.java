package com.melcocrown.smartroom.hotsos.test;

import com.melcocrown.smartroom.hotsos.ws.HostSosWsSender;

public class HotsosWsTest {

	public static void main(String[] args) {
		try{
			//System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
			//System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
			//System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
			//System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true"); 
			System.out.println("test");
			HostSosWsSender client = new HostSosWsSender();
			client.createServiceOrder("1","MakeUpRoom");
				
//			System.out.println("test_GetServiceOrder");
//			client.getServiceOrder("20");
			System.out.println("complete");
			
			
			/*
			com.tech.m.api.issue.ObjectFactory issueFactory = new com.tech.m.api.issue.ObjectFactory();
			com.tech.m.api.room.ObjectFactory roomFactory = new com.tech.m.api.room.ObjectFactory(); 
			com.tech.m.api.serviceorder.ObjectFactory soFactory = new com.tech.m.api.serviceorder.ObjectFactory();
			com.tech.m.api.ObjectFactory factory = new com.tech.m.api.ObjectFactory();
			
			MTechAPI_Service apiService = new MTechAPI_Service(new URL("file:src/main/schema/soap.xml"));
			MTechAPI apiClient=apiService.getPort(MTechAPI.class);
			
			BindingProvider bindProv = (BindingProvider) apiClient;
			java.util.List<Handler> handlers = bindProv.getBinding().getHandlerChain();
			handlers.add(new WSSecurityHeaderSOAPHandler("Melco_Crown_System", "test123"));
			handlers.add(new WsLoggingHandler());
			bindProv.getBinding().setHandlerChain(handlers);
			
			JAXBElement<String> roomRushId = factory.createApiObjectID("1718");
			Issue roomRush = issueFactory.createIssue();
			roomRush.setID(roomRushId);
			JAXBElement<Issue> roomRushJaxb = soFactory.createServiceOrderIssue(roomRush);
			
			JAXBElement<String> roomNumber = roomFactory.createRoomRoomNumber("1002");
			Room room = roomFactory.createRoom();
			room.setRoomNumber(roomNumber);
			JAXBElement<Room> roomJaxb = soFactory.createServiceOrderLocation(room);

			ServiceOrder createSo = soFactory.createServiceOrder();
			createSo.setLocation(roomJaxb);
			createSo.setIssue(roomRushJaxb);
			
			ServiceOrder getSo = soFactory.createServiceOrder();
			JAXBElement<String> getSoId = factory.createApiObjectID("7");
			getSo.setID(getSoId);
			
			ServiceOrder returnSo = (ServiceOrder) apiClient.get(getSo);
			System.out.println(returnSo.getStatus().getValue());
			Room returnRoom = (Room) apiClient.get(room);
			ServiceOrder createdSo = (ServiceOrder) apiClient.send(createSo);
			System.out.println(createdSo.getID().getValue());
			*/
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
