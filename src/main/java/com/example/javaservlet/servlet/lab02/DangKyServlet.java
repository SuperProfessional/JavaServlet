package com.example.javaservlet.servlet.lab02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/dang-ky")
public class DangKyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        request.getRequestDispatcher("/views/lab02/dang-ky/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Boolean gender = Boolean.valueOf(request.getParameter("gender"));
        Boolean married = Boolean.valueOf(request.getParameter("married"));
        String country = request.getParameter("country");
        String notes = request.getParameter("notes");
        String[] hobbies = request.getParameterValues("hobbies");

        String soThich = "";
        for (int i =0 ;i < hobbies.length ; i++){
           String a = hobbies[i];
          switch (a){
              case "R":
                  soThich = soThich + "Đọc sách ";
                  break;
              case "T":
                  soThich = soThich + "Du lịch ";
                  break;
              case "M":
                  soThich = soThich + "Âm nhạc ";
                  break;
              default:
                  soThich = soThich + "Khác ";
                  break;
          }
        }

        System.out.println("Hobbies : " + hobbies);

        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("gender", gender);
        request.setAttribute("married", married);
        request.setAttribute("country", country);
        request.setAttribute("notes", notes);
        request.setAttribute("hobbies", soThich);

        request.getRequestDispatcher("/views/lab02/dang-ky/result.jsp").forward(request, response);
    }
}
