package com.javaee.dao;

import com.javaee.model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> getDepartmentList() throws Exception {
        List<Department> departmentList = new ArrayList<>();
        String sql = "select * from departments\n" +
                "where active=1";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Department department = new Department();
                department.setDepartmentId(rs.getLong("id"));
                department.setDepartmentName(rs.getString("name"));
                department.setDepartmentLocation(rs.getString("location"));
//                department.setInventoryId(rs.getLong("INVENTORYID"));
                departmentList.add(department);
            }
        }
        return departmentList;
    }

    @Override
    public void addDepartment(Department department) throws Exception {
        String sql = "INSERT INTO DEPARTMENTS(DEPARTMENTID, NAME, LOCATION, INVENTORYID)"
                + "VALUES(DEPARTMENT_SEQ.nextval, ?, ?, ?)";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, department.getDepartmentName());
            ps.setString(2, department.getDepartmentLocation());
//            ps.setLong(3, department.getInventoryId());
            ps.execute();
            c.commit();
        }
    }
    @Override
    public Department getDepartmentById(Long departmentId) throws Exception {
        Department department = new Department();
        String sql = "select * from DEPARTMENTS\n" +
                "where ACTIVE=1 AND DEPARTMENTID = ?";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, departmentId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                department.setDepartmentId(rs.getLong("DEPARTMENTID"));
                department.setDepartmentName(rs.getString("NAME"));
                department.setDepartmentLocation(rs.getString("LOCATION"));
//                department.setInventoryId(rs.getLong("INVENTORYID"));
            } else {
                department = null;
            }
        }
        return department;
    }

    @Override
    public void updateDepartment(Department department) throws Exception {
        String sql = "update DEPARTMENTS set DEPARTMENTID = ?, NAME = ?, LOCATION = ?, INVENTORYID = ?"
                + " where DEPARTMENTID = ?";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(2, department.getDepartmentName());
            ps.setString(3, department.getDepartmentLocation());
//            ps.setLong(4, department.getInventoryId());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public void deleteDepartment(Long departmentId) throws Exception {
        String sql = "update DEPARTMENTS set ACTIVE = 0"
                + "where DEPARTMENTID = ?";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, departmentId);
            ps.execute();
//            c.commit();
        }
    }
}
