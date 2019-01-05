package pl.coderslab.simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

@WebServlet("/Servlet16")
public class Servlet16 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        PrintWriter writer = response.getWriter();


        writer.append(LocalTime.now().toString());
        String str = request.getHeader("User-Agent");
        writer.append(str);


    }
}
