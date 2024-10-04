/*
 * Represents a plush toy that can be sold at a store
 * Plush toy is a type of toy
 */
public class PlushToy extends Toys {
  // Instance variables
private boolean isPolyester;
private String material; 
private double height;
private double width;

  // Constructors
public PlushToy(){
 isPolyester = true;
  material = "Polyester";
  height = 7.5;
  width = 4.5;
  
}
  
public PlushToy(String type, double price, boolean allAges, boolean isPolyester, String material, double height, double width){
super(type, price, allAges);
this.isPolyester = isPolyester;
this.material = material;
this.height = height;
this.width = width;
}
//Accessor and Mutator Methods
  //return values
/* 
  * Returns the value assigned to isPolyester
  */
public boolean getIsPolyester(){
  return isPolyester;
}
/* 
  * Returns the value assigned to material
  */
public String getMaterial(){
  return material;
}
/* 
  * Returns the value assigned to height
  */
public double getHeight(){
  return height;
}
/* 
  * Returns the value assigned to width
  */
public double getWidth(){
  return width;
}
  // toString()
  public String toString(){
    return super.toString() + "\nPolyester: " + isPolyester + "\nMaterial: "+ material + "\nWidth: " + width + "\nHeight: " + height;
  }

}