package termPaper1;

public class Employee {           // Создаем класс, информация о сотрудниках
    private int id;               // Статический счетчик сотрудника
    private String name;          // Ф.И.О. сотрудника
    private int department;       // Номер отдела 1-5
    private int salary;           // Зарплата сотрудника

    // Добавляет статистическую переменную - счетчик id
    private static int idCount = 1;

    public Employee(int id, String name, int department, int salary) {
        // добавляем подстановку и увеличение счетчика на 1
        this.id = idCount++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Геттеры всех полей класса
    public String getName() {               // Геттер фио сотрудника
        return this.name;
    }

    public int getDepartment() {        // Геттер номера отдела
        return this.department;
    }

    public int getSalary() {            // Геттер зарплаты сотрудника
        return this.salary;
    }

    public int getId() {            // Геттер зарплаты сотрудника
        return this.id;
    }

    // Сеттеры всех полей класса (по ТЗ только отдела и зарплаты, по критериям оценки все поля
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {      // Сеттер номера отдела
        this.salary = salary;
    }

    public void setId(int id) {      // Сеттер номера отдела
        this.id = id;
    }

    @Override
    public String toString() {
        String output = "Табельный номер " + id + " Отдел: " + department + " Сотрудник: " + name +
                " Зарплата сотрудника: " + String.format("%,d", salary);
        if (id <= 0) {
            output = "Неверный табельный номер " + id + " Отдел: " + department + " Сотрудник: " + name +
                    " Зарплата сотрудника: " + String.format("%,d", salary);
        }
        if (name.isEmpty()) {
            output = "Табельный номер " + id + " Отдел: " + department + " Не заполнено ФИО сотрудника " +
                    " Зарплата сотрудника: " + String.format("%,d", salary);
        }
        if (department < 0 || department > 5) {
            output = "Табельный номер " + id + " Неверный номер отдела: " + department + " Сотрудник: " + name +
                    " Зарплата сотрудника: " + String.format("%,d", salary);
        }
        if (salary <= 0) {
            output = "Табельный номер " + id + " Отдел: " + department + " Сотрудник: " + name +
                    " Нет данных о зарплате ";
        }
        return output;
    }

    // распечатываем сведения без номера отдела
    public String outputStaffList() {
        return "Табельный номер " + id + " Сотрудник: " + name +
                " Зарплата сотрудника: " + String.format("%,d", salary);
    }
}