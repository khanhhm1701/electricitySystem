package commom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageInfo {

	private String filePath;
	
	private String title;
	
	private String folder = "home";
	
	public PageInfo(String title, String filePath) {
		this.title = title;
		this.filePath = filePath;
	}
	
	public void forward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/" + this.folder + "/layout.jsp");
		request.setAttribute("PageInfo", this);
		rd.forward(request, response);
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setAdmin() {
		this.folder = "admin";
	}
	

	
	public static void page404NotFound(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		(new PageInfo("404", "404.jsp")).forward(request, response);
	}
}
