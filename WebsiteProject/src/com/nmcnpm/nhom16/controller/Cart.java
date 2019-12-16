package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.service.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Display", urlPatterns = "/display")
public class Cart extends HttpServlet {
    private BookService bookService;
    @Override
    public void init() throws ServletException{
        bookService = new BookService();
        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/cart.jsp");
//        dispatcher.forward(request, response);
        HttpSession session  = request.getSession();
//        listItems = session.getAttribute("listItems");
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cart.jsp");
        dispatcher.forward(request, response);
    }
}
