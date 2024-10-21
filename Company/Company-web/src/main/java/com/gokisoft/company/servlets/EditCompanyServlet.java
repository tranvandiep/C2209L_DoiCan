/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gokisoft.company.servlets;

import com.gokisoft.company.entities.Company;
import com.gokisoft.company.session.CompanySessionBeanLocal;
import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author dieptv
 */
public class EditCompanyServlet extends HttpServlet {
    @EJB
    private CompanySessionBeanLocal companyBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt((String) request.getAttribute("id"));
        Company company = companyBean.findById(id);
        
        request.setAttribute("company", company);
        
        RequestDispatcher rd = request.getRequestDispatcher("/company/edit.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt((String) request.getAttribute("id"));
        String name = (String) request.getAttribute("name");
        String companyKey = (String) request.getAttribute("company_key");
        String description = (String) request.getAttribute("description");
        String address = (String) request.getAttribute("address");
        int enabled = Integer.parseInt((String) request.getAttribute("enabled"));
        
        Company company = new Company();
        company.setName(name);
        company.setCompanyKey(companyKey);
        company.setDescription(description);
        company.setAddress(address);
        company.setEnabled(enabled);
        company.setId(id);
        
        companyBean.update(company);
        
        response.sendRedirect("ListCompanyServlet");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
