import java.util.Scanner;

public class Stock {
    String enterName;
    double enterPrice;
    int enterQuantity;
    public Stock (String enterName, double enterPrice, int enterQuantity) {
        this.enterName = enterName;
        this.enterPrice = enterPrice;
        this.enterQuantity = enterQuantity;
    }
    public Stock (String enterName, double enterPrice) {
        this.enterName = enterName;
        this.enterPrice = enterPrice;
    }
    public double totalValueInStock(){
        return enterPrice * enterQuantity;
    }
    public void addProducts(int q){
        this.enterQuantity = this.enterQuantity + q;
    }
    public void removeProducts(int q){
        this.enterQuantity = this.enterQuantity - q;
    }
}