package com.example.employeepayroll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String salary;
    private String profilePic;
    private String note;

    public Employee(){

    }
    public Employee(String firstName,String lastName,String address,String salary,String profilePic,String note){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.salary=salary;
        this.profilePic=profilePic;
        this.note=note;
    }
    public Employee(Integer id,String firstName,String lastName,String address,String salary,String profilePic,String note){
        super();
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.salary=salary;
        this.profilePic=profilePic;
        this.note=note;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
