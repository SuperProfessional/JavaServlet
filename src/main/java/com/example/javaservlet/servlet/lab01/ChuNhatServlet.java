package com.example.javaservlet.servlet.lab01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/chu-nhat")
public class ChuNhatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/hcn/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float dai = Float.parseFloat(request.getParameter("dai"));
        float rong = Float.parseFloat(request.getParameter("rong"));

        float chuVi = (dai + rong)*2;
        float dienTich = dai * rong;

        request.setAttribute("cv",chuVi);
        request.setAttribute("dt",dienTich);

        request.getRequestDispatcher("/views/hcn/success.jsp").forward(request,response);
    }
}
