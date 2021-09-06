/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class UsedProduct extends Product {
    
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date manufactureDate;

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    
    
    @Override
    public String priceTag(){
        
        return super.getName()
                +"(used) $ "
                + String.format("%.2f", super.getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                +")" ;
    }

}
