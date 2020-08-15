package com.trendtech.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trendtech.registration.db.DBConnection;
/*
 * 
 *LoginServlet is to login web page
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4678510583834699129L;

	@Override
	public  void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		
			Connection conn = DBConnection.getConnection();
			ResultSet re = null;
			int resultCount =0;
			try {
				Statement stmt =  conn.createStatement();
				PreparedStatement stmnt = conn.prepareStatement("select * from public.user_tb where user_name =? and user_password=?");
				stmnt.setString(1, userName);
				stmnt.setString(2, password);
				re = stmnt.executeQuery();
				
//		
//				Cookie[] cookies = request.getCookies();
//				if(cookies !=null){
//				for(Cookie cookie : cookies){
//					if(cookie.getName().equals("user")) userName = cookie.getValue();
//				}
//				}
//				if(userName == null) {
//					response.sendRedirect("login.jsp");
//					}
				
				if(null!=re) {

					resultCount =re.getRow();
				}
//				System.out.println("resultCount : "+resultCount);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 finally {
			 try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		if(null!=re) {
			HttpSession session =request.getSession();
			session.setAttribute("UserName",userName);
			response.sendRedirect("WelcomeServlet");
		}
	}

}
