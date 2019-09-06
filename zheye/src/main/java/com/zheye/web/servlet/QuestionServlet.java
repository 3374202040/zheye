package com.zheye.web.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.zheye.domain.Question;
import com.zheye.domain.UserInfo;
import com.zheye.service.QuestionService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/question")
public class QuestionServlet extends HttpServlet {
    QuestionService questionService=new QuestionService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if("findAll".equals(action)){
            List<Question> list=questionService.findAll();
            System.out.println(list);
            Gson gson=new GsonBuilder().serializeNulls().create();
            PrintWriter out = resp.getWriter();
            out.print(gson.toJson(list));
            out.close();
        }
    }


}
