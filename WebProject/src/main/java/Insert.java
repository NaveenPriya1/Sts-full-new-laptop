

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student s = new Student();
		
		s.setSid(Integer.parseInt(request.getParameter("sid")));
		s.setSname(request.getParameter("sname"));
		s.setSemail(request.getParameter("semail"));
		
		StudentDao sd = new StudentDao();
		//PrintWriter pw = response.getWriter();
		try {
			int row=sd.insert(s);
			if(row!=0)
				//pw.print(row+" rows inserted succesfully");
				response.sendRedirect("success.html");
			else
				//pw.print(" not inserted");
				response.sendRedirect("fail.html");
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
