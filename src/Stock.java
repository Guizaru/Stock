public class Estoque {
    String enterName;
    double enterPrice;
    int enterQuantity;
    public Estoque (String enterName, double enterPrice, int enterQuantity) {
        this.enterName = enterName;
        this.enterPrice = enterPrice;
        this.enterQuantity = enterQuantity;
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
