import java.util.ArrayList;

/**
 * Класс продавца со свойствами <b>Name</b>, <b>Lastname</b>, <b>Patronymic</b>, <b>Exp</b>, <b>PhoneNumber</b>, <b>Email</b>, <b>Date</b>, <b>Id</b> и <b>MaxId</b>.
 * @autor Милана Лицеванова
 * @version 1.0
 */
public class Seller extends Person {
    private static int MaxId = 0;
    private int Id;

    /**
     * Конструктор класса {@link Seller}
     */
    public Seller() {
        super("", "", "", "00.00.0000", "0-000-00-00", "info@gmail.com",0);
        setId(MaxId++);
    }

    /**
     * Конструктор класса {@link Seller}
     * @param name Имя продавца
     * @param lastname Фамилия продавца
     * @param patronymic Отчество Продавца
     * @param exp Опыт работы продавца
     * @param id ID продавца
     * @param date Дата рождения человека
     * @param email Адрес электронной почты человека
     * @param phoneNumber Номер телефона человека
     */
    public Seller(String name, String lastname, String patronymic, String date, String phoneNumber, String email, int exp, int id) {
        super(name, lastname, patronymic, date, phoneNumber, email, exp);
        setId(id);
    }

    /**
     * Функция получения значения поля {@link Seller#Id}
     * @return возвращает ID продавца
     */
    public int getId() {
        return Id;
    }

    /**
     * Функция присвоения значения полю {@link Seller#Id}
     */
    public void setId(int id) {
        Id = id;
    }

    /**
     * Функция получения значения поля {@link Seller#MaxId}
     * @return возвращает максимальное значения ID
     */
    public static int getMaxId() {
        return MaxId;
    }

    /**
     * Функция присвоения значения полю {@link Seller#MaxId}
     * @param maxId максимальное значение ID
     */
    public static void setMaxId(int maxId) { MaxId = maxId; }

    /**
     * Функция уменьшения количества продукта в списке продуктов (продажи продукта) магазина
     * @param shop магазин
     * @param product Продукт
     */
    public void sellProduct(Shop shop, Product product) {

    }
}
