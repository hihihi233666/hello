package com.test.web;

import com.test.pojo.CangKu;
import com.test.service.CangKuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateCangKuServlet")
public class updateCangKuServlet extends HttpServlet {
    private CangKuService service = new CangKuService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String num=request.getParameter("num");
        String storage = request.getParameter("storage");
        //封装对象
        CangKu cangku = new CangKu();
        cangku.setNum(Integer.parseInt(num));
        cangku.setStorage(storage);
        service.update(cangku);
        request.getRequestDispatcher("/selectAllCangKu").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
