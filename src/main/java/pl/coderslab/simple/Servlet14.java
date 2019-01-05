package pl.coderslab.simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("To sie wyswietla za kazdym razem");

    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To sie wyswietla tylko raz");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("close");
    }
}
