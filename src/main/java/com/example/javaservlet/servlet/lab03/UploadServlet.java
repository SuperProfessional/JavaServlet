package com.example.javaservlet.servlet.lab03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        request.getRequestDispatcher("/views/upload/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // đường dẫn thư mục tính từ gốc của website
        File dir = new File(request.getServletContext().getRealPath("/upload"));
        if (!dir.exists()) { // tạo nếu chưa tồn tại
            dir.mkdirs();
        }

        // lưu các file upload vào thư mục files
        Part photo = request.getPart("photo"); // file hình
        File photoFile = new File(dir, photo.getSubmittedFileName());
        photo.write(photoFile.getAbsolutePath());
        Part doc = request.getPart("docx"); // file tài liệu
        File docFile = new File(dir, doc.getSubmittedFileName());
        doc.write(docFile.getAbsolutePath());

        // chia sẻ cho result.jsp để hiển thị
        request.setAttribute("img", photoFile);
        request.setAttribute("doc", docFile);

        request.getRequestDispatcher("/views/upload/result.jsp").forward(request, response);
    }
}
