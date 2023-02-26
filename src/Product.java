/**
 * Класс продукта со свойствами <b>MaxArticle</b>, <b>Article</b>, <b>Name</b>, <b>Quantity</b> и <b>Price</b>.
 * @autor Милана Лицеванова
 * @version 1.0
 */
public class Product {
    private static int MaxArticle = 0;
    private int Article;
    private String Name;
    private int Quantity;
    private int Price;

    /**
     * Конструктор класса {@link Product}
     */
    public Product() {
        setName("");
        setQuantity(0);
        setArticle(MaxArticle++);
        setPrice(0);
    }

    /**
     * Конструктор класса {@link Product}
     * @param name Название продукта
     * @param quantity Количество продукта
     * @param price Стоимость продукта
     * @param article Артикул продукта
     */
    public Product(String name, int quantity, int price, int article) {
        setName(name);
        setQuantity(quantity);
        setArticle(article);
        setPrice(price);
    }

    /**
     * Функция получения значения поля {@link Product#Name}
     * @return возвращает название продукта
     */
    public String getName() {
        return Name;
    }

    /**
     * Функция получения значения поля {@link Product#Article}
     * @return возвращает артикул продукта
     */
    public int getArticle() {
        return Article;
    }

    /**
     * Функция получения значения поля {@link Product#Price}
     * @return возвращает стоимость продукта
     */
    public int getPrice() {
        return Price;
    }

    /**
     * Функция получения значения поля {@link Product#Quantity}
     * @return возвращает количество продукта
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * Функция присвоения значения полю {@link Product#Name}
     * @param name Название продукта
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Функция присвоения значения полю {@link Product#Article}
     */
    public void setArticle(int article) { Article = article; }

    /**
     * Функция присвоения значения полю {@link Product#Price}
     * @param price Стоимость продукта
     */
    public void setPrice(int price) {
        Price = price;
    }

    /**
     * Функция присвоения значения полю {@link Product#Quantity}
     * @param quantity Количество продукта
     */
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    /**
     * Функция получения значения поля {@link Product#MaxArticle}
     * @return Значение максимального артикула товара
     */
    public static int getMaxArticle() { return MaxArticle; }

    /**
     * Функция присвоения значения полю {@link Product#MaxArticle}
     * @param maxArticle максимальное значение артикула товара
     */
    public static void setMaxArticle(int maxArticle) { MaxArticle = maxArticle; }
}
