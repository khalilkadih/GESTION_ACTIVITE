package com.pdaProjet.Servlet;

import com.pdaProjet.Entitys.Exercices;
import com.pdaProjet.Entitys.StatusEnum;
import com.pdaProjet.Service.ExerciceService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "exercice",urlPatterns = {"/exercice/add","/exercice","/exercice/update","/exercice/delete" })
public class ExerciceServlet extends HttpServlet {
    ExerciceService exercieService= new ExerciceService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path= req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/exercice/add":
                this.getServletContext().getRequestDispatcher("/WEB-INF/exercice/addexercice.jsp").forward(req,resp);
                break;
            case "/exercice" :

                req.setAttribute("exercice",exercieService.showAllExercicese());
                this.getServletContext().getRequestDispatcher("/WEB-INF/exercice/exercice.jsp").forward(req,resp);
                break;
            case "/exercice/update" :
                String exerciceID=req.getParameter("id");
                Exercices ex=exercieService.findEntity(Long.parseLong(exerciceID));

                req.setAttribute("ex",ex);


                this.getServletContext().getRequestDispatcher("/WEB-INF/exercice/update.jsp").forward(req,resp);
                break;
            case "/exercice/delete" :
                exercieService.delete(Long.parseLong(req.getParameter("id")));
                resp.sendRedirect(req.getContextPath()+"/exercice?message=delete success");
                break;
            default:
                resp.getWriter().println("Route Not Found !!!!!!");
                resp.sendRedirect("/WEB-INF//exercice");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path= req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/exercice/add":

                String anne=req.getParameter("anne");
                String date_debut = req.getParameter("date_debut");
                String date_fin = req.getParameter("date_fin");
                String status=req.getParameter("status");
                Exercices exercices = new Exercices();
                exercices.setDate_debut(date_debut);
                exercices.setAnnee(date_fin);
                exercices.setAnnee(anne);
                exercices.setStatu(StatusEnum.DONE);


                 exercieService.addExercicese(exercices);
/*
                req.getRequestDispatcher("/WEB-INF/exercice/exercice.jsp").forward(req,resp);
*/
                resp.sendRedirect("/pdaLastVersion_war_exploded/exercice");
                break;

            case "/exercice/update" :

                String exerciceId=req.getParameter("id");
                Exercices exercicesToUpdate=exercieService.findEntity(Long.parseLong(exerciceId));
                exercicesToUpdate.setDate_debut(req.getParameter("date_debut"));
                exercicesToUpdate.setDate_fin(req.getParameter("date_fin"));
                exercicesToUpdate.setAnnee(req.getParameter("titre"));
                exercicesToUpdate.setStatu(StatusEnum.values()[Integer.parseInt(req.getParameter("status"))]);
                exercieService.updateExercicese(exercicesToUpdate);

                resp.sendRedirect(req.getContextPath()+"/exercice?message=update success");

                break;

            default:
                resp.getWriter().println("Route Not Found !!!!!!");
        }
        PrintWriter out= resp.getWriter();


    }

}




















