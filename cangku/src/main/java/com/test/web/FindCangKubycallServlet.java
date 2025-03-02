package com.test.web;

import com.test.pojo.CangKu;
import com.test.service.CangKuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindCangKubycallServlet")
public class FindCangKubycallServlet extends HttpServlet {
    private CangKuService service = new CangKuService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String call = request.getParameter("call");
        CangKu cangku = service.Findbycall(Integer.parseInt(call));
        List<CangKu> cls = service.Findbytwo(cangku);
        System.out.println(cls);

        request.setAttribute("cls", cls);
        request.getRequestDispatcher("/printList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}