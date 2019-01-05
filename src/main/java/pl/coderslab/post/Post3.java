package pl.coderslab.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Post3")
public class Post3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String numberA = request.getParameter("a");
        String numberB = request.getParameter("b");
        String numberC = request.getParameter("c");

        int sum =0;

        sum  = Integer.valueOf(numberA) + Integer.valueOf(numberB) + Integer.valueOf(numberC);

        response.getWriter().append(String.valueOf(sum));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
