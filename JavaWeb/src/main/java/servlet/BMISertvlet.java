package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet/bmi")
public class BMISertvlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.接收請求參數(Parameter)
		String height = req.getParameter("h");
		String weight = req.getParameter("w");
		// 2.判斷是否有收到參數 ?
		if(height == null || weight == null) {
			resp.getWriter().print("Please input h and w !");
			return;
		}
		// 3.將 height 與 weight 轉 double
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		// 4. 計算 bmi
		double bmi = w / Math.pow(h/100, 2);
		// 5. 印出 bmi (會印在 Tomcat Console 中)
		System.out.println("bmi = " + bmi);
		
	}
	
}
