package Prototype;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ButtonServlet
 */
public class ButtonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ButtonServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		PrintWriter pw=response.getWriter();
		response.getWriter().append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int x= Integer.parseInt(request.getParameter("x"));
		int y= Integer.parseInt(request.getParameter("y"));
		String color=request.getParameter("color");
		Button prototype = new Button(x,y,color);
		PrototypeRegistry registry= new PrototypeRegistry();
		registry.addItem("LandingButton", prototype );
		
		Button clonedButton=(Button) registry.getByColor(color);
		request.setAttribute("x", clonedButton.getX());
		request.setAttribute("y", clonedButton.getY());
		request.setAttribute("color", clonedButton.getColor());
		request.getRequestDispatcher("ButtonResult.jsp").forward(request, response);
		
		
		
		doGet(request, response);
	}

}
