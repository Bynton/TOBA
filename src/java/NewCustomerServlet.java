/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import business.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author bento
 */
public class NewCustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        if (firstName.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a first name.");
        String lastName = request.getParameter("lastName");
        if (lastName.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a last name.");
        String phone = request.getParameter("phone");
        if (phone.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a phone number.");
        String address = request.getParameter("address");
        if (address.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter an address.");
        String city = request.getParameter("city");
        if (city.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a city.");
        String state = request.getParameter("state");
        if (state.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a state.");
        String zipcode = request.getParameter("zipcode");
        if (zipcode.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a zipcode.");
        String email = request.getParameter("email");
        if (email.length() == 0)
            JOptionPane.showMessageDialog(null, "Please enter a email.");
        
        Customer customer = new Customer(firstName,lastName,phone,address,city,state,zipcode,email);
        
        response.sendRedirect("Success.html");
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
