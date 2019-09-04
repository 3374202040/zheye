package com.zheye.web.servlet;



import com.zheye.util.SecurityCode;
import com.zheye.util.SecurityImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

 /**
 * Servlet implementation class imageCodeServlet
 */
@WebServlet("/imageCode")
public class imageCodeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public imageCodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取验证码随机字符串
        String code = SecurityCode.getSecurityCode();
        //将验证码保存到服务器
        HttpSession session=request.getSession();
        session.setAttribute("code", code);
        //设置响应对象输出图片流
        //响应内容类型为图片
        response.setContentType("image/jpeg");
        //设置响应头部属性 :不缓存响应内容
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        //设置响应失效时间
        response.setDateHeader("Expires", 0);
        //输出验证码图片
        ImageIO.write(SecurityImage.getImage(code), "jpeg", response.getOutputStream());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
