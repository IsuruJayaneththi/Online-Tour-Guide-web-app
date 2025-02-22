package com.onlinetourguide.controller;

import com.onlinetourguide.dao.AddUserDao;
import com.onlinetourguide.dao.LoginDao;
import com.onlinetourguide.dao.UsersFetchDao;
import com.onlinetourguide.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    private static User user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String fname = request.getParameter("fname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String lname = request.getParameter("lname");
        String password = request.getParameter("pwd");
        int userLevel = 2;

        LoginDao loginDao = new LoginDao();
        AddUserDao addUserDao = new AddUserDao();

        addUserDao.addUser(fname, lname, email, password, phone, userLevel);

        if (loginDao.check(email, password)) {

            HttpSession session = request.getSession();
            int id = loginDao.getId();

            user = new UsersFetchDao().fetchCustomer(id);

            session.setAttribute("username", email);
            session.setAttribute("cid", user);
            response.sendRedirect("indexc.jsp");


    }
        else
        {
            request.setAttribute("error", "error");
            RequestDispatcher rd = request.getRequestDispatcher("loginerror.jsp");
            rd.forward(request, response);
        }
    }


}
