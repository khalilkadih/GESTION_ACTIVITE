package com.pdaProjet.Servlet;

import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Entitys.EtatEnum;
import com.pdaProjet.Service.ActiviteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "activite",urlPatterns = {"/activities/add","/activities","/activities/update","/activities/delete" })
public class ActiviteServlet extends HttpServlet {
    ActiviteService activiteService = new ActiviteService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getServletContext().getRequestDispatcher("/WEB-INF/addActivite.jsp").forward(req,resp);

        String path= req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/activities/add":
                this.getServletContext().getRequestDispatcher("/WEB-INF/activite/addActivite.jsp").forward(req,resp);
                break;
            case "/activities" :

                req.setAttribute("activities",activiteService.showAllActivite());
                this.getServletContext().getRequestDispatcher("/WEB-INF/activite/activite.jsp").forward(req,resp);
                break;
            case "/activities/update" :
                String activiteId=req.getParameter("id");
                 Activite act=activiteService.findEntity(Long.parseLong(activiteId));
                 req.setAttribute("act",act);

                this.getServletContext().getRequestDispatcher("/WEB-INF/activite/Update.jsp").forward(req,resp);
                break;
                case "/activities/delete" :
                    activiteService.delete(Long.parseLong(req.getParameter("id")));
                    resp.sendRedirect(req.getContextPath()+"/activities?message=update success");

                    break;

            default:
                resp.sendRedirect("/WEB-INF//activities");
                resp.getWriter().println("Route Not Found !!!!!!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path= req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/activities/add":

                        String titre=req.getParameter("titre");
                        String description = req.getParameter("description");
                        String date_debut = req.getParameter("date_debut");
                        String date_fin = req.getParameter("date_fin");

                        Activite activite = new Activite();

                        activite.setDate_debut(date_debut);
                        activite.setDate_defin(date_fin);
                        activite.setTitre(titre);
                        activite.setDescription(description);
                        activite.setEtat(EtatEnum.values()[Integer.parseInt(req.getParameter("etat"))]);
                        new ActiviteService().addActivite(activite);
                        //req.getRequestDispatcher("/pdaLastVersion_war_exploded/activities").forward(req,resp);
                resp.sendRedirect("/pdaLastVersion_war_exploded/activities");
                break;

            case "/activities/update" :
                String activiteId=req.getParameter("id");
                Activite activiteToUpdate=activiteService.findEntity(Long.parseLong(activiteId));
                activiteToUpdate.setDate_debut(req.getParameter("date_debut"));
                activiteToUpdate.setDate_defin(req.getParameter("date_fin"));
                activiteToUpdate.setTitre(req.getParameter("titre"));
                activiteToUpdate.setDescription( req.getParameter("description"));
                activiteToUpdate.setEtat(EtatEnum.values()[Integer.parseInt(req.getParameter("etat"))]);
                activiteService.updateActivite(activiteToUpdate);
                resp.sendRedirect(req.getContextPath()+"/activities?message=update success");
                break;

            default:
                resp.getWriter().println("Route Not Found !!!!!!");
        }
        PrintWriter out= resp.getWriter();


    }

}




















