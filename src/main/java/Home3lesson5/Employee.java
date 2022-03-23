package Home3lesson5;

public class Employee {
    private String username;
    private String name;
    private String patronymic;
    private String post;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public Employee (String username, String name, String patronymic, String post,
                     String email, int telephone, int salary, int age) {
        this.username = username;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
        getAge(age);
    }
    public void info() {
        System.out.println("Фамилия: " + username + " Имя: " + name + " Отчество: " + patronymic +
                " Должность " + post + " email " + email + " Телефон " + telephone + " Зарплата " +
                salary + " Возраст " + age);
    }
    public void getAge(int age) {
        if (age > 40) {
            info();
        }
    }
}
