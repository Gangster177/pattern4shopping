import java.util.Arrays;

public class ShopImpl implements Shop{
    protected String[] products = {"Хлеб    ", "Мука    ", "Сосиски ", "Сахар   ", "Молоко  "};
    protected int[] price = {35, 90, 90, 65, 80};
    private BoxOffice boxOffice;

    public ShopImpl(){
        boxOffice = new BoxOfficeImpl(price.length, products.length);
    }

    public int[] getPrice(){
        return this.price;
    }

    public String[] getProducts(){
        return this.products;
    }
    public int getProductsLength(){
        return products.length;
    }
    @Override
    public void printProducts() {
        System.out.println(Arrays.toString(products));
    }

    @Override
    public void printByFilterPrice(int price) {

    }

    @Override
    public void printByFilter(String category) {

    }
}
