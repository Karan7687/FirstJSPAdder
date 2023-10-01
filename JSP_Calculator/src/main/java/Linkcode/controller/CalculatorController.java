package Linkcode.controller;
import Linkcode.model.*;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculatorController
 */
@WebServlet("/CalculatorController")
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
						String str1=request.getParameter("no1");
						String str2=request.getParameter("no2");
						
						
						int no1=Integer.parseInt(str1);
						int no2=Integer.parseInt(str2);
						
						Calculator calci=new Calculator();
						calci.setNo1(no1);
						calci.setNo2(no2);
						calci.setAdd(calci.getNo1()+calci.getNo2());
						
						HttpSession session=request.getSession();
						session.setAttribute("Result",calci);
						response.sendRedirect("Calci.jsp");
						
						
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
