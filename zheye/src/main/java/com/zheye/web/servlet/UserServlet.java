package com.zheye.web.servlet;

import com.zheye.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    UserService userService=new UserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        System.out.println(action);
        if("checkUsePhone".equals(action)){
            check(req, resp);
        }
    }

    /**
     * 验证用户手机和密码是否正确
     * @param req
     * @param resp
     * @throws IOException
     */
    private void check(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String phone=req.getParameter("phone");
        String password=req.getParameter("password");

        boolean ok=userService.checkUser(phone,password);
        PrintWriter out=resp.getWriter();
        out.print(ok);
        out.close();
    }


}
