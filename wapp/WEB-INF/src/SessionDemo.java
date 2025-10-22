import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/session")
public class SessionDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set response type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get or create a session
        HttpSession session = request.getSession();

        // Retrieve visit count from session
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1; // First visit
            out.println("<h2>Welcome! This is your first visit.</h2>");
        } else {
            visitCount = visitCount + 1; // Increment visit count
            out.println("<h2>Welcome back! You have visited " + visitCount + " times.</h2>");
        }

        // Save updated visit count back to session
        session.setAttribute("visitCount", visitCount);

        // Display session details
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Is this a new session? " + session.isNew() + "</p>");

        // Add a link to reload the page and test session persistence
        out.println("<br><a href='SessionDemo'>Reload Page</a>");
        
        out.close();
    }
}
