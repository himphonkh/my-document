/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author reach
 */
public class user {
    private String username;
    private String email;
    private String password;
    
    public user(){
    }
    public void setName(String username){
        this.username = username;
    }
    public String getName(){
        return username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
}
