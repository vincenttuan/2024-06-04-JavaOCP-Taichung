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
		req.setAttribute("errorMessage", "本網頁不支援 Get 請求");
		req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.接收請求參數(Parameter)
		String height = req.getParameter("h");
		String weight = req.getParameter("w");
		// 2.判斷是否有收到參數 ?
		if(height == null || weight == null) {
			System.out.println("請輸入身高或體重的資料"); // 會印在 Tomcat Console 中
			req.setAttribute("errorMessage", "請輸入身高或體重的資料");
			req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);
			return;
		}
		// 3.將 height 與 weight 轉 double
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		// 4. 計算 bmi
		double bmi = w / Math.pow(h/100, 2);
		// 5. 印出 bmi 
		System.out.println("bmi = " + bmi); // 會印在 Tomcat Console 中
		// 6. 將要傳送給 jsp 的資料放到 req 的屬性中 
		req.setAttribute("bmi", bmi);
		// 7. forward 到 display_bmi.jsp
		req.getRequestDispatcher("/WEB-INF/view/display_bmi.jsp").forward(req, resp);
		
	}
	
}
