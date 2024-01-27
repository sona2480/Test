public class ShoppingMall {

    /*
    My name is Ananya Mahapatra.
    A fun fact about me is that I have a Guiness World Record.
    It was for being part of the largest kuchipudi 
    (traditional indian dance form) perfomance in the world.
    So I'm officially amazing :) 
    */

    public static void main(String[] args){

        //used double insted of float as accuarcy is 2 decimal places

        int cash = 100;
        double taxRate = 1.13;
        double subTotal = 58.62;

        String name = "Ananya";

        double change = cash - subTotal * taxRate;
        System.out.println("change BEFORE truncate: " +change); // DEBUG
        double changeTrunc = (int) (change * 100) / 100.0; 
        System.out.println("change AFTER truncate: " + changeTrunc); // DEBUG

        //double*int gives double, put brackets to avoid confusion
        //int changes (change*100) to int
        //then int/decimal gives double

        System.out.println(name + " has $" + changeTrunc + " dollars remaining!\n" +
        name + " started with $" + cash + " dollars!");

        //space before started

    }
} 

