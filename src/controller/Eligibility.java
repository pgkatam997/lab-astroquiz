package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.jws.WebService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EligibiltyCheck;

@WebService(name= {"/eligiblemain"})
public class Eligibility<HttpServletRequest, HttpServletResponse, RequestDispatcher> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

	String points=request.getParameter("points");
	EligibiltyCheck eli =new EligibiltyCheck();
	boolean spaceEligible=eli.checkQuizAnswer(points);
	
	if(false)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
