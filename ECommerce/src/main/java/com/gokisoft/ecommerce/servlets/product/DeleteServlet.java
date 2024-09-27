/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gokisoft.ecommerce.servlets.product;

import com.gokisoft.ecommerce.controllers.ProductsJpaController;
import com.gokisoft.ecommerce.controllers.exceptions.NonexistentEntityException;
import com.gokisoft.ecommerce.entities.Products;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dieptv
 */
public class DeleteServlet extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        
        //Lay danh sach san pham ra
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        ProductsJpaController controller = new ProductsJpaController(factory);
        
        Products p = controller.findProducts(id);
        
        request.setAttribute("product", p);
        
        RequestDispatcher rd = request.getRequestDispatcher("/product/delete.jsp");
        rd.forward(request, response);
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
        int id = Integer.parseInt(request.getParameter("id"));
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        ProductsJpaController controller = new ProductsJpaController(factory);
        
        try {
            controller.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EditServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect(request.getContextPath() + "/product/list");
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
