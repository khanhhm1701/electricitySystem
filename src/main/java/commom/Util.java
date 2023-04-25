package commom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;



public class Util {
	
	
	
	public static String readFile(String file) {
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader(file));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				return line;
			} finally {
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String getTime(String param) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(param);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}
	
	public static void saveFile(Part part, String name) {
		
	}

	public static String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] tokens = contentDisp.split(";");
		for (String token : tokens) {
			if (token.trim().startsWith("filename")) {
				return token.substring(token.indexOf("=") + 2, token.length() - 1);
			}
		}
		return "";
	}
	
	public static void addNotify(HttpServletRequest request, String message) {
		HttpSession session = request.getSession(false);
		session.setAttribute("message", message);
	}
	
}
