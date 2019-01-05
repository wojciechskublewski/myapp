package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get5")
public class Get5 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        String company = request.getParameter("company");
        String[] learn = request.getParameterValues("learn");


        response.getWriter().append("company: <br>")
                .append(company).append("<br>")
                .append("learn: <br>");

        for (String value : learn) {
            response.getWriter().append(value).append("<br>");
        }




    }
}
