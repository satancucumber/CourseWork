/**
 * Класс человека со свойствами <b>Name</b>, <b>Lastname</b>, <b>Patronymic</b>, <b>PhoneNumber</b>, <b>Email</b>, <b>Date</b>   и <b>Exp</b>.
 * @autor Милана Лицеванова
 * @version 1.0
 */
public class Person {
    protected String Name;
    protected String Lastname;
    protected String Patronymic;
    protected String PhoneNumber;
    protected String Email;
    protected String Date;
    protected int Exp;

    /**
     * Конструктор класса {@link Person}
     */
    public Person() {
        setName("");
        setLastname("");
        setPatronymic("");
        setDate("00.00.0000");
        setPhoneNumber("0-000-00-00");
        setEmail("info@gmail.com");
        setExp(0);
    }

    /**
     * Конструктор класса {@link Person}
     * @param name Имя человека
     * @param lastname Фамилия человека
     * @param patronymic Отчество человека
     * @param exp Опыт работы человека
     * @param date Дата рождения человека
     * @param email Адрес электронной почты человека
     * @param phoneNumber Номер телефона человека
     */
    public Person(String name, String lastname, String patronymic, String date, String phoneNumber, String email, int exp) {
        setName(name);
        setLastname(lastname);
        setPatronymic(patronymic);
        setDate(date);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setExp(0);
    }
    /**
     * Функция получения значения поля {@link Person#Date}
     * @return возвращает дату рождения человека
     */
    public String getDate() {
        return Date;
    }
    /**
     * Функция получения значения поля {@link Person#Email}
     * @return возвращает адрес электронной почты человека
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Функция получения значения поля {@link Person#PhoneNumber}
     * @return возвращает номер телефона человека
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * Функция получения значения поля {@link Person#Exp}
     * @return возвращает рабочий стаж
     */
    public int getExp() {
        return Exp;
    }

    /**
     * Функция получения значения поля {@link Person#Lastname}
     * @return возвращает фамилию
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * Функция получения значения поля {@link Person#Name}
     * @return возвращает имя
     */
    public String getName() {
        return Name;
    }

    /**
     * Функция получения значения поля {@link Person#Patronymic}
     * @return возвращает отчество
     */
    public String getPatronymic() {
        return Patronymic;
    }

    /**
     * Функция присвоения значения полю {@link Person#Exp}
     * @param exp Опыт работы человека
     */
    public void setExp(int exp) {
        Exp = exp;
    }

    /**
     * Функция присвоения значения полю {@link Person#Date}
     * @param date дата рождения
     */
    public void setDate(String date) {
        Date = date;
    }

    /**
     * Функция присвоения значения полю {@link Person#Email}
     * @param email адрес электронной почты
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * Функция присвоения значения полю {@link Person#PhoneNumber}
     * @param phoneNumber номер телефона
     */
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    /**
     * Функция присвоения значения полю {@link Person#Lastname}
     * @param lastname Фамилия человека
     */
    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    /**
     * Функция присвояния значения полю {@link Person#Name}
     * @param name Имя человека
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Функция присвоения значения полю {@link Person#Patronymic}
     * @param patronymic Отчество человека
     */
    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }
}
