package ProductDetails;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Test extends GenericServlet {
	@Override
	public void init()throws ServletException {
		//no code
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String pid=req.getParameter("code");
		String pname=req.getParameter("name");
		String price=req.getParameter("pri");
		String qty=req.getParameter("qty");
		
		pw.println("============Product Details==============");
		pw.println("<br>Product Id :"+pid);
		pw.println("<br>Product Name :"+pname);
		pw.println("<br>Product Price :"+price);
		pw.println("<br>Product Quantity :"+qty);
		
		
	}
	@Override
	public void destroy() {
		//no code
	}

}
