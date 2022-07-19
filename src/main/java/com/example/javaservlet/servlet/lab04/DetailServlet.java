package com.example.javaservlet.servlet.lab04;

import com.example.javaservlet.model.lab04.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Item item = new Item("Nokia 2020", "https://vuavida.net/wp-content/uploads/2018/07/IMG_6796.jpg", 500, 0.1);
        request.setAttribute("item", item);
        request.getRequestDispatcher("/views/lab04/item/detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
