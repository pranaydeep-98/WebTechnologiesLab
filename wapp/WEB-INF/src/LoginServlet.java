import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String[][] users = {
            {"user1", "pwd1"},
            {"user2", "pwd2"},
            {"user3", "pwd3"},
            {"user4", "pwd4"}
        };

        String u = req.getParameter("user");
        String p = req.getParameter("pwd");
        boolean valid = false;

        for (String[] pair : users) {
            if (pair[0].equals(u) && pair[1].equals(p)) {
                Cookie c = new Cookie("username", u);
                res.addCookie(c);
                out.println("<h1>Welcome, " + u + "</h1>");
                valid = true;
                break;
            }
        }

        if (!valid) {
            out.println("<h1>You are not an authenticated user</h1>");
        }
        out.close();
    }
}
