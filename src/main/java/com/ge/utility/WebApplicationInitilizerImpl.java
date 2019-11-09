package com.ge.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebApplicationInitilizerImpl implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebConfigurationUtility.class);
		context.register(DataBaseConfigurationImpl.class);
		context.setServletContext(servletContext);
		Dynamic dynamic = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(context));
		dynamic.setLoadOnStartup(5);
		dynamic.addMapping("/");
		context.close();
	}
}
