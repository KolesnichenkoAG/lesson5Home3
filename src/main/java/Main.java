import Home3lesson5.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 5 Home 3");

        Employee[]employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов", "Иван", "Иванович",
                "Директор", "ivanovIvan@mail.ru", 87052272, 6000, 45);
        employeesArray[1] = new Employee("Сидоров", "Сергей", "Петрович",
                "Юрист", "sidorovSer@mail.ru", 87057755, 4000, 37);
        employeesArray[2] = new Employee("Андрейчук", "Владимир", "Анатольевич",
                "Завхоз", "andriechykBlad@mail.ru", 87057788, 4500, 63);
        employeesArray[3] = new Employee("Шаруденко", "Александр", "Юрьевич",
                "Финансист", "scharudenkoAlex@mail.ru", 87057777, 5000, 39);
        employeesArray[4] = new Employee("Белых", "Валерий", "Сергеевич",
                "водитель", "belyxVal@mail.ru", 87057799, 3700, 67);

    }
}
