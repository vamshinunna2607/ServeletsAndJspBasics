import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet{

	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{

		//Method1
		//		int k = (int)req.getAttribute("k");
		//		k=k*k;
		//		PrintWriter p = res.getWriter();
		//		p.println("Square of num is "+k);
		
		//Method2
		//		int k = Integer.parseInt(req.getParameter("k"));
		//		k=k*k;
		//		PrintWriter p = res.getWriter();
		//		p.println("Square of num is "+k);
		
		//Method3
		//		HttpSession session = req.getSession();
		//		int k = (int)session.getAttribute("k");
		//		k=k*k;
		//		PrintWriter p = res.getWriter();
		//		p.println("Square of num is "+k);
		
		//Method4
		int k =0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("k"))
			{
				k= Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
				PrintWriter p = res.getWriter();
				p.println("Square of num is "+k);
		
	}
}
