public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this(name, price, description);
        this.category = category;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void printProductDetails() {
        if (this.category != null) {
            System.out.println(this.category.name + " - " + this.category.description + " " + productDetailsWithoutCategory());
        } else {
            System.out.println(productDetailsWithoutCategory());
        }
    }

    public String productDetailsWithoutCategory() {
        String result = ("Produkt: " + this.name + " - " + this.description + " Cena: " + this.price + " PLN");
        return result;
    }
}