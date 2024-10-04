/*
 * Represents toys that can be sold at a store
 */
public class Toys{
  // Instance variables
private String type;
private double price;
private boolean allAges;

  // Constructors no argument
public Toys(){
this.type = "Doll";
this.allAges = false;
this.price = 9.99;  
  
}
  // parameterize constructor
    /*
   * Sets type to the specified type,
   * price to the specified price
   * allAges to the true or false value
   */
  public Toys(String type, double price, boolean allAges){
    this.type = type; 
    this.price = price;
    this.allAges = allAges;
   
  }
  //Accessor and Mutator Methods
public String getType(){
  return type;
}
  public double getPrice(){
  return price;
}
  public void setType(String newType){
    this.type = newType;
  }
  public void setAllAges(boolean newAllAges){
    this.allAges = newAllAges;
  }
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }
  // toString()
public String toString() {
  String text = "";
  if (allAges){
    text += "This is for all ages.";
  } else{
    text += "This is not for all ages.";
  }
  return "Type: " + type + " [" + text + "]" + "\nPrice: "+ price;
}

}