package com.nmcnpm.nhom16.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TotalPay", urlPatterns ="/totalpay")
public class TotalPay extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String Address = request.getParameter("Address");
        String paymentMethods = request.getParameter("paymentMethods");
        String totalMoney = request.getParameter("totalMoney");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
