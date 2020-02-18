package lv.Javaguru.homework.lesson3;

//izmanto "ctrl + alt + l"
public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getRegularPrice() { return regularPrice; }
    public void setRegularPrice(double regularPrice) { this.regularPrice = regularPrice; }
    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    //šeit static nav vajadzīgs
    //atgriežamajam tipam ir jābut double
    //public static void calculateActualPrice() { System.out.println(regularPrice - (regularPrice * discount / 100));

    public double calculateActualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

}



