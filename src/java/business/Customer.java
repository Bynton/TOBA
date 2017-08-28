/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author bento
 */
public class Customer {
    String fn;
    String ln;
    String pn;
    String add;
    String cit;
    String st;
    String zip;
    String ema;
    
    public Customer(String firstName,String lastName,String phone,String address,String city,String state,String zipcode,String email) {
        fn = firstName;
        ln = lastName;
        pn = phone;
        add = address;
        cit = city;
        st = state;
        zip = zipcode;
        ema = email;
    }
}
