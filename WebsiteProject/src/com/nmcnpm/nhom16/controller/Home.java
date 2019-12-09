package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.service.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MyServlet", urlPatterns = {"/home"})
public class Home extends HttpServlet {
    BookService bookService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setAttribute("HomePage.jsp",list);
//        request.setAttribute("HomePage.jsp",bookService.getAllBook());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("HomePage.jsp");
        requestDispatcher.forward(request, response);
    }
}
