/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamil
 */
package tpsi_lab5;
public class Person {
    String firstName;
    String lastName;
    String email;
    public String getfirstName(){
        return this.firstName;
    }
    public String getlastName(){
        return this.lastName;
    }
    public String getemail(){
        return this.email;
    }
    Person(String first, String last, String mail){
        this.firstName = first;
        this.lastName = last;
        this.email = mail;
    }
}
