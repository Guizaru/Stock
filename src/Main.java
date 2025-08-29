import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        //mensagem de boas-vindas:
        System.out.println("Welcome to the Market haha!");

        //dados do produto:
        System.out.println("First, you need to insert the info about the product: ");
        System.out.println("Please, insert the name of the product: ");
        String name = teclado.nextLine();
        System.out.println("Please, insert the price of the product: ");
        double price = teclado.nextDouble();
        Stock product = new Stock(name, price);

        //impressão dos dados
        System.out.printf("Name: %s%n",product.enterName);
        System.out.printf("Price: %.2f $%n",product.enterPrice);
        System.out.printf("Quantity in stock: %d%n",product.enterQuantity);

        //preço inicial
        product.totalValueInStock();
        System.out.printf("Product data: %s,"+" %d units,"+" Total: $ %.2f%n", product.enterName, product.enterQuantity, product.totalValueInStock());

        //adição
        System.out.println("Enter the number of products to be added in stock: ");
        int q = teclado.nextInt();
        product.addProducts(q);
        System.out.printf("Updated data: %s,"+" %d units,"+" Total: $ %.2f%n", product.enterName, product.enterQuantity, product.totalValueInStock());

        //remoção
        System.out.println("Enter the number of products to be removed from stock: ");
        q = teclado.nextInt();
        product.removeProducts(q);
        System.out.printf("Updated data: %s,"+" %d units,"+" Total: $ %.2f%n", product.enterName, product.enterQuantity, product.totalValueInStock());
    }
}
