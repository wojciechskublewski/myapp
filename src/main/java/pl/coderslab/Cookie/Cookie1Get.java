package pl.coderslab.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieName = "User";

        for (Cookie cookie : cookies) {
            if  (cookieName.equals(cookie.getName())) {
                response.getWriter().append("wartosc ciasteczka: ").append(cookie.getValue());
                return;
            }
        }

        response.getWriter().append("nie ma ciasteczka: ").append(cookieName);
    }
}
