package pl.coderslab.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.StringTokenizer;

@WebServlet("/Post2")
public class Post2 extends HttpServlet {

    private String[] badWords = {"cholera", "kurwa", "chuj"};


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        String text = request.getParameter("text");
        String agree = request.getParameter("agree");

        if (!"on".equals(agree)){
            StringBuilder textCensored = new StringBuilder();
            StringTokenizer tokenizer = new StringTokenizer(text);
            while (tokenizer.hasMoreTokens()){
                String word = tokenizer.nextToken();
                if (isBadWord(word)){
                    String stars = getStars(word);
                    textCensored.append(stars).append(" ");
                } else  {
                    textCensored.append(word).append(" ");
                }
            }
            response.getWriter().append(textCensored.toString());
            return;
        }

    response.getWriter().append(text);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("jestem w metodzie doGet a chyba nie powinienem");
    }


    private boolean isBadWord(String word) {
        for (String elem : badWords) {
            if (elem.equals(word)){
                return true;
            }
        }
    return false;
    }

    private String getStars(String word) {
        StringBuilder stars = new StringBuilder();
        for(int i =0; i<word.length(); i++ ) {
            stars.append("*");
        }
        return  stars.toString();
    }


}
