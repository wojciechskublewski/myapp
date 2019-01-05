package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get63")
public class Get63 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String year = request.getParameter("year");
        String mix = request.getParameter("mix");

        int finalYear = Integer.valueOf(year) + Integer.valueOf(mix);

        response.getWriter().append("Rok to: ").append(String.valueOf(finalYear));

    }
}
