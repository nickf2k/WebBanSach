package com.nmcnpm.nhom16.controller;

import com.nmcnpm.nhom16.entities.Book;
import com.nmcnpm.nhom16.entities.Item;
import com.nmcnpm.nhom16.entities.SessionOrder;
import com.nmcnpm.nhom16.service.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "AddToCard", urlPatterns = "/addtocard")
public class AddToCard extends HttpServlet {
    Book book;
    BookService bookService;

    public AddToCard() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session  = request.getSession();
        if (session.getAttribute("user") != null) {
            String errorString = null;
            bookService = new BookService();
            int quantity = 1;
            Book book = null;
            int id;
            //        HttpSession session  = request.getSession();
            List<Item> listItems = (List<Item>) session.getAttribute("listItems");
            Item item = new Item();
            String str_amount = request.getParameter("quantity");
            int int_amount = Integer.parseInt(str_amount);
            String idBook = request.getParameter("custId");
            if(int_amount <= 0 & int_amount > 50){
                System.out.println("số lượng không thỏa mãn, vui lòng nhập lại");
            }

            int id_book = Integer.parseInt(idBook);
            book = bookService.getBookByID(id_book);
            String str_price = book.getPrice();
            quantity = Integer.parseInt(str_amount);
            int price = Integer.parseInt(str_price);
            item.setQuantity(quantity);
            item.setBook(book);
            if (listItems == null) {
                listItems = new ArrayList<Item>();
                listItems.add(item);
            } else {
                for (Item i : listItems) {
                    if (i.getBook().getIdBook() == book.getIdBook()) {
                        i.setQuantity(i.getQuantity() + quantity);
                    }
                }
                listItems.add(item);

            }
            session.setAttribute("listItems", listItems);
            int len = listItems.size();
            response.sendRedirect("HomePage.jsp");
        }else {
            response.sendRedirect("HomePage.jsp");
        }
    }
}
