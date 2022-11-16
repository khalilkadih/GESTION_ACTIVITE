package com.pdaProjet.Servlet;

import com.pdaProjet.Service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/activite")
public class Login extends HttpServlet {
    private UserService auth;
    @Override
    public void init() {
        auth = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  this.getServletContext().getRequestDispatcher("/WEB-INF/activite/activities").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        out.println(email+" "+password);

        System.out.println(auth.login(email, password));
        if (auth.login(email, password) == 1){
            long userId = new UserService().findByEmail(email).getId_user();
            HttpSession session = request.getSession();
            session.setAttribute("UserId" , userId );

            //this.getServletContext().getRequestDispatcher("/WEB-INF/activite").forward(request,response);


            response.sendRedirect("/pdaLastVersion_war_exploded/activities");

        } else {

            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.include(request,response);
            response.sendRedirect("/pdaLastVersion_war_exploded");
        }
    }
}
