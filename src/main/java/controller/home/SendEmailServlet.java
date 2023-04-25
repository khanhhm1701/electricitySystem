package controller.home;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

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

@WebServlet("/sendEmail")
public class SendEmailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if (type != null) {
			switch (type) {
			case "thu-tien-dien-theo-thang":
				break;
			case "tam-ngung-cung-cap-dien":
				break;
			case "thay-doi-gia-dien":
				var list = CauHinhData.withsStatus(CauHinhData.STATUS_CHO_THAY_DOI);
				request.setAttribute("list", list);
				break;
			case "nhac-no-tien-dien":
				break;
			}
			request.setAttribute("type", type);
		}
		PageInfo page = new PageInfo("Gửi thông báo qua Enauk", "sendEmail.jsp");
		page.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var action = request.getParameter("action");
		String message = "";
		if (action != null) {
			switch (action) {
			case "thu-tien-dien-theo-thang":
				try {
					var month = Integer.parseInt(request.getParameter("month"));
					Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
					if (month < 1 || month > 12) {
						message = "Thất bại. Vui lòng chọn tháng thu tiền điện !!!";
					} else {
						var list = BillData.withStatusAndMonth(BillData.STATUS_CHUA_NOP_TIEN, month);
						message ="Thành công !!! Số Email sẽ gửi thông báo: " + list.size();
					}
				} catch (ParseException e) {
					e.printStackTrace();
					message = "Thất bại. Vui lòng điền đầy đủ thông tin !!!";
				} 
				break;
			case "tam-ngung-cung-cap-dien":
				var city = request.getParameter("city");
				var district = request.getParameter("district");
				var ward = request.getParameter("ward");
				try {
					Date dateStart = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateStart"));
					Date dateEnd = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dateEnd"));
					var description = request.getParameter("description");
					if (description == null || description.length() == 0) {
						message = "Thất bại. Lý do cắt điện không được để trống !!!";
					} else {
						var list = UserData.withAddress(city, district, ward);
						message ="Thành công !!! Số Email sẽ gửi thông báo: " + list.size();
					}
				} catch (ParseException e) {
					e.printStackTrace();
					message = "Thất bại. Vui lòng điền đầy đủ và đúng thông tin !!!";
				} 
				break;
			case "thay-doi-gia-dien":
				var description = request.getParameter("description");
				var id = request.getParameter("id");
				if (id != null && id.length() > 0) {
					if (description == null || description.length() == 0) {
						message = "Thất bại. Lý do thay đổi giá điện không được để trống !!!";
					} else {
						var list = UserData.all();
						message ="Thành công !!! Số Email sẽ gửi thông báo: " + list.size();
					}
				} else {
					message = "Thất bại. Vui lòng chọn đợt chỉnh điện !!!";
				}
				break;
			case "nhac-no-tien-dien":
				String[] messages = {"Nộp tiền ngay không sẽ bị cắt điện", "Nộp tiền đi các bạn", "Yêu cầu khách hàng nộp khoản tiền nợ ngay"};
				var messageId = request.getParameter("messageId");
				if (messageId != null && messageId.length() > 0) {
					int id2 = Integer.parseInt(messageId);
					if (id2 >= 0 && id2 <= messages.length) {
						var list = BillData.withStatus(BillData.STATUS_QUA_HAN);
						message ="Thành công !!! Số Email sẽ gửi thông báo: " + list.size();
					} else {
						message = "Thất bại. Thông tin chưa chính xác !!!";
					}
				} else {
					message = "Thất bại. Vui lòng chọn nội dung cảnh báo !!!";
				}
				break;
			}
		}
		request.setAttribute("message", message);
		this.doGet(request, response);
	}

}
