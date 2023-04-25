package controller.home;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import io.BillData;
import io.CauHinhData;
import io.UserData;
import model.CauHinh;
import model.Item;
import model.User;

@WebServlet("/user-details")
public class UserDetailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		var id = Integer.parseInt(request.getParameter("id"));
		var user = UserData.withId(id);
		request.setAttribute("user", user);

		var bills = BillData.withUserId(id);
		request.setAttribute("bills", bills);
		

		PageInfo page = new PageInfo("Thông tin khách hàng", "userDetail.jsp");
		page.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
