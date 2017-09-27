package business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author bento
 */
public class User implements Serializable{
    private String URL = "jdbc:mysql://localhost:3306/userdb";
    private String USERNAME = "root";
    private String PASSWORD = "bynton";
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String username;
    private String password;
    
    public User(){
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        email = "";
        username = "";
        password = "";
    }
    
    public User(String firstName,String lastName, String phone, String address, String city,String state, String zipcode, String email, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.username = lastName + zipcode;
        this.password = "welcome1";
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String fname){
        this.firstName = fname;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lname){
        this.lastName = lname;       
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getState(){
        return state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getZipcode(){
        return zipcode;
    }
    
    public void setZipcode(String zipcode){
        this.zipcode = zipcode; 
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
