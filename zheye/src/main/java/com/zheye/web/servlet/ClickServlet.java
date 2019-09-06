package com.zheye.web.servlet;

import com.zheye.service.ClickService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/click")
public class ClickServlet extends HttpServlet {
    private ClickService clickService=new ClickService();;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        int queId=Integer.parseInt(req.getParameter("queid"));
        System.out.println(action);
        if("agreeUp".equals(action)){
            clickService.queAgreeUp(queId);
        }else if("agreeDown".equals(action)){
            clickService.queAgreeDown(queId);
        }else if("disagreUp".equals(action)){
            clickService.queDisagreUp(queId);
        }else if("disagreDown".equals(action)){
            clickService.queDisagreDown(queId);
        }else if("UpAndDown".equals(action)){
            clickService.queAgreeUp(queId);
            clickService.queDisagreDown(queId);
        }else if("DownAndUp".equals(action)){
            clickService.queAgreeDown(queId);
            clickService.queDisagreUp(queId);
        }
    }

}
