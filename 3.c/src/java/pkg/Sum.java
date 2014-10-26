package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        try {
            int sum = 0, num = Integer.parseInt(req.getParameter("num"));
            for(int i = 1; num >= i; i ++) {
                sum += (i * i);
            }
            pw.printf("Sum of square of (1 to %d) = %d", num, sum);
        } catch (NumberFormatException e){
            pw.write("Not a number !");
        }
        pw.print("<br/><a href='index.html'>Back</a>");
        pw.close();
    }

}
