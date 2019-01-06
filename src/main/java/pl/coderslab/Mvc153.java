package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/Mvc153")
public class Mvc153 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>)session.getAttribute("books");
        if (books==null || books.isEmpty()) {
            response.getWriter().append("Brak ksiazek");
            return;
        }
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/form14.jsp").forward(request,response);
    }
}
