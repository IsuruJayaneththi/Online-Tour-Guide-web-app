package com.onlinetourguide.controller;

import com.onlinetourguide.dao.TourPkgDeleteDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletePackage",urlPatterns = {"/DeletePackage"})
public class DeletePackage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String t = request.getParameter("id");


        if (request.getParameter("action").equals("2") == true)
        {
            TourPkgDeleteDao dao = new TourPkgDeleteDao();
            dao.deletePackage(t);
            response.sendRedirect("manageTourPackages.jsp");
        }
    }
}



















