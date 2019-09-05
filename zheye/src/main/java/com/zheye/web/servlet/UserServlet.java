package com.zheye.web.servlet;

import com.google.gson.JsonObject;
import com.zheye.domain.UserInfo;
import com.zheye.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    UserService userService;

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
        String code =req.getParameter("code");
        String phone =req.getParameter("phone");
        String password=req.getParameter("password");
        HttpSession session =req.getSession();
        session.removeAttribute("loginer");
        //获取服务端保存的验证码
        String verifyCode=(String)session.getAttribute("code");
        //响应客户端的json对象
        JsonObject jo =new JsonObject();
        if(!code.equals(verifyCode)) {
            jo.addProperty("msg", "验证码错误!");
        } else {
            UserInfo userInfo =userService.findByPhone(phone);
            if (userInfo==null){
                jo.addProperty("msg", "用户名不存在!");
                //注册一个用户

                //data多传一个值

            }else if (password!=""){
                //校验用户名，秘密是否正确
                Boolean result =userService.checkUser(phone,password);
                if(result==false) {
                    jo.addProperty("msg", "用户名或密码错误!");
                }else {
                    //登录成功
                    UserInfo loginer=new UserInfo();
                    jo.addProperty("suc", true);
                    session.setAttribute("loginer", loginer);
                }
            }else {
                UserInfo loginer=new UserInfo();
                jo.addProperty("suc", true);
                session.setAttribute("loginer",loginer);
            }
        }
        PrintWriter out =resp.getWriter();
        out.print(jo);
        out.close();
    }

    @Override
    public void init() throws ServletException {
        userService=new UserService();
    }
}
