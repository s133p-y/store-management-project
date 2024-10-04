/*
 * Represents an action figure that can be sold at a store
 * Action figure is a type of toy
 */
public class ActionFigure extends Toys{
  // Instance variables
private boolean isPlastic; 
private double height;
private String brand;
  // Constructors
public ActionFigure(){
 isPlastic = true;
  height = 7.5;
  brand = "Hasbro";
}

public ActionFigure(String type, double price, boolean allAges, boolean isPlastic, double height, String brand){
super(type, price, allAges);
this.isPlastic = isPlastic;
this.height = height;
this.brand = brand;
}
//Accessor and Mutator Methods
  // return values
/* 
  * Returns the value assigned to isPlastic
  */
public boolean getIsPlastic(){
  return isPlastic;
}
/* 
  * Returns the value assigned to height
  */
public double getHeight(){
  return height;
}
/* 
  * Returns the value assigned to brand
  */
public String getBrand(){
  return brand;
}
  // toString()
  public String toString(){
    return super.toString() + "\nPlastic: " + isPlastic  + "\nHeight: " + height + "\nBrand: " + brand;
  }

}