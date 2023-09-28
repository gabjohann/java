package exercicio04;

public class Compra {
    private String productName;
    private String expirationDate;

    public Compra(String productName, String expirationDate) {
        this.productName = productName;
        this.expirationDate = expirationDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Produto: " + productName + "\nValidade: " + expirationDate + "\n";
    }
}
