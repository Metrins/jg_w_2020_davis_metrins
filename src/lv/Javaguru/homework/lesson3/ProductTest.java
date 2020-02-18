package lv.Javaguru.homework.lesson3;

//lieto "ctrl + alt + l"
public class ProductTest {
    public static void main(String[] args) {

        Product Product = new Product(); //mainīgais rakstams ar mazo burtu

                Product.setName("milk");
                Product.setRegularPrice(0.8);
                Product.setDiscount(20);

            String thatName = Product.getName();
            double thatRegularPrice = Product.getRegularPrice();
            double thatDiscount = Product.getDiscount();

        System.out.println("Product : name = " + Product.getName());
        System.out.println("regular price = " + Product.getRegularPrice() + " EUR");
        System.out.println("discount = " + Product.getDiscount() + "%");
        System.out.print("actual price ");
        calculateActualPrice(Product);
            }

            //šai loģikai ir jābūt produkta klasē
    public static void calculateActualPrice (Product product) {
    System.out.println(product.getRegularPrice() - (product.getRegularPrice() * product.getDiscount() / 100) + " EUR");

    }
}
