package com.nmcnpm.nhom16.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/form")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<form action = '/WebsiteProject/Trang_chu' method = 'post'> " );
        printWriter.println("ten: <input type='text' name = 'ten'>");
        printWriter.println("tuoi: <input type='text' name = 'tuoi'>");
        printWriter.println("dia chi: <input type='text' name = 'diachi'>");
        printWriter.println("<input type='submit' value = 'xac nhan'>");
        printWriter.println("</form>");

    }
}
