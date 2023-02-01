/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

/**
 *
 * @author Dell
 */
public class Member {
    private Long memberId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private MemberCategory memberCategory;
    private MemberCard memberCard;

    public Member() {
    }

    public Member(Long memberId, String firstName, String lastName, String phoneNumber, String email) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Member(Long memberId, String firstName, String lastName, String phoneNumber, String email, MemberCategory memberCategory, MemberCard memberCard) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.memberCategory = memberCategory;
        this.memberCard = memberCard;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberCategory getMemberCategory() {
        return memberCategory;
    }

    public void setMemberCategory(MemberCategory memberCategory) {
        this.memberCategory = memberCategory;
    }

    public MemberCard getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }
    
    
}
