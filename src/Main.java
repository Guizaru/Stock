import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Welcome to the Market!");

        System.out.println("First, you need to insert the info about the product.");
        System.out.print("Please, insert the name of the product: ");
        String name = teclado.nextLine();
        System.out.print("Please, insert the price of the product: ");
        double price = teclado.nextDouble();
        System.out.print("Please, insert the quantity of the product: ");
        int quantity = teclado.nextInt();
        Stock product = new Stock(name, price, quantity);

        product.totalValueInStock();
        System.out.println("Date added: "+ product);

        System.out.print("Enter the number of products to be added in stock: ");
        int q = teclado.nextInt();
        product.addProducts(q);
        System.out.println("Updated data: "+ product);

        System.out.print("Enter the number of products to be removed from stock: ");
        q = teclado.nextInt();
        product.removeProducts(q);
        System.out.println("Updated data: "+ product);
    }
}
