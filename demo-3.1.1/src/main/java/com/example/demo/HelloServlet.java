package com.example.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
			throws ServletException, IOException {

		servletResponse.setStatus(HttpServletResponse.SC_OK);
		servletResponse.getWriter().write("hello from servlet");
		servletResponse.getWriter().flush();
	}
}
