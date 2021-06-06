package ru.gb.hw.hw5;

public class HW5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", "Posintion1", "JD@domain.com", "123456789", 100000, 25),
                new Employee("Darth Vader", "Position2", "anakin@domail.com", "123456780", 1000000, 45),
                new Employee("Cal Lightman", "Position3", "lietome@domain.com", "123456781", 250000, 47),
                new Employee("Gregory House", "Position4", "housemd@domain.com", "123456782", 250000, 52),
                new Employee("Shaun Murphy", "Position5", "thegooddoctor@domain.com", "123456783", 150000,29)
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.information();
            }
        }
    }
    public static class Employee {
        private final String name;
        private final String position;
        private final String email;
        private final String phonenumber;
        private final int salary;
        private final int age;

        public Employee(String name, String position, String email, String phonenumber, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phonenumber = phonenumber;
            this.salary = salary;
            this.age = age;
        }

        public void information() {
            String infoData = "Сотрудник: %s\nДолжность: %s\nE-Mail: %s\nТелефон: %s\nЗарплата: %d\nВозраст: %d\n\n";
            System.out.printf(infoData, name, position, email, phonenumber, salary, age);
        }

        public int getAge () {
            return age;
        }
    }

}
