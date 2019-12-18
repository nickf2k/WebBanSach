package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Customer;
import com.nmcnpm.nhom16.service.AdminService;
import com.nmcnpm.nhom16.service.CustomerService;
import com.nmcnpm.nhom16.service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class Login extends HttpServlet {
    ICustomerService customerService;
    AdminService adminService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        customerService = new CustomerService();
        adminService = new AdminService();
        HttpSession session  = request.getSession();
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        boolean isAdmin = adminService.isAdmin(user,password);
        if (isAdmin){
            session.setAttribute("user",user);
            session.setAttribute("password",password);
            response.sendRedirect("AdminHomePage.jsp");
            return;
        }
        else {
            boolean checkLogin = customerService.checkLogin(new Customer(user, password));
//        session.setAttribute("user",user);
            System.out.println(checkLogin);
            if (checkLogin) {
                session.setAttribute("user", user);
                session.setAttribute("password", password);
                response.sendRedirect("HomePage.jsp");
            } else {
                response.sendRedirect("Login.jsp?err=1");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
