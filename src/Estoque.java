public class Estoque {
    String n;
    double p;
    int q;
    public double totalValueInStock(){
        double firstResult;
        return firstResult = p * q;
    }
    public void addProducts(int q){
        this.q = this.q + q;
    }
    public void removeProducts(int q){
        this.q = this.q - q;
    }
}
