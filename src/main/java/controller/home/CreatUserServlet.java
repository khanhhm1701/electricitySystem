package controller.home;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import io.BillData;
import io.CauHinhData;
import io.UserData;
import model.Bill;
import model.CauHinh;
import model.Item;
import model.User;

@WebServlet("/creat-user")
public class CreatUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageInfo page = new PageInfo("Cài đặt", "creatUser.jsp");
		page.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		String city = request.getParameter("city");
		String district = request.getParameter("district");
		String ward = request.getParameter("ward");
		
		Random rd = new Random();
		int n =  rd.nextInt(100000000);
		
		for (int i = 0; i < 20; i++) {
			User user = new User(-1, "user" + (i + n), "pass" +  (i + n), "user" + (i + n) + "@gmail.com", city, district, ward, 0);
			UserData.insert(user);
		}
		
		
		var lists = UserData.all();
		for (var item : lists) {
			int sodien = rd.nextInt(200) + 10;
			Bill bill = new Bill();
			bill.setId(-1);
			bill.setUserId(item.getId());
			bill.setSodien(sodien);
			bill.setTongtien(sodien * 7000 + sodien * 1000 + sodien * 10);
			bill.setMonth(rd.nextInt(3) + 1);
			bill.setYear(2022);
			bill.setStatus(rd.nextInt(2));
			BillData.insert(bill);
		}
		
		*/
		
		
		this.doGet(request, response);
	}

}
