package com.javaee.model;

public class Department {
    private String departmentName;
    private String departmentLocation;
    private long departmentId;
//    private long inventoryId;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

//    public long getInventoryId() {
//        return inventoryId;
//    }

//    public void setInventoryId(long inventoryId) {
//        this.inventoryId = inventoryId;
//    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentLocation='" + departmentLocation + '\'' +
                ", departmentId=" + departmentId +
//                ", inventoryId=" + inventoryId +
                '}';
    }
}
