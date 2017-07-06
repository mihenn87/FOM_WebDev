package com.videothek.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class dbTestServlet
 */
@WebServlet("/dbTestServlet")
public class dbTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Define datasorce connection pool
	@Resource(name="jdbc/dajena_ddns_fom")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Step 1: Setup printwriter
		PrintWriter out =response.getWriter();
		response.setContentType("text/plain");
		
		//Step 2: get connection to database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = dataSource.getConnection();
			
		
		//Step 3: create sql Statement
			String sql = "SELECT * FROM Movie";
			myStmt = myConn.createStatement();
			
		//Step 4: Execute SQL-Query
			myRs = myStmt.executeQuery(sql);
		
		//Step 5: Process result set
			while(myRs.next()){
				String dtTitle = myRs.getString("dtTitle");
				out.println(dtTitle);
			}
		
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
