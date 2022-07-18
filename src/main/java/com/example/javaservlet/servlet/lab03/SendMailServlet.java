package com.example.javaservlet.servlet.lab03;

import com.example.javaservlet.utility.Mailer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SendEmailServlet
 */
@WebServlet("/send-mail")
public class SendMailServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        request.getRequestDispatcher("/views/lab03/send-mail/form.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String to = request.getParameter("to");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");

        Boolean sendMail = Mailer.send(to,subject,content);

		request.getRequestDispatcher("/views/lab03/send-mail/form.jsp").forward(request, response);
    }

}
