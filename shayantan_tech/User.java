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
class User {
    private int price;
    private String cat,nm;
    public User(String cat, String nm, int price)
    {
      this.cat=cat;
      this.nm=nm;
      this.price=price;
    }
    public int getprice()
    {
        return price;
    }
    public String getName()
    {
        return nm;
    }
    public String getCat()
    {
        return cat;
    }
    
}
