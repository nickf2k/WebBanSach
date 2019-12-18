package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Orderr;
import com.nmcnpm.nhom16.service.CustomerService;
import com.nmcnpm.nhom16.service.ICustomerService;
import com.nmcnpm.nhom16.service.IOrderService;
import com.nmcnpm.nhom16.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "TotalPay", urlPatterns ="/totalpay")
public class TotalPay extends HttpServlet {
    ICustomerService customerService;
    IOrderService orderService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        customerService = new CustomerService();
        orderService = new OrderService();
        String phone = request.getParameter("phone");
        String address = request.getParameter("Address");
        String paymentMethods = request.getParameter("paymentMethods");
        String totalMoney = request.getParameter("totalMoney");
        String user = (String) request.getSession().getAttribute("user");
        int idCustomer = customerService.getIDFromUser(user);
        java.sql.Date date = null;
        String idOrder = date+user+"/"+idCustomer;
        Orderr orderr = new Orderr(idOrder,idCustomer,date,address,totalMoney);
        orderService.saveOrder(orderr);
        response.sendRedirect("HomePage.jsp");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
