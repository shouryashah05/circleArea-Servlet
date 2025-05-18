package Circle;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CircleArea")
public class CircleArea extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String radiusParam = req.getParameter("radius");

        out.println("<html><head><title>Circle Area Result</title></head><body style='font-family:sans-serif;'>");

        try {
            if (radiusParam == null || radiusParam.trim().isEmpty()) {
                out.println("<h3 style='color:red;'>Please enter a valid radius.</h3>");
            } else {
                double radius = Double.parseDouble(radiusParam);
                double area = Math.PI * radius * radius;

                out.println("<h2>Calculated Area of Circle</h2>");
                out.println("<p><strong>Radius:</strong> " + radius + "</p>");
                out.println("<p><strong>Area:</strong> " + String.format("%.2f", area) + "</p>");
            }
        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid input. Please enter a numeric value.</h3>");
        }

        out.println("<br><a href='index.html'>← Go Back</a>");
        out.println("</body></html>");
    }
}
