import java.time.LocalDate;

public class Jeans {
    private String brand;
    private int numPocket;
    private String dateOfPurchase;
    private String color;

    public final String red = "\033[31m";
    public final String magenta = "\033[35m";
    public final String cyan =  "\033[36m";

    private int totalJeans;

    public Jeans(String b, int n, String d) {
        this.brand = b;
        this.numPocket = n;
        this.dateOfPurchase = d;
    }

    public void ageOfJeans() {
        LocalDate localDate = LocalDate.now();

        LocalDate currentDate = localDate;

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        LocalDate newCurrentDate = LocalDate.parse(year + "-" + month + "-" + day);

        System.out.println(currentDate);
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

    public void setColor(String color) {
        this.color = color;
    }

    public int getTotalJeans() {
        return totalJeans;
    }

    public String toString() {
        return "JEANS BRAND: " + brand + "\nPOCKETS: " + numPocket + "\nDATE-OF-PURCHASE: " + dateOfPurchase;
    }
}