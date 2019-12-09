package com.nmcnpm.nhom16.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        if (user.equals("12")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.jsp");
            dispatcher.forward(request,response);
        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.include(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
