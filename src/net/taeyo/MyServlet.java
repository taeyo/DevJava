package net.taeyo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 출력을  euc-kr로 하게 만듭니다. 
		  response.setContentType("text/html; charset=euc-kr");

		  String name = request.getParameter("name");

		  // 입력은 8859_1로 오게 되므로 이를 EUC-KR로 변환하여야 합니다. 
		  //String name2 = new String(name.getBytes("8859_1"), "euc-kr");

		  response.getWriter().println("<html><body>");   
		  response.getWriter().write("<h1>Get 방식의 서블릿 테스트 입니다.</h1>");
		  response.getWriter().println();
		  response.getWriter().println();
		  response.getWriter().write("안녕하세요?   " + name + "님");
		  response.getWriter().println("</body></html>");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 출력을  euc-kr로 하게 만듭니다. 
		  response.setContentType("text/html; charset=euc-kr");

		  String name = request.getParameter("name"); 

		  // 입력은 8859_1로 오게 되므로 이를 EUC-KR로 변환하여야 합니다. 
		  //String name2 = new String(name.getBytes("8859_1"), "euc-kr");

		  response.getWriter().println("<html><body>");  
		  response.getWriter().write("<h1>Post 방식의 서블릿 테스트 입니다.</h1>");
		  response.getWriter().println();
		  response.getWriter().println();
		  response.getWriter().write("안녕하세요?   " + name + "님");
		  response.getWriter().println("</body></html>");  
	}

}
