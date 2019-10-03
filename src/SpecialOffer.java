public class SpecialOffer {
    Product product;
    String description;
    String startDate;
    String endDate;
    double discount;

    public SpecialOffer(Product product, String description, String startDate, String endDate, double discount) {
        this.product = product;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }

    public double getSpecialPrice() {
        double specialPrice = this.product.price * (1 - this.discount);
        return specialPrice;
    }

    public void printSpecialOfferDetails() {
        System.out.println("\nOferta specjalna:\n" + this.description + " na " + this.product.name + ". Tylko od " +
                this.startDate + " do " + this.endDate + ".\n" + "Cena standardowa: " + this.product.price + " PLN. " +
                "Cena promocyjna: " + getSpecialPrice());
    }
}