package com.hibernate.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.entity.EProduct;
import com.hibernate.util.HibernateUtil;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("add-product.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		Double price =Double.valueOf(request.getParameter("price"));
		
		EProduct e = new EProduct();
		e.setName(name);
		e.setPrice(price);
		
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(e);
		
		tr.commit();
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<p>product inserted succesfuly.  <a href='ListProducts'>Click here<a/> to view products</p>");
		out.print("</body></html>");
	}

}
