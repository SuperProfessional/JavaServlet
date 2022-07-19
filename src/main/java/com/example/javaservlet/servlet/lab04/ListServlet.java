package com.example.javaservlet.servlet.lab04;

import com.example.javaservlet.model.lab04.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> list = Arrays.asList(new Item[]{
                new Item("Nokia", "https://cdn.cellphones.com.vn/media/catalog/product/cache/7/thumbnail/9df78eab33525d08d6e5fb8d27136e95/n/o/nokia-c21-plus-600x600_2_1.jpg", 500, 0.1),
                new Item("Samsung", "https://cdn.tgdd.vn/Products/Images/42/274360/samsung-galaxy-a13-xanh-thumb-1-600x600.jpg", 700, 0.15),
                new Item("iPhone", "https://cdn1.viettelstore.vn/images/Product/ProductImage/medium/296834586.jpeg", 900, 0.25),
                new Item("Sony", "https://didongviet.vn/pub/media/catalog/product//s/o/sony-xperia-1-64gb-likenew-didongviet.jpg", 55, 0.3),
                new Item("seamen", "https://ih1.redbubble.net/image.3546115385.2117/icr,iphone_13_soft,back,a,x600-pad,600x600,f8f8f8.jpg", 70, 0.5),
                new Item("Oppo", "https://cdn1.viettelstore.vn/images/Product/ProductImage/medium/1599441352.jpeg", 200, 0.2),
        });
        request.setAttribute("list",list);

        request.getRequestDispatcher("/views/lab04/list/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
