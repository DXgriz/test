package com.cyber.defns.controllers;

import com.cyber.defns.entities.Admin;
import com.cyber.defns.entities.Course;
import com.cyber.defns.entities.Player;
import com.cyber.defns.entities.User;
import com.cyber.defns.session.CourseFacadeLocal;
import com.cyber.defns.session.GameStatsFacadeLocal;
import com.cyber.defns.session.PlayerFacadeLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vuyan
 */
public class DashboardServlet extends HttpServlet {

    @EJB
    private PlayerFacadeLocal playerFacade;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");
        
        if (user instanceof Player) {
            
            List<Course> coursesEnrolled = ((Player) user).getCourses();
            
            response.sendRedirect("playerdashboard.jsp");
        
            
        } else if(user instanceof Admin){
            response.sendRedirect("AdminPortal.jsp");
        }
    }
}
