/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author damos
 */
public class Member {
    private String name;
    private String member;
    
    
    public Member(String newName, String newmember){
        this.name = newName;
        this.member = newmember;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getMember(){
        return member;
    }
    public void setMember(String newmember){
        this.member = newmember;
    }
    
    
}
