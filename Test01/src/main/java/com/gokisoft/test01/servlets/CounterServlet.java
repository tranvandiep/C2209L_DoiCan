/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gokisoft.test01.servlets;

import com.gokisoft.test01.entities.Products;
import com.gokisoft.test01.sessions.CounterSessionBeanLocal;
import jakarta.ejb.EJB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author dieptv
 */
public class CounterServlet extends HttpServlet {

    @EJB
    private CounterSessionBeanLocal counterSessionBean;

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
        int counter = counterSessionBean.increments();
        request.setAttribute("counter", counter);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        TypedQuery<Products> query = em.createNamedQuery("Products.findAll", Products.class);
        List<Products> dataList = query.getResultList();
        
        for (Products products : dataList) {
            System.out.println(products);
        }
        
        em.getTransaction().commit();

        RequestDispatcher rd = request.getRequestDispatcher("counter.jsp");
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
