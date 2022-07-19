package com.example.javaservlet.servlet.lab04;

import com.example.javaservlet.model.lab03.Staff;
import com.example.javaservlet.model.lab04.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    //    private List<User> users = Arrays.asList(new User("Username 1", "Password 1", true),
//                new User("Username 2", "Password 2", false),
//                new User("Username 3", "Password 3", true));
    private List<User> users = new ArrayList<>();

    public UserServlet() {
        super();
       this.users.add(new User("NguyenHoan", "admin", false));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("form", this.users.get(0));
        request.setAttribute("items", this.users);

        request.getRequestDispatcher("/views/lab04/el/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User();
        try {
            BeanUtils.populate(user, request.getParameterMap());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        this.users.add(user);

        this.doGet(request, response);
    }
}
