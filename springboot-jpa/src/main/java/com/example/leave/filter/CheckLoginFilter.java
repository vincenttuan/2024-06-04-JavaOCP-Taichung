package com.example.leave.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/employee", "/project/*", "/leave_request", "/"})
public class CheckLoginFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 檢查 session 中是否有登入資訊
		HttpSession session = request.getSession();
		if(session == null || session.getAttribute("employeeDTO") == null) {
			response.sendRedirect("/login");
			return;
		}
		
		// 檢查通過, 放行
		chain.doFilter(request, response);
	}

	
}	
