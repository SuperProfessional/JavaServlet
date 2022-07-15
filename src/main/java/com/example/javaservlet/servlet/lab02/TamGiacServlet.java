package com.example.javaservlet.servlet.lab02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet({"/tam-giac", "/dien-tich", "/chu-vi"})
public class TamGiacServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/htg/tam-giac.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            double cv = (a+b+c);
            String uri = request.getRequestURI();
            if (uri.contains("dien-tich")){
                double dt = Math.sqrt(cv * (cv- c) * (cv- b) * (cv- a));
                request.setAttribute("message","Diện tích của tam giác là "+dt);
            }else {
                request.setAttribute("message","Chu vi của tam giác là "+ cv );
            }
        } else {
            request.setAttribute("message", "Không thỏa mãn cách cạnh của một tam giác!");
        }
        request.getRequestDispatcher("/views/htg/tam-giac.jsp").forward(request, response);
    }
}
