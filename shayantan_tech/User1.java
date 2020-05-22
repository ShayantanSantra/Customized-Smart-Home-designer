/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shayantan_tech;

/**
 *
 * @author shaya
 */
public class User1 {
    private String prodname,brand;
    private int price;
    public User1(String prodname, int price, String brand)
    {
        this.prodname=prodname;
        this.price=price;
        this.brand=brand;
      /*  this.category=category;
        this.room=room;*/
    }
    public String getProdname(){
        return prodname;
    }
    public int getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
   /* public String getCategory(){
        return category;
    }
    public String getRoom(){
        return room;*/
    }
    
    

