package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.service.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BookServlet")
public class BookServlet extends HttpServlet {
    IBookService<Book> iBookService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
