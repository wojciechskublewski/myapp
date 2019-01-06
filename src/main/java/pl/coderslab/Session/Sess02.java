package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mark = request.getParameter("mark");
        HttpSession session = request.getSession();
        response.setContentType("text/html; charset=utf-8");
        List<Integer> marks;

        if (session.getAttribute("marks")==null){
            marks = new ArrayList<>();
        } else {
            marks = (List<Integer>) session.getAttribute("marks");
        }

        int markInt = Integer.parseInt(mark);
        marks.add(markInt);
        session.setAttribute("marks",marks);

        response.getWriter().append("<form method='post'>")
                .append("<label>Ocene:")
                .append("<input type='number' name='mark'>")
                .append("</label>")
                .append("<br><br>")
                .append("<input type='submit' value='add'>")
                .append("</form>");
        response.getWriter().append("<br><br>")
                .append("Oceny")
                .append("<br>");
        for (Integer element : marks) {
            response.getWriter().append(String.valueOf(element)).append("<br>");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        response.getWriter().append("<form method='post'>")
                .append("<label>Ocene:")
                .append("<input type='number' name='mark'>")
                .append("</label>")
                .append("<br><br>")
                .append("<input type='submit' value='add'>")
                .append("</form>");
    }
}
