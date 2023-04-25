package controller.home;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import commom.PageInfo;
import io.CauHinhData;
import model.CauHinh;
import model.Item;

@WebServlet("/setting")
public class SettingServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var list = CauHinhData.all();
		request.setAttribute("list", list);
		PageInfo page = new PageInfo("Cài đặt", "setting.jsp");
		page.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var action = request.getParameter("action");
		if (action != null) {
			if (action.equals("submit")) {
				String message = "";
					String type = request.getParameter("type");
					if (type == null || type.equals("0")) {
						message = "Vui lòng chọn loại điện";
					} else {
						int[] lengths = {7, 4, 9, 12};
						int length = lengths[Integer.parseInt(type) - 1];
						try {
							CauHinh c = new CauHinh();
							Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
							System.out.println(request.getParameter("date"));
							System.out.println(date);
							if (length > 0) {
								var price = request.getParameterValues("price" + type);
								Item[] arr = new Item[length];
								for (int i = 0; i < length; i++) {
									arr[i] = new Item(i, Integer.parseInt(price[i]));
								}
								c.setTime(new Timestamp(date.getTime()));
								c.setData(arr);
								c.setType(Integer.parseInt(type));
								CauHinhData.insert(c);
							}
						} catch (ParseException e) {
							e.printStackTrace();
						} 
					}
					
					
					request.setAttribute("message", message);
			}
		}
		
		this.doGet(request, response);
	}

}
