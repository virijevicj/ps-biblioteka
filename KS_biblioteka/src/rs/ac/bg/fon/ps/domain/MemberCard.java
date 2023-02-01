/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class MemberCard {
    private Long memberCardId;
    private Date dateOfFirstIssue;
    private Date dateOfLastUpdate;
    private Date expiryDate;
    private Boolean active;

    public MemberCard() {
    }

    public MemberCard(Long memberCardId, Date dateOfFirstIssue, Date dateOfLastUpdate, Date expiryDate, Boolean active) {
        this.memberCardId = memberCardId;
        this.dateOfFirstIssue = dateOfFirstIssue;
        this.dateOfLastUpdate = dateOfLastUpdate;
        this.expiryDate = expiryDate;
        this.active = active;
    }

    public Long getMemberCardId() {
        return memberCardId;
    }

    public void setMemberCardId(Long memberCardId) {
        this.memberCardId = memberCardId;
    }

    public Date getDateOfFirstIssue() {
        return dateOfFirstIssue;
    }

    public void setDateOfFirstIssue(Date dateOfFirstIssue) {
        this.dateOfFirstIssue = dateOfFirstIssue;
    }

    public Date getDateOfLastUpdate() {
        return dateOfLastUpdate;
    }

    public void setDateOfLastUpdate(Date dateOfLastUpdate) {
        this.dateOfLastUpdate = dateOfLastUpdate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    
    
}
