package com.example.javaservlet.utility;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

public class Mkdir {

    public static File mkdirUpload(HttpServletRequest request){
        // Đường dẫn thư mục tính từ gốc của website
        File dir = new File(request.getServletContext().getRealPath("/upload"));
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }
}
