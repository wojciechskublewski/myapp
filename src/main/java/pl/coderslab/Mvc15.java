package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Mvc15")
public class Mvc15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();

        List<Book> books = (List<Book>) session.getAttribute("books");

        if (books == null ) {
            books = new ArrayList<>();
        }

        String title = request.getParameter("title");
        String  author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        Book book = new Book(title,author,isbn);
        books.add(book);

        session.setAttribute("books",books);

        response.sendRedirect("/Mvc153");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp13.jsp").forward(request, response);
    }
}
