import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayHTMLServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String filePath = getServletContext().getRealPath("/index.html"); 
        File file = new File(filePath);

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
            reader.close();
        } else {
            out.println("<h1>Error: HTML file not found!</h1>");
        }
    }
}
