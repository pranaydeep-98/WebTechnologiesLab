import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/ConfigContextServlet")
public class ConfigContextServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        ServletConfig config = getServletConfig();
        String trainer = config.getInitParameter("trainer");

        ServletContext context = getServletContext();
        String company = context.getInitParameter("company");

        out.println("<h2>Trainer: " + trainer + "</h2>");
        out.println("<h2>Company: " + company + "</h2>");
    }
}