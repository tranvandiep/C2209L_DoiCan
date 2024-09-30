/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gokisoft.test01.servlets;

import com.gokisoft.test01.entities.Products;
import com.gokisoft.test01.sessions.ProductSessionBeanLocal;
import jakarta.ejb.EJB;
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
public class ProductServlet extends HttpServlet {
    @EJB
    private ProductSessionBeanLocal productSessionBean;
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
        //Lay danh sach san pham ra
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
//        ProductsJpaController controller = new ProductsJpaController(factory);
//        
//        List<Products> dataList = controller.findProductsEntities();
        List<Products> dataList = productSessionBean.findProductsEntities();
        
        request.setAttribute("dataList", dataList);
        
        RequestDispatcher rd = request.getRequestDispatcher("/product/index.jsp");
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
