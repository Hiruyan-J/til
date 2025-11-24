import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/register3")
public class RegisterServlet3 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    req.setCharacterEncoding("utf-8");

    String age = req.getParameter("age");
    if(age.equals("child")){
      age = "18çŒñ¢ñû";
    } else {
      age = "18çŒà»è„";
    }
    req.setAttribute("age", age);

    String langs = "";
    String[] lang = req.getParameterValues("lang");
    for(int i = 0; i < lang.length; i++){
      langs = langs + lang[i] + " ";
    }
    req.setAttribute("langs", langs);
    
    RequestDispatcher rd = req.getRequestDispatcher("/register3.jsp");
    rd.forward(req, res);
  }
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}





