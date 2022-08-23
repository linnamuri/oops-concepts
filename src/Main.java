import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList <Cupcake> cupcakeMenu = new ArrayList<>(3);
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
       redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);


            cupcakeMenu.add(cupcake);
            cupcakeMenu.add(redVelvet);
            cupcakeMenu.add(chocolate);

        System.out.println("");
        for ( Cupcake cp : cupcakeMenu) {
            cp.type();
        }

    }
}

class Cupcake
{
    public double price;

    public double getPrice()
    {
        return price;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    //  Create a public function named type that prints “A basic, generic cupcake, with vanilla frosting” and returns void.
    public void type()
    {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

}