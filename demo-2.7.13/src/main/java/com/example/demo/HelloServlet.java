package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
			throws ServletException, IOException {

		servletResponse.setStatus(HttpServletResponse.SC_OK);
		servletResponse.getWriter().write("hello from servlet");
		servletResponse.getWriter().flush();
	}
}
