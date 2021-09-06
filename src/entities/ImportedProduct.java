/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;


public class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct(double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    
    
    public double totalPrice(){
        
        return super.getPrice() + customsFee;
    }
    
    @Override
    public String priceTag(){
        
        return super.getName() + " $ " 
                + totalPrice() + 
                " (Customs fee: $ "
                + getCustomsFee() + ")";
    }
    

}
