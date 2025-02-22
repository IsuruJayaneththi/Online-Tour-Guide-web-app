package com.onlinetourguide.controller;

import com.onlinetourguide.dao.AddUserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddUser", urlPatterns = {"/AddUser"})
public class AddUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String lname = request.getParameter("lname");
        String password = request.getParameter("pwd");
        String userLevel = request.getParameter("admin");


        AddUserDao dao = new AddUserDao();

        if (userLevel != null && !userLevel.isEmpty()) {
            dao.addUser(name, lname, email, password, phone, 1);
        } else {
            dao.addUser(name, lname, email, password, phone, 2);

        }


        response.sendRedirect("manageUsers.jsp");


    }


}
