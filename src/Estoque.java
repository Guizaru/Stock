public class Estoque {
    String n;
    double p;
    int q;
    public Estoque (String n, double p, int q) {
        this.n = n;
        this.p = p;
        this.q = q;
    }
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
