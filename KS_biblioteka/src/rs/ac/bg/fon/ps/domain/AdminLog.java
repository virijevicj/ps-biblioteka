/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.time.LocalDateTime;

/**
 *
 * @author Dell
 */
public class AdminLog {
    private Long id;
    private LocalDateTime timeStamp;
    private String className;
    private String methodName;
    private String buttonName;

    public AdminLog() {
    }

    public AdminLog(Long id, LocalDateTime timeStamp, String className, String methodName, String buttonName) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.className = className;
        this.methodName = methodName;
        this.buttonName = buttonName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
    
    
    
}
