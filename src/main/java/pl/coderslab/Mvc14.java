package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();

        for (int i=1; i<6; i++) {
            String title = request.getParameter("title"+i);
            String author = request.getParameter("author"+i);
            String isbn = request.getParameter("isbn"+i);

            Book book = new Book(title, author, isbn);
            books.add(book);
        }
        request.setAttribute("books",books);
        getServletContext().getRequestDispatcher("/form14.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp14.jsp").forward(request, response);
    }
}
