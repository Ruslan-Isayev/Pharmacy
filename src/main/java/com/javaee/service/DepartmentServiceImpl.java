package com.javaee.service;

import com.javaee.dao.DepartmentDao;
import com.javaee.model.Department;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> getDepartmentList() throws Exception {
        return departmentDao.getDepartmentList();
    }

    @Override
    public void addDepartment(Department department) throws Exception {
        departmentDao.addDepartment(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws Exception {
        return departmentDao.getDepartmentById(departmentId);
    }

    @Override
    public void updateDepartment(Department department) throws Exception {
        departmentDao.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) throws Exception {
        departmentDao.deleteDepartment(departmentId);
    }

}
