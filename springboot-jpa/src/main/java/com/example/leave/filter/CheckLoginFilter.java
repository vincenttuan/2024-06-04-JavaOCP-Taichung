package com.example.leave.filter;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/*"})
public class CheckLoginFilter extends HttpFilter{
	
	// 白名單
	private static List<String> whitelists = List.of("/login", "/employee/register");
	
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String servletPath = request.getServletPath(); // 取得當前 URL servletPath
		if(whitelists.contains(servletPath)) { // servletPath 是否包含在 whitelists 中
			// 此為白名單路徑, 放行
			chain.doFilter(request, response);
			return;
		}
		
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
