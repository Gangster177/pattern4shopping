public interface Shop {
    void printProducts(); //Вывод доступных для покупки товаров
    void printByFilterPrice(int price); //Фильтрация товаров по ценам, производителям
    void printByFilter(String category); //Фильтрация товаров по категориям
}
