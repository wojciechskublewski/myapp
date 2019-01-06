package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Mvc12")
public class Mvc12 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if (StringUtils.isBlank(start) || StringUtils.isBlank(end)) {
            response.getWriter().append("brak parametrow");
            return;
        }

        try {
            int startInt = Integer.parseInt(start);
            int endInt = Integer.parseInt(end);
            request.setAttribute("start", startInt+10);
            request.setAttribute("end", endInt+10);
            getServletContext().getRequestDispatcher("/jsp12.jsp").forward(request,response);
        } catch (NumberFormatException e) {
            System.out.println("Nie mozna skonwertowac do liczby");
        }

    }
}
