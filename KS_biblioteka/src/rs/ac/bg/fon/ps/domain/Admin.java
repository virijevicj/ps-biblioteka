/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.List;

/**
 *
 * @author Dell
 */
public class Admin {
    private Long adminId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    List<AdminLog> adminLogs;

    public Admin() {
    }

    public Admin(Long adminId, String firstName, String lastName, String username, String password) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public Admin(Long adminId, String firstName, String lastName, String username, String password, List<AdminLog> adminLogs) {
        this.adminId = adminId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.adminLogs = adminLogs;
    }

    public List<AdminLog> getAdminLogs() {
        return adminLogs;
    }

    public void setAdminLogs(List<AdminLog> adminLogs) {
        this.adminLogs = adminLogs;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
