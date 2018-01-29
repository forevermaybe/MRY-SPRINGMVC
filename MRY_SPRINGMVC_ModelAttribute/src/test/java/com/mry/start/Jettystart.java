package com.mry.start;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Jettystart {

	public static void main(String[] args) {
		int port = 8080;
		Server server = new Server(port);
		WebAppContext webAppContext = new WebAppContext("webapp", "/mry");

		webAppContext.setDescriptor("webapp/WEB-INF/web.xml");
		webAppContext.setResourceBase("src/main/webapp");
		webAppContext.setDisplayName("mry_springmvc");
		webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());
		webAppContext.setConfigurationDiscovered(true);
		webAppContext.setParentLoaderPriority(true);
		server.setHandler(webAppContext);
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("启动成功,url:" + server.getURI());
	}
}
