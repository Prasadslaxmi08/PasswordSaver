import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Hello() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");

        out.println("<html>");
        out.println("<head><title>To do form</title></head>");
        out.println("<body style='font-family: Arial, sans-serif;'>"); // Inline CSS for body font-family

        if (username != null && !username.isEmpty()) {
            out.println("<h1>Servlet " + username + " at /WebApplication</h1>"); // Inline CSS for paragraph font-weight
        } else {
            out.println("<h1>ToDoform</h1>");
            out.println("<form action='Hello' method='get'>");
            out.println("<label for='username' style='font-weight: bold;'>Username:</label>"); // Inline CSS for label font-weight
            out.println("<input type='text' id='username' name='username' style='margin-bottom: 10px; padding: 5px;' required>"); // Inline CSS for input margin-bottom and padding
            out.println("<br>");
            out.println("<label for='pass' style='font-weight: bold;'>Password:</label>");
            out.println("<input type='Password' id='pass' name='pass' pattern='[0-9]{10}' style='margin-bottom: 10px; padding: 5px;' required>");
            out.println("<br>");	
            out.println("<input type='submit' value='Submit' style='padding: 5px 10px; background-color: #4CAF50; color: white; border: none; cursor: pointer; border-radius: 5px;'>"); // Inline CSS for submit button
            out.println("</form>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
