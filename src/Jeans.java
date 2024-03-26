import java.time.LocalDate;

public class Jeans {
    private String brand;
    private int numPocket;
    private String dateOfPurchase;
    private String color;

    public final String RED = "\033[31m";
    public final String MAGENTA = "\033[35m";
    public final String CYAN =  "\033[36m";

    private int totalJeans;

    public Jeans(String b, int n, String d) {
        this.brand = b;
        this.numPocket = n;
        this.dateOfPurchase = d;

        color = RED;
        totalJeans++;
    }

    public void setColor(String color) {
        if(color.equals("R")) {
            this.color = RED;
        } else if(color.equals("M")) {
            this.color = MAGENTA;
        } else if(color.equals("C")) {
            this.color = CYAN;
        } else {
            System.out.println("Enter a valid color");
        }
    }

    public int ageOfJeans() {
        LocalDate localDate = LocalDate.now();

        LocalDate currentDate = localDate;
        LocalDate purchaseDate = LocalDate.parse(dateOfPurchase);

        int currentYear = currentDate.getYear();

        int purchaseYear = purchaseDate.getYear();

        int ageYear = currentYear - purchaseYear;

        return ageYear;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumPocket() {
        return numPocket;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumPocket(int numPocket) {
        this.numPocket = numPocket;
    }

    public int getTotalJeans() {
        return totalJeans;
    }

    public String toString() {
        return "JEANS BRAND: " + brand + "\nPOCKETS: " + numPocket + "\nDATE-OF-PURCHASE: " + dateOfPurchase;
    }
}