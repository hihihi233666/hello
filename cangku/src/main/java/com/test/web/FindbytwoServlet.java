package com.test.web;



import com.test.pojo.CangKu;
import com.test.service.CangKuService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindbytwoServlet")
public class FindbytwoServlet extends HttpServlet {
    private CangKuService service = new CangKuService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("num");
        String call = request.getParameter("call");
        CangKu cangku = new CangKu();
        cangku.setNum(Integer.parseInt(num));
        cangku.setCall(Integer.parseInt(call));

        List<CangKu> cls=service.Findbytwo(cangku);
        System.out.println(cls);
        request.setAttribute("cls",cls);

        request.getRequestDispatcher("/printList.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
