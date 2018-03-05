/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.models;

import java.util.Date;

/**
 *
 * @author louiseahokas
 */
final public class Product 
{
    private int id;
    private String productName;
    private String productImageUrl;
    private Date lastUpdated;
    
    Product(int productId, String productName, String productImageUrl, Date lastUpdated)
    {
        this.id = productId;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.lastUpdated = new Date(lastUpdated.getTime());
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
   
    public String getProductImageUrl()
    {
        return productImageUrl;
    }
    
    public void setProductImageUrl(String productImageUrl)
    {
        this.productImageUrl = productImageUrl;
    }
    
    public Date getLastUpdated()
    {
        return lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated)
    {
        this.lastUpdated = lastUpdated;
    }
    
}
