public class BoxOfficeImpl implements BoxOffice{
    private int checkLength;
    private int productLength;
    protected int sumProducts = 0;
    protected int[] check = new int[checkLength];
    protected boolean[] isBuy = new boolean[productLength];

    public BoxOfficeImpl(int checkLength, int productLength) {
        this.checkLength = checkLength;
        this.productLength = productLength;
    }
    @Override
    public void printCheck(ShopImpl shop) {
        int checkPosition = 0;
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
        for (boolean f : isBuy) {
            if (f) {
                System.out.println(shop.getProducts()[checkPosition] +
                        "              " + check[checkPosition] +
                        "           " + shop.getPrice()[checkPosition] +
                        "          " + (check[checkPosition] * shop.getPrice()[checkPosition]));
                checkPosition++;
            } else {
                checkPosition++;
            }
        }
        System.out.println("                                        Итог: " + sumProducts);

    }
}
