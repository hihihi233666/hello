package com.test.web;

import com.test.pojo.CangKu;
import com.test.service.CangKuService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addCangKuServlet")
public class addCangKuServlet extends HttpServlet {
    private CangKuService service = new CangKuService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("num");
        String call = request.getParameter("call");
        String manager = request.getParameter("manager");
        String lei = request.getParameter("lei");
        String position = request.getParameter("position");
        String storage = request.getParameter("storage");

        CangKu cangku = new CangKu();
        cangku.setNum(Integer.parseInt(num));
        cangku.setCall(Integer.parseInt(call));
        cangku.setManager(manager);
        cangku.setLei(lei);
        cangku.setPosition(position);
        cangku.setStorage(storage);


        System.out.println("dnwidji");
        service.add(cangku);
        request.getRequestDispatcher("/selectAllCangKu").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

