import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{
 public void service(HttpServletRequest req,HttpServletResponse resp)
  throws ServletException,IOException
 {
     resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();

out.println("<html><head><title>Welcome to servlet</title></head>");
out.println("<body><h1>welcome to servlet program in tomcat server</h1></body>");
out.println("</html>");

 }
}