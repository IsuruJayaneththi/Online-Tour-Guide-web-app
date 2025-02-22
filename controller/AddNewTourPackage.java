package com.onlinetourguide.controller;

import com.onlinetourguide.dao.TourPkgAddDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "AddNewTourPackage", urlPatterns = {"/AddNewTourPackage"})
@MultipartConfig
public class AddNewTourPackage extends HttpServlet {

    private InputStream imageUrl_1;
    private InputStream imageUrl_2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tour_name = request.getParameter("name");
        String location_from = request.getParameter("from");
        String location_to = request.getParameter("to");
        String date = request.getParameter("date");
        String duration = request.getParameter("duration");
        String price = request.getParameter("price");
        String hotel = request.getParameter("hotel");
        String transport = request.getParameter("trans_type");
        String desp1 = request.getParameter("desp1");
        String desp2 = request.getParameter("desp2");
        String imageUrl = request.getParameter("file");
//        String imageUrl_2 = request.getParameter("file1");

        System.out.println(imageUrl);

        // input stream of the upload file
        Part filePart = request.getPart("file");
        Part filePart2 = request.getPart("file1");

        if (filePart != null && filePart2 != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println("Hello"+ filePart2.getName());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            imageUrl_1 = filePart.getInputStream();
            imageUrl_2 = filePart2.getInputStream();
        }

        TourPkgAddDao tourPkgAddDao = new TourPkgAddDao();
        tourPkgAddDao.addTourPackage(tour_name,location_from,location_to,date,duration,price,desp1,desp2,imageUrl_1,imageUrl_2,hotel,transport);

        response.sendRedirect("manageTourPackages.jsp");

    }

}
