package com.javaee.controller;

import java.io.*;
import java.sql.Connection;
import java.util.List;

import com.javaee.dao.DbHelper;
import com.javaee.dao.DepartmentDao;
import com.javaee.dao.DepartmentDaoImpl;
import com.javaee.model.Department;
import com.javaee.service.DepartmentService;
import com.javaee.service.DepartmentServiceImpl;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ControllerServlet", value = "/cs")
public class ControllerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        processRequest(request, response);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        DepartmentDao departmentDao = new DepartmentDaoImpl();
        DepartmentService departmentService = new DepartmentServiceImpl(departmentDao);
        try {
            if (request.getParameter("action") != null) {
                String action = request.getParameter("action");
                if (action.equalsIgnoreCase("register")) {
                    String name = request.getParameter("name");
                    String surname = request.getParameter("surname");
                    String password = request.getParameter("password");
                    String email = request.getParameter("email");
                    out.write("<h1>Success</h1>");
                    out.write("Welcome " + name + " " + surname);
                } else if (action.equalsIgnoreCase("getDepartmentList")) {
                    List<Department> departmentList = departmentService.getDepartmentList();
                    request.setAttribute("departmentList", departmentList);
                    request.getRequestDispatcher("WEB-INF/pages/departmentList.jsp").forward(request, response);

                } else if (action.equalsIgnoreCase("getMedicationsList")) {
                    out.write("<h1>Medications List</h1>");
                } else if (action.equalsIgnoreCase("getPatientsList")) {
                    out.write("<h1>Patients List</h1>");
                } else if (action.equalsIgnoreCase("getPrescriptionsList")) {
                    out.write("<h1>Prescriptions List</h1>");
                } else if (action.equalsIgnoreCase("getPaymentsList")) {
                    out.write("<h1>Payments List</h1>");
                } else if (action.equalsIgnoreCase("getInventoryList")) {
                    out.write("<h1>Inventory List</h1>");
                } else if (action.equalsIgnoreCase("getJobsList")) {
                    out.write("<h1>Jobs List</h1>");
                } else if (action.equalsIgnoreCase("getOrdersList")) {
                    out.write("<h1>Orders List</h1>");
                } else if (action.equalsIgnoreCase("getEmployeesList")) {
                    out.write("<h1>Employees List</h1>");
                } else if (action.equalsIgnoreCase("getViewList")) {
                    out.write("<h1>View List</h1>");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}