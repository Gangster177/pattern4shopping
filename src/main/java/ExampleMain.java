import java.util.Scanner;

public class ExampleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String[] products = {"Хлеб    ", "Мука    ", "Сосиски ", "Сахар   ", "Молоко  "};
//        int[] price = {35, 90, 90, 65, 80};
        ShopImpl shop = new ShopImpl();

//        int sumProducts = 0;
//        int[] check = new int[price.length];
//        boolean[] isBuy = new boolean[products.length];

        System.out.println("Список возможных товаров для покупки:");

        for (int i = 0; i < shop.getProductsLength(); i++) {
            System.out.println(i + 1 + ". " + shop.getProducts()[i] + " " + shop.getPrice()[i] + " руб./шт.");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            int currentPrice = shop.getPrice()[productNumber];
            sumProducts = sumProducts + (productCount * currentPrice);
            isBuy[productNumber] = true;
            check[productNumber] += productCount;

        }
//        int checkPosition = 0;
//        System.out.println("Ваша корзина:");
//        System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
//        for (boolean f : isBuy) {
//            if (f) {
//                System.out.println(shop.getProducts()[checkPosition] +
//                        "              " + check[checkPosition] +
//                        "           " + price[checkPosition] +
//                        "          " + (check[checkPosition] * price[checkPosition]));
//                checkPosition++;
//            } else {
//                checkPosition++;
//            }
//        }
//        System.out.println("                                        Итог: " + sumProducts);

    }
}