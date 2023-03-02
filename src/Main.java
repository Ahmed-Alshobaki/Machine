import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coffee = 5;
        int tea = 4;
        int water = 5;
        int order = 0;
        String sum ="";
        int TotalCoffee=0;
        int TotalTea =0;
        int TotalWater=0;
        int pressss;
        do {
            System.out.println("1.coffee $5");
            System.out.println("2.Tea $4");
            System.out.println("3.water $5");
            System.out.println("Enter number1-3");
            int number = in.nextInt();
            System.out.println("Enter Quantity");
            int Quantity = in.nextInt();
            System.out.print(sum);
            order++;
            switch (number) {
                case 1:
                    TotalCoffee = coffee * Quantity;
                    String SouCoffe = "order :" + order + "   Quantity :" + Quantity + "  cups(coffee) =  " + TotalCoffee + "$";
                    System.out.println(SouCoffe);
                    sum += SouCoffe + " \n";
                    break;
                case 2:
                    TotalTea = tea * Quantity;
                    String SouTea = "order :" + order + "   Quantity :" + Quantity + "  cups (Tea) =  " + TotalTea + "$";
                    System.out.println(SouTea);
                    sum += SouTea + " \n";
                    break;
                case 3:
                    TotalWater = water * Quantity;
                    String SouWater = "order :" + order + "   Quantity :" + Quantity + "  cups (water) =  " + TotalWater + "$";
                    System.out.println(SouWater);
                    sum += SouWater + " \n";
                    break;
            }
            System.out.println("press 1.To continue 2.To Step");
            pressss = in.nextInt();
        } while (pressss!=2);
        System.out.println("Your Bill : ");
        System.out.println(sum+"Total  :"+(TotalCoffee+TotalTea+TotalWater)+"$");

    }
}