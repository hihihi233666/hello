package com.test.web;

import com.test.pojo.User;
import com.test.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login2Servlet")
public class login2Servlet extends HttpServlet {
    private LoginService service = new LoginService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置字符编码
        req.setCharacterEncoding("utf-8");
        //2.接收user数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user=service.login(username,password);

        if(user != null  ){
            //登录成功
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            String contextPath = req.getServletContext().getContextPath();
            req.getRequestDispatcher("/CangKu.html").forward(req,resp);
        }else{
            //登录失败
            req.setAttribute("login_msg","用户名或密码错误");
            req.getRequestDispatcher("/login2.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}