package com.melcocrown.smartroom.hotsos.ws;

import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HostSosClient {
	private static final Logger LOG = LoggerFactory.getLogger(HostSosClient.class);
	
	
	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().addShutdownHook(new Thread(HostSosClient::shutdown));
		
		LOG.info("Start HostSos Client");
	
		
		HostSosWsSender sender = new HostSosWsSender();
		new Thread(sender).start();
		
		
	}
		
	private static void shutdown(){
		/*try {
			
			if (socket != null) {
				socket.close();
				if (socket.isClosed()){
					logger.info("Closed");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
