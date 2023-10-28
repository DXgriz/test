package com.cyber.defns.controllers;

import com.cyber.defns.entities.User;
import com.cyber.defns.session.UserFacadeLocal;
import java.io.IOException;
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
public class LoginServlet extends HttpServlet {

    @EJB
    private UserFacadeLocal userFacade;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        try{
            
            User user = findMathichingUser(username);
            
            if(verifyUserPassword(user, password))
            {
                response.sendRedirect("DashboardServlet.do");
            }else
            {
               request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
            session.setAttribute("user", user);
            System.out.println("Login success");
        
        }catch(NullPointerException ex)
        {
            System.out.println("User not found ");
            // direct to loginPage
        }
    
    }
    private User findMathichingUser(String email)
    {
        User matchingUser = new User();
        for(User user : userFacade.findAll())
        {
            if(user.getEmailAddress().equalsIgnoreCase(email))
            {
                matchingUser = user;
                break;
            }
        }
        
        return matchingUser;
    }
    private boolean verifyUserPassword(User user,String password)
    {
        return user.getPassword().equals(password);
    }
    }

