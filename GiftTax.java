
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftValue = Double.valueOf(scan.nextLine());
        if (giftValue < 5000){
            System.out.println("No tax!");
        } else if (giftValue >= 5_000 && giftValue <= 25_000){
            System.out.println("Tax: " + (100 + (giftValue - 5_000) * 0.08));
        } else if (giftValue > 25_000 && giftValue <= 55_000){
            System.out.println("Tax: " + (1_700 + (giftValue - 25_000) * 0.10));
        } else if (giftValue > 55_000 && giftValue <= 200_000){
            System.out.println("Tax: " + (4_700 + (giftValue - 55_000) * 0.12));
        } else if (giftValue > 200_000 && giftValue <= 1_000_000){
            System.out.println("Tax: " + (22_100 + (giftValue - 200_000) * 0.15));
        } else if (giftValue > 1_000_000){
            System.out.println("Tax: " + (142_100 + (giftValue - 1_000_000) * 0.17));
        }
    }
}
