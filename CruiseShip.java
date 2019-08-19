import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cruise = scan.nextLine();
        String cabinType = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (cruise) {
            case "Mediterranean":
                if (cabinType.equals("standard cabin")) {
                    price = nights * 4 * 27.50;
                } else if (cabinType.equals("cabin with balcony")) {
                    price = nights * 4 * 30.20;
                } else if (cabinType.equals("apartment")) {
                    price = nights * 4 * 40.50;
                } else {
                    System.out.println("Invalid cabin type!");
                }
                break;
            case "Adriatic":
                if (cabinType.equals("standard cabin")) {
                    price = nights * 4 * 22.99;
                } else if (cabinType.equals("cabin with balcony")) {
                    price = nights * 4 * 25.00;
                } else if (cabinType.equals("apartment")) {
                    price = nights * 4 * 34.99;
                } else {
                    System.out.println("Invalid cabin type!");
                }
                break;
            case "Aegean":
                if (cabinType.equals("standard cabin")) {
                    price = nights * 4 * 23.00;
                } else if (cabinType.equals("cabin with balcony")) {
                    price = nights * 4 * 26.60;
                } else if (cabinType.equals("apartment")) {
                    price = nights * 4 * 39.80;
                } else {
                    System.out.println("Invalid cabin type!");
                }
                break;
            default:
                System.out.println("Invalid cruise!");
                break;
        }

        if (nights > 7) {
            price = 0.75 * price;
        }

        System.out.println(String.format("Annie's holiday in the %s sea costs %.2f lv.", cruise, price));
    }
}
