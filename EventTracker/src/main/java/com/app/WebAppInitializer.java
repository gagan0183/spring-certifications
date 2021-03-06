package com.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext webApplicationContext = getContext();
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(webApplicationContext));
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.html");
		dynamic.addMapping("*.pdf");
	}
	
	public AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext contexts = new AnnotationConfigWebApplicationContext();
		contexts.register(WebConfig.class);
		return contexts;
	}
}
