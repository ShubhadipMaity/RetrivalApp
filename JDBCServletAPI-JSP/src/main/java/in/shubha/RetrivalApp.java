package in.shubha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shubha.Util.jdbcUtil;
import shubha.entity.Emp;


@WebServlet("/reterieve")
public class RetrivalApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SELECT_SQL_QUERY = "select * from emp where eid=?";

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Collect input supplied by the user
		
		String userid=request.getParameter("userid");
		
		try {
			Connection connection=jdbcUtil.getDbConnection();
			PreparedStatement psmt=connection.prepareStatement(SELECT_SQL_QUERY);
			psmt.setInt(1, Integer.parseInt(userid));
			
			ResultSet resultSet=psmt.executeQuery();
			
			
			
			RequestDispatcher rd=null;
			
		
			
			if(resultSet.next()) {
								
				Emp employee=new Emp();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEage(resultSet.getInt(3));
				employee.setEaddress(resultSet.getString(4));
				
				
				
				rd=request.getRequestDispatcher("success.jsp");
				request.setAttribute("employee", employee);
				rd.forward(request, response);
				
		
			
			}else {
				
				rd=request.getRequestDispatcher("faliure.jsp");
				request.setAttribute("userid", userid);
				rd.forward(request, response);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	}


