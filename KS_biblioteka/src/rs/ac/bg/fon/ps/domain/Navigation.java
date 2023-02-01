/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ps.domain;

import java.util.Stack;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class Navigation {
    //singlton patern
    private static Navigation instance;
    private Stack<JFrame> stackBack;
    private Stack<JFrame> stackForward;
    
    private Navigation(){
        stackBack = new Stack<>();
        stackForward = new Stack<>();
    }
    
    public static Navigation getInstance(){
        if(instance == null) instance = new Navigation();
        return instance;
    }
    
    //dodavanje formi na stekove
    public void pushOnStackBack(JFrame jf){
        stackBack.push(jf);     
    }
    
    public void pushOnStackForward(JFrame jf){
        stackForward.push(jf);
    }
    
    //uzimanje formi sa stekova
    public JFrame popFromStackBack(){
        if(!stackBack.isEmpty())return stackBack.pop();
        return null;
    }
    
    public JFrame popFromStackForward(){
        if(!stackForward.isEmpty())return stackForward.pop();
        return null;
    }
}
