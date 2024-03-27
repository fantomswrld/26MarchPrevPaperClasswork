import java.time.LocalDate;
import java.util.Scanner;

public class JeansAppUI {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the brand of the jeans:");
        String brand = userInput.nextLine();

        System.out.println("Enter the date of purchase:");
        LocalDate dateOfPurchase = LocalDate.parse(userInput.nextLine());

        System.out.println("Enter the number of pockets:");
        int numPockets = userInput.nextInt();

        Jeans jeans = new Jeans(brand, numPockets, dateOfPurchase.toString());

        System.out.println(jeans.toString());

        System.out.println("These jeans are " + jeans.ageOfJeans() + " years old.");

        System.out.println("Enter the color of the Jeans: ('R' for red; 'M' for magenta; 'C' for cyan)");
        String color = userInput.next();
        color = color.toUpperCase();

        jeans.setColor(color.charAt(0));

        jeans.flowers(numPockets);
    }
}