import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        //welcome message
        System.out.println("Welcome to your Market!");

        //product data
        Stock product;
        product = new Stock();
        System.out.println("First, you need to insert the info about the product");
        System.out.println("Please, insert the name of the product: ");
        product.n = teclado.next();
        System.out.println("Please, insert the price of the product: ");
        product.p = teclado.nextDouble();
        System.out.println("Please, insert the quantity of the product: ");
        product.q = teclado.nextInt();

        //data printing
        System.out.printf("Name: %s%n",product.n);
        System.out.printf("Price: %.2f $%n",product.p);
        System.out.printf("Quantity in stock: %d%n",product.q);

        //initial price
        product.totalValueInStock();
        System.out.printf("Product data: %s,"+" %d units,"+" Total: $ %.2f%n", product.n, product.q, product.totalValueInStock());

        //add
        System.out.println("Enter the number of products to be added in stock: ");
        int q = teclado.nextInt();
        product.addProducts(q);
        System.out.printf("Updated data: %s,"+" %d units,"+" Total: $ %.2f%n", product.n, product.q, product.totalValueInStock());

        //remove
        System.out.println("Enter the number of products to be removed from stock: ");
        q = teclado.nextInt();
        product.removeProducts(q);
        System.out.printf("Updated data: %s,"+" %d units,"+" Total: $ %.2f%n", product.n, product.q, product.totalValueInStock());
    }
}
