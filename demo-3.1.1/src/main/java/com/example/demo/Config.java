package com.example.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class Config {
	
	@Bean
	public ServletRegistrationBean<DispatcherServlet> defaultDispatcherRegistration() {
		return new ServletRegistrationBean<>(loggingDispatcherServlet(), "/*");
	}
	
	@Bean
	public ServletRegistrationBean<DispatcherServlet> webdavDispatcherRegistration() {
		return new ServletRegistrationBean<>(loggingDispatcherServlet(), "/servlet/*");
	}
	
	@Bean
	public DispatcherServlet loggingDispatcherServlet() {
		LoggingDispatcherServlet lds = new LoggingDispatcherServlet();
		return lds;
	}

	@Bean
	public ServletRegistrationBean<HelloServlet> servletBean() {
		var servlet = new HelloServlet();
		ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean(
				servlet, "/servlet/*");
		bean.setLoadOnStartup(1);
		return bean;
	}
}
