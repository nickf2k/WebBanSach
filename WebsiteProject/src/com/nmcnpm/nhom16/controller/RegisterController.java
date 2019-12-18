package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Customer;
import com.nmcnpm.nhom16.service.CustomerService;
import com.nmcnpm.nhom16.service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@WebServlet(name = "Register", urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    ICustomerService customerService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        customerService = new CustomerService();
        String nameCustomer = request.getParameter("NameCustomer");
        String email = request.getParameter("Email");
        String user = request.getParameter("User");
        String pass = request.getParameter("Pass");
        String address = request.getParameter("Address");
        String phone = request.getParameter("Phone");
//        String idCustomer = new Date().toString();
        Customer customer = new Customer(nameCustomer,phone,address,email,user,pass);
        customerService.register(customer);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
