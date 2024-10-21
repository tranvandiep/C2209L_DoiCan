/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gokisoft.company.servlets;

import com.gokisoft.company.entities.Company;
import com.gokisoft.company.session.CompanySessionBeanLocal;
import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author dieptv
 */
public class DeleteCompanyServlet extends HttpServlet {
    @EJB
    private CompanySessionBeanLocal companyBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt((String) request.getAttribute("id"));
        Company company = companyBean.findById(id);
        
        request.setAttribute("company", company);
        
        RequestDispatcher rd = request.getRequestDispatcher("/company/delete.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt((String) request.getAttribute("id"));
        
        companyBean.delete(id);
        
        response.sendRedirect("ListCompanyServlet");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
