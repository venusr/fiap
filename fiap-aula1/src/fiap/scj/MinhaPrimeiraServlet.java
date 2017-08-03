package fiap.scj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MinhaPrimeiraServlet
 */
@WebServlet("/MinhaPrimeiraServlet1")
public class MinhaPrimeiraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MinhaPrimeiraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body><form method=\"POST\" action=\"./MinhaPrimeiraServlet\">");
				
		writer.append("<input type=\"text\" name=\"name\"/></br>");
		writer.append("<input type=\"submit\" /></br>");
		writer.append("</form></body>");
		writer.append("</html>");
		
		HttpSession session = request.getSession();
		writer.append("Sua session é: " + session.getAttribute("id"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FileWriter arq = new FileWriter("D:/javaweb/arq.txt", true);
		StringWriter sw = new StringWriter();
		
		sw.write("Nome:");
		sw.write(request.getParameter("name") +"\r\n");
		arq.write(sw.toString());
		arq.close();
		
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append(request.getParameter("name") + "</br>");
		writer.append("</body>");
		writer.append("</html>");
		
		//request.getRequestDispatcher("/SucessoServlet").forward(request,response);
		//request.getRequestDispatcher("/SucessoServlet").include(request,response);
		response.sendRedirect("SucessoServlet");
	}

}
