import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionnaryServlet", urlPatterns = "/translate")
public class DictionnaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Map<String, String> dictionnary = new HashMap<>();
      dictionnary.put("love","tinh yeu");
      dictionnary.put("おもいだし","nho");
      dictionnary.put("かなしい","buon");
      dictionnary.put("しつあい","that tinh");
      dictionnary.put("あいしている","yeu");
      dictionnary.put("きらい","ghet");
      String search = request.getParameter("txtsearch");
      String resurt = dictionnary.get(search);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (resurt != null){
            writer.println("<h2>search: " + search + "<h2/>");
            writer.println("<br>");
            writer.println("<h2>key: " + resurt + "<h2/>");
        }else {
            writer.println("not fount");
        }
        writer.println("<html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
