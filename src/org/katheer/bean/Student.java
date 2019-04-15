package org.katheer.bean;

public class Student {
    private String name;
    private String regNo;
    private String dept;
    private Address address;

    public Student(String name, String regNo, String dept, Address address) {
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
        this.address = address;
    }

    public void showStudentDetails() {
        System.out.println("****************************************************");
        System.out.println("Name    : " + this.name);
        System.out.println("Reg No  : " + this.regNo);
        System.out.println("Dept    : " + this.dept);
        System.out.println("Address :");
        address.getAddress();
        System.out.println("****************************************************");
        System.out.println();
    }
}
