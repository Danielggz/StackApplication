/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package stackapplication;

/**
 *
 * @author Daniel García
 * 30 ene 2024
 */
public class Wagon {
    private String wagonName, productType;

    public Wagon(String wagonName, String productType) {
        this.wagonName = wagonName;
        this.productType = productType;
    }
    
    public void setWagonName(String wagonName) {
        this.wagonName = wagonName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getWagonName() {
        return wagonName;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return """
               
               <------------------------------------------------------------->
               Wagon name: """ + wagonName + 
                "\nProduct type: " + productType + """ 
                                                                                               
               <------------------------------------------------------------->
               """;
               
    }
}
