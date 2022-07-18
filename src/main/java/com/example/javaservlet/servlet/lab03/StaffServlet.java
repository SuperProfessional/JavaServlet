package com.example.javaservlet.servlet.lab03;

import com.example.javaservlet.model.lab03.Staff;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@WebServlet("/staff")
public class StaffServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        request.getRequestDispatcher("/views/lab03/staff/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
	            /* Thiết lập định dạng thời gian để BeanUtils căn cứ
	            trong việc chuyển đổi kiểu thời gian */
            DateTimeConverter timeConverter = new DateConverter(new Date());
            timeConverter.setPattern("MM/dd/yyyy");
            ConvertUtils.register(timeConverter, Date.class);

            Staff staff = new Staff();
            // Đọc tham số vào các thuộc tính của bean staff
            BeanUtils.populate(staff, request.getParameterMap());

            // Chia sẻ với result.jsp
            request.setAttribute("staff",staff);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/views/lab03/staff/result.jsp").forward(request, response);
    }
}
