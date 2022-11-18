/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.external.external_exam_client.service;

import Entity.Customer;
import Entity.Garments;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 * @author Vivek
 */
@WebServlet(name = "RemoteServlet", urlPatterns = {"/RemoteServlet"})
public class RemoteServlet extends HttpServlet {

    @Inject @RestClient RemoteClient rc;
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
        Collection<Garments> gb = rc.getallgarments();
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RemoteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RemoteServlet at " + request.getContextPath() + "</h1>");
            for(Garments g: gb){
                if(g.getOrdersCollection().stream().findFirst().isPresent()){
                    Customer cust = g.getOrdersCollection().stream().findFirst().get().getCustomerid();
                    out.println("<p>Garment ID: " + g.getGarmentid() + "</p>");
                    out.println("<p>Category: " + g.getCategoryid().getCategoryname() + "</p>");
                    out.println("<p>Price: " + g.getPrice() +"</p>" );
                    out.println("<p>Customer Name: " + cust.getCustomerName() + "</p>");
                    out.println("<p>Customer Phone: " + cust.getMobile() + "</p>");
                    out.println("<p>Customer City: " + cust.getCity() + "</p>");
                }
            }
            out.println("</body>");
            out.println("</html>");
        }
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
