import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

  Toys doll = new Toys();
  Toys plushToy = new Toys("Squishmallow", 11.99, true);

  System.out.println(doll);
  System.out.println(plushToy);

  PlushToy bear = new PlushToy ("Bear", 5.99, false, true, "Cotton", 7.5, 5.4);
  System.out.println(bear);

  ActionFigure spiderman = new ActionFigure("Spiderman", 15.99, false, true, 6.5, "Hasbro");
  System.out.println(spiderman);
      Toys plushie = new Toys();
      System.out.println("Search for a Toy!");
      System.out.println("What is the Type?");
      String userType = input.nextLine();
      plushie.setType(userType);

     
      System.out.println("What is the Price?");
      double userPrice = input.nextDouble();
      plushie.setPrice(userPrice);
    
      System.out.println("Type: " + plushie.getType());
      System.out.println("Price: " + plushie.getPrice());


    // Closes the Scanner object
    input.close();
    
  }
}