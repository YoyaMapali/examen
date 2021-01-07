/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Romaric Yoya
 */
public class Employee{
    
    private String id;
    private String name;
    private String date;
    
    
    public Employee(){        
    }
    
  
 
    //constructor with age argument
   
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
            this.date() + 
            "]";
    }

    private String date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
