package pl.coderslab.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/Post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        String[] tab = request.getParameterValues("numbers");

        List<Integer> numbers = new ArrayList<>();

        for (String str : tab) {
            try {
                int tmp = Integer.parseInt(str);
                numbers.add(tmp);
            } catch (NumberFormatException e) {
                System.out.println("Wartosc " + str + " nie jest liczba");
            }
        }
        Collections.sort(numbers);

        for (Integer i: numbers ) {
            response.getWriter().append(String.valueOf(i)).append("<br>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter writer = response.getWriter();



        Random random = new Random();

        writer.append(" <form method=\"post\">");


        int num = random.nextInt(6)+ 5;

        for (int i =0; i<num; i++) {
            writer.append("<input type= 'text' name='numbers' placeholder='podaj wartosc'><br/>");
        }

        writer.append("<input type='submit' value='send'>");
        writer.append("</form>");
    }
}
