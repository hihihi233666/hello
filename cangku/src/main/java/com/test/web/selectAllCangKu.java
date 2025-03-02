package com.test.web;

import com.test.pojo.CangKu;
import com.test.service.CangKuService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllCangKu")
public class selectAllCangKu extends HttpServlet {
    private CangKuService service = new CangKuService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<CangKu> cls = service.selectAll();
        //存入request域中
        request.setAttribute("cls",cls);
        //转发
        request.getRequestDispatcher("/printList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
