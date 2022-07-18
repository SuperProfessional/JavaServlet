package com.example.javaservlet.servlet.lab03;

import com.example.javaservlet.model.lab03.User;
import com.example.javaservlet.utility.CookieUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // đọc giá trị của cookie
        String username = CookieUtils.get("username", request);

        if (username != null && !username.equals("")){
            request.setAttribute("message","Đăng nhập thành công!");

            HttpSession session = request.getSession();
            session.setAttribute("username",username);
        }
        // chuyển sang login.jsp để hiển thị lên form
        request.setAttribute("username", username);
        request.getRequestDispatcher("/views/lab03/login/form.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
          User user = new User();

          BeanUtils.populate(user,request.getParameterMap());

          if (user.getUsername().equals("admin") && user.getPassword().equals("admin")){
              HttpSession session = request.getSession();

              session.setAttribute("username",user.getUsername());
              request.setAttribute("message","Đăng nhập thành công!");

              int hours = (user.isRemember() == false) ? 0 : 30 * 24; // 0 = xóa

              if(user.isRemember()){
                  CookieUtils.add("username", user.getUsername(), hours, response);
              }
          }else {
            request.setAttribute("message", "Sai thông tin đăng nhập!");
        }
      }catch (Exception e){
          e.printStackTrace();
      }
        request.getRequestDispatcher("/views/lab03/login/form.jsp").forward(request, response);

    }
}
