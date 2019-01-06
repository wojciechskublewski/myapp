package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Sess01Get")
public class Sess01Get extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object counter = session.getAttribute("counter");

        if (counter==null) {
            response.getWriter().append("brak counter sesji");
        } else {
            int counterInt = (int) counter;
            response.getWriter().append("wartosc counter: ").append(String.valueOf(counterInt));
            session.setAttribute("counter",++counterInt);
        }
    }
}
