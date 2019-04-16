import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/ServletCalculator", urlPatterns = {"/ServletCalculator"})
public class ServletCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double x = Double.parseDouble(request.getParameter("addFirst"));
        double y = Double.parseDouble(request.getParameter("addSecond"));
        double w = Double.parseDouble(request.getParameter("mulFirst"));
        double z = Double.parseDouble(request.getParameter("mulSecond"));

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println(x + " + " + y + " = " + (x + y) + "<br>");
        out.println(w + " * " + z + " = " + (w * z));
        out.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
