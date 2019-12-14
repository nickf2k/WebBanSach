package com.nmcnpm.nhom16.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Register", urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("HomePage.j");
//        dispatcher.forward(request,response);
          String nameCustomer = request.getParameter("NameCustomer");
          String email = request.getParameter("Email");
          String user = request.getParameter("User");
          String pass = request.getParameter("Pass");
          String address = request.getParameter("Address");
          String phone = request.getParameter("Phone");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
