package filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/product", "/product/*"})
public class LoginFilter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 檢查是否有登入資訊 ?
		HttpSession session = request.getSession();
		if(session.getAttribute("userDto") == null) {
			// 使用者尚未登入, 要帶給 result.jsp 的參數
			request.setAttribute("result", "使用者尚未登入");
			request.setAttribute("redirectURL", "/WebCart/login");
			request.setAttribute("redirectName", "請登入");
			request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response); 
			return;
		}
		
		// by pass
		chain.doFilter(request, response);
		
	}
	
}
