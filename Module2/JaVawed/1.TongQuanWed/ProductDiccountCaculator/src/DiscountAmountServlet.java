import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountAmountServlet",urlPatterns = "/display-discount")
public class DiscountAmountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String description = request.getParameter("description");
    float listprice = Float.parseFloat(request.getParameter("listprice"));
    int discount = Integer.parseInt(request.getParameter("discount"));
    float discountamount = (float) (listprice*discount*0.1);
    float discountprice = listprice - discountamount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> description:" + description + "<h2><br>");
        writer.println("<h2> discountamount:"+discountamount+"<h2><br>");
        writer.println("<h2> discountprice:"+discountprice+"<h2><br>");
        writer.println("<h2> listprice:"+listprice+"<h2><br>");
        writer.println("<h2> discount:"+discount+"<h2><br>");
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
