package pl.coderslab.get;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");
         if (StringUtils.isBlank(start) || StringUtils.isBlank(end) ) {
             response.getWriter().append("Brak podanych paramentrow start i end");
             return;
         }

        try {
            int startNumber = Integer.parseInt(start);
            int endNumber = Integer.parseInt(end);

            for (int i =startNumber; i<=endNumber; i++) {
                response.getWriter().append(String.valueOf(i)).append( ", ");
            }
        } catch (NumberFormatException e) {
            response.getWriter().append("Wymagane liczby");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
