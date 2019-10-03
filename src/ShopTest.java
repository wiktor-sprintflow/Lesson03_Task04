public class ShopTest {
    public static void main(String[] args) {
        Category kitchen = new Category("Kuchnia", "Wszystko co potrzebne do kuchni.");
        Category audio = new Category("Hi-Fi Audio", "Wszystko co potrzebne do słuchania muzyki.");

        Product blender = new Product("Blender", 150, "Blenduje dosłownie wszystko.", kitchen);
        Product toaster = new Product("Toster", 99, "Nowoczesny samoczyszczący się toster.", kitchen);
        Product amplituner = new Product("Amplituner", 499, "Nowa jakość dźwięku.", audio);
        Product tv = new Product("Telewizor LED", 3000, "Wspaniały obraz 4k.");

        SpecialOffer specialOffer = new SpecialOffer(tv, "Dwadzieścia procent taniej dla studentów", "01-10-2019", "31-10-2019", 0.2d);

        blender.printProductDetails();
        toaster.printProductDetails();
        amplituner.printProductDetails();
        tv.printProductDetails();

        specialOffer.printSpecialOfferDetails();
    }
}