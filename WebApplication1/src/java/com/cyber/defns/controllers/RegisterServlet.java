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
public class RegisterServlet extends HttpServlet {

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
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String addressLine = request.getParameter("line1");

        byte[] address = addressLine.getBytes();
        
        Long Id = Long.valueOf(request.getParameter("idNo"));
        Long cellNumber = Long.valueOf(request.getParameter("cell"));
        
        User user = generateUser(name, surname, email, address, Id, cellNumber);
        
        if (!userFacade.findAll().contains(user)) {
            
            userFacade.create(user);
            
            session.setAttribute("user", user);
            
            response.sendRedirect("DashboardServlet.do");
        } else {
        }
    }
    public User generateUser(String name, String surname, String email, byte[] address, Long id, Long cell){
      User user = new User();
      
      user.setName(name);
      user.setSurname(surname);
      user.setEmailAddress(email);
      user.setPhysicalAddress(address);
      user.setId(id);
      user.setCellNumber(cell);
      
      return user;
    }
}
