package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.service.BookService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "Display", urlPatterns = "/display")
public class Cart extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(Cart.class.getName());
    private BookService bookService;
    @Override
    public void init() throws ServletException{
        bookService = new BookService();
        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session  = request.getSession();
        if (session.getAttribute("user") != null) {
            if (session.getAttribute("listItems") == null){
                LOGGER.info("Giỏ hàng rỗng");
            }else {
                RequestDispatcher dispatcher = request.getServletContext()
                        .getRequestDispatcher("/Cart.jsp");
                dispatcher.forward(request, response);
            }
        }else {
            response.sendRedirect("Login.jsp");
        }
    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        HttpSession session  = request.getSession();
//        if (session.getAttribute("user") != null) {
//            RequestDispatcher dispatcher = request.getServletContext()
//                    .getRequestDispatcher("Cart.jsp");
//            dispatcher.forward(request, response);
//        }else {
//            response.sendRedirect("Login.jsp");
//        }
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request, response);
        super.doPost(request, response);
    }
}
