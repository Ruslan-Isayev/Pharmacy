package com.javaee.service;


import com.javaee.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartmentList() throws Exception;
    void addDepartment(Department department) throws Exception;
    Department getDepartmentById(Long departmentId) throws Exception;
    void updateDepartment(Department department) throws Exception;
    void deleteDepartment(Long departmentId) throws Exception;
}
