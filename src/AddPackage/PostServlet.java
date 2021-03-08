package AddPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */

public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		PrintWriter out = response.getWriter();
		String tname = request.getParameter("yourName");
		String tcolor = request.getParameter("yourColor");
		String tprice = request.getParameter("yourPrice");

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets", "root", "");
		Statement st = conn.createStatement();

		int i = st.executeUpdate("insert into products(name, color, price)values('"+tname+"','"+tcolor+"','"+tprice+"')");
		out.println("Data is successfully inserted!");
		}
		catch(Exception e)
		{
		System.out.print(e);
		e.printStackTrace();
		}
	}

}
