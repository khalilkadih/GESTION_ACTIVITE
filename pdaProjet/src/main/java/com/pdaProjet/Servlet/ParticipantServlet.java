package com.pdaProjet.Servlet;

import com.pdaProjet.Entitys.Participants;
import com.pdaProjet.Service.ParticpantService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "particpant", urlPatterns = {"/participant","/participant/add","/participant/update","/participant/delete"})
public class ParticipantServlet  extends HttpServlet {
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ParticpantService particpantService= new ParticpantService();

        //req.getServletContext().getRequestDispatcher("/WEB-INF/participant/participant.jsp").forward(req,resp);
        String path=req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/participant/add":
                req.getServletContext().getRequestDispatcher("/WEB-INF/participant/addParticipant.jsp").forward(req,resp);
                break;
                case "/participant":
                    req.setAttribute("part",particpantService.showALLPartcicpant());
                   // resp.getWriter().println(particpantService.showALLPartcicpant().get(0).getDomaine());
                    this.getServletContext().getRequestDispatcher("/WEB-INF/participant/participant.jsp").forward(req,resp);
                    break;
            case  "/participant/update":
                req.getServletContext().getRequestDispatcher("/WEB-INF/particpant/update").forward(req,resp);
                break;
            case "/participant/delete":
                new ParticpantService().delete(Long.parseLong(req.getParameter("id")));
                req.getServletContext().getRequestDispatcher("/WEB-INF/particpant").forward(req,resp);
                break;
            default: resp.sendRedirect("/WEB-INF/particpant");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path=req.getRequestURI().replace(req.getContextPath(),"");
        switch (path){
            case "/participant/add":
                Participants participants=new Participants();
                participants.setDomaine(req.getParameter("domaine"));
                participants.setStructure(req.getParameter("structure"));
                new ParticpantService().addParticpant(participants);
                req.getServletContext().getRequestDispatcher("/WEB-INF/participant/participant.jsp").forward(req,resp);
                break;
            case  "/participant/update":

                req.getServletContext().getRequestDispatcher("/WEB-INF/particpant/update").forward(req,resp);
                break;
            default:resp.getWriter().println("Something Wrong !!!!");
        }
    }
}
