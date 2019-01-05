package pl.coderslab.get;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get3")
public class Get3 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        int widthNum = 5;
        int heightNum = 10;

        String width = request.getParameter("width");
        String height = request.getParameter("height");


        try {
            if (StringUtils.isNotBlank(width) && StringUtils.isNotBlank(height)) {
                widthNum = Integer.parseInt(width);
                heightNum =Integer.parseInt(height);
            }
        } catch (NumberFormatException e) {
            response.getWriter().append("Podano zle warunki wstepne");
        }


        for (int i = 1; i<= widthNum; i++) {
            for (int j =1; j<=heightNum; j++) {
                response.getWriter().append(String.valueOf(i))
                        .append(" * ")
                        .append(String.valueOf(j))
                        .append(" = ")
                        .append(String.valueOf(i*j))
                        .append("<br>");
            }
            response.getWriter().append("<br>");

        }

    }
}
