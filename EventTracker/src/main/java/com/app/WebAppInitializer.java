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
		WebApplicationContext contexts = getContext();
		servletContext.addListener(new ContextLoaderListener(contexts));
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(contexts));
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.html");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext contexts = new AnnotationConfigWebApplicationContext();
		contexts.register(WebConfig.class);
		return contexts;
	}
}
