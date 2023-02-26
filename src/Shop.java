import java.util.ArrayList;

/**
 * Класс магазина со свойствами <b>Address</b>, <b>Specialization</b>, <b>Director</b>, <b>Products</b> и <b>Sellers</b>.
 * @autor Милана Лицеванова
 * @version 1.0
 */
public class Shop {
    private String Address;
    private String Specialization;
    private Person Director;
    private ArrayList<Product> Products;
    private ArrayList<Seller> Sellers;

    /**
     * Конструктор класса {@link Shop}
     */
    public Shop() {
        setAddress("");
        setSpecialization("");
        Director = new Person();
        Products = new ArrayList<Product>();
        Sellers = new ArrayList<Seller>();

    }

    /**
     * Конструктор класса {@link Shop}
     * @param address Адрес магазина
     * @param specialization Специализация магазина
     * @param director Сведения о директоре магазина
     * @param products Список продуктов магазина
     * @param sellers Список продавцов магазина
     */
    public Shop(String address, String specialization, Person director, ArrayList<Product> products, ArrayList<Seller> sellers ) {
        setAddress(address);
        setSpecialization(specialization);
        setDirector(director);
        setProducts(products);
        setSellers(sellers);
    }

    /**
     * Функция получения значения поля {@link Shop#Address}
     * @return возвращает адрес магазина
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Функция получения значения поля {@link Shop#Specialization}
     * @return возвращает специализацию магазина
     */
    public String getSpecialization() {
        return Specialization;
    }

    /**
     * Функция получения значения поля {@link Shop#Director}
     * @return возвращает сведения о директоре магазина
     */
    public Person getDirector() {
        return Director;
    }

    /**
     * Функция получения значения поля {@link Shop#Products}
     * @return возвращает список товаров, продающихся в магазине
     */
    public ArrayList<Product> getProducts() {
        return Products;
    }

    /**
     * Функция получения значения поля {@link Shop#Sellers}
     * @return возвращает список продавцов, работающих в магазине
     */
    public ArrayList<Seller> getSellers() {
        return Sellers;
    }

    /**
     * Функция присвоения значения полю {@link Shop#Address}
     * @param address Адрес магазина
     */
    public void setAddress(String address) {
        Address = address;
    }

    /**
     * Функция присвоения значения полю {@link Shop#Specialization}
     * @param specialization Специализация магазина
     */
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    /**
     * Функция присвоения значения полю {@link Shop#Director}
     * @param director Сведения о директоре магазина
     */
    public void setDirector(Person director) { Director = director; }

    /**
     * Функция присвоения значения полю {@link Shop#Products}
     * @param products Список продуктов магазина
     */
    public void setProducts(ArrayList<Product> products) { Products = products; }

    /**
     * Функция добавления нового продукта в список продуктов {@link Shop#Products}
     * @param product Новый продукт
     */
    public void addProduct(Product product) { Products.add(product); }

    /**
     * Функция присвоения значения полю {@link Shop#Sellers}
     * @param sellers Список продавцов магазина
     */
    public void setSellers(ArrayList<Seller> sellers) {
        Sellers = sellers;
    }

    /**
     * Функция добавления нового продавца в список продавцов {@link Shop#Sellers}
     * @param seller Новый продавец
     */
    public void addSeller(Seller seller) { Sellers.add(seller); }

    /**
     * Функция поиска продукта по артикулу
     * @param article Артикул продукта
     * @return Возвращает найденное значение или уведомляет, что значение не было найдено
     */
    public Product searchProduct(int article) {
        return new Product();
    }

    /**
     * Функция изменения записи о продукте по его артикулу
     * @param article Артикул продукта
     * @param new_name Новое название продукта
     * @param new_quantity Новое количество продукта
     * @param new_price Новая цена продукта
     */
    public void patchProduct(int article, String new_name, int new_quantity, int new_price){}

    /**
     * Функция удаления записи о продукте по его артикулу
     * @param article Артикул продукта
     */
    public void delProduct(int article){}

    /**
     * Функция поиска продавца по его ID
     * @param id ID продавца
     * @return Возвращает найденное значение или уведомляет, что значение не было найдено
     */
    public Seller searchSeller(int id) {
        return new Seller();
    }

    /**
     * Функция изменения записи о продавце по его ID
     * @param id ID продавца
     * @param new_name Новое имя продавца
     * @param new_lastname Новая фамилия продавца
     * @param new_patronymic Новое отчество продавца
     * @param new_exp Новый опыт работы продавца
     */
    public void patchSeller(int id, String new_name, String new_lastname, String new_patronymic, int new_exp){}

    /**
     * Функция удаления записи о продавце по его ID
     * @param id ID продавца
     */
    public void delSeller(int id){}
}
