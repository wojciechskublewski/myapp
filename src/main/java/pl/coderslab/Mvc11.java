package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Mvc11")
public class Mvc11 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String role = request.getParameter("role");
        request.setAttribute("test", "test");
        getServletContext().getRequestDispatcher("/jsp11.jsp").forward(request, response);

    }
}
