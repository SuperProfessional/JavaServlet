package com.example.javaservlet.servlet.lab03;

import com.example.javaservlet.model.lab03.StaffChild;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@MultipartConfig
@WebServlet("/staff-upload")
public class UploadAndBeanUtilsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/lab03/staff-upload/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Đường dẫn thư mục tính từ gốc của website
        File dir = com.example.javaservlet.utility.Mkdir.mkdirUpload(request);

        // lưu các file upload vào thư mục files
        Part photo = request.getPart("photo"); // file hình
        File photoFile = new File(dir, photo.getSubmittedFileName());
        photo.write(photoFile.getAbsolutePath());

        try {
            // Thiết lập định dạng thời gian để BeanUtils căn cứ trong việc chuyển đổi kiểu thời gian
            DateTimeConverter timeConverter = new DateConverter(new Date());
            timeConverter.setPattern("MM/dd/yyyy");
            ConvertUtils.register(timeConverter, Date.class);

            StaffChild staffChild = new StaffChild();
            // Đọc tham số vào các thuộc tính của bean staff
            BeanUtils.populate(staffChild, request.getParameterMap());
            staffChild.setPhoto(photoFile);

            // Chia sẻ với result.jsp
            request.setAttribute("staffChild", staffChild);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        request.getRequestDispatcher("/views/lab03/staff-upload/result.jsp").forward(request, response);
    }


}
