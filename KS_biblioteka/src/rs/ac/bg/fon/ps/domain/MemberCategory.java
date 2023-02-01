/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

/**
 *
 * @author Dell
 */
public class MemberCategory {
    private Integer categoryId;
    private String name;
    private Integer numberOfMonths;

    public MemberCategory() {
    }

    public MemberCategory(Integer categoryId, String name, Integer numberOfMonths) {
        this.categoryId = categoryId;
        this.name = name;
        this.numberOfMonths = numberOfMonths;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(Integer numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }
    
    
}
