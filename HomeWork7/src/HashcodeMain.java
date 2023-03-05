

public class HashcodeMain {

    public static void main(String[] args) {
        // Создать класс Сотрудник (Employee) с полями:
        // Имя, Фамилия (String)
        // Название отдела (String)
        // Зарплата (double)
        // Реализовать equals и hashCode, который работает только с именем и фамилией

        Employee employee1 = new Employee("Иван", "Иванов", "бухгалтерия", 21345.23);
        Employee employee2 = new Employee("Иван", "Иванов", "отдел кадров", 41345.23);
        Employee employee3 = new Employee("Петр", "Петров", "маркетинг", 31345.23);

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
    }

}
