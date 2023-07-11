package com.example.demo;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingDispatcherServlet extends DispatcherServlet{


	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("dispatching");
			super.doDispatch(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
