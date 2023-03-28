package com.javaee.javaee;

import java.io.*;

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
                out.write("<h1>Department List</h1>");
            } else if (action.equalsIgnoreCase("getMedicationsList")) {
                out.write("<h1>getMedications List</h1>");
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
            } else if (action.equalsIgnoreCase("getEmployeeList")) {
                out.write("<h1>Employee List</h1>");
            } else if (action.equalsIgnoreCase("getViewList")) {
                out.write("<h1>View List</h1>");
            }

        }
    }
}