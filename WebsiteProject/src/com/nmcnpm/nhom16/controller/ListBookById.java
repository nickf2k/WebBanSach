package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.service.BookService;
import com.nmcnpm.nhom16.service.CategoryService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "ListBookById", urlPatterns = {"/listbook"})
public class ListBookById extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int idCategory = Integer.parseInt(id);
        BookService bookService = new BookService();
        List<Book> books = bookService.getBooksByIDCategory(idCategory);
        response.sendRedirect("listBook.jsp?id="+idCategory);


    }
}
