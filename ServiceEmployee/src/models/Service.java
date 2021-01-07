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
public class Service{
    
    private String id;
    private String Libelle;
    
    
    public Service(){        
    }
    
  
 
    //constructor with age argument
   
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getLibelle() {
        return Libelle;
    }
 
   

 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getLibelle() + 
            " : " + 
          
            "]";
    }
    }

