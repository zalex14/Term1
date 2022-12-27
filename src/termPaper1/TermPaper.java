package termPaper1;

public class TermPaper {
    // Создаем Employee, содержит информацию о ФИО, отделе, зарплате сотрудника. Отделы от 1 до 5.
    private static final Employee[] staff = {
            new Employee(1, "Иванов Иван Иванович", 1, 20000),
            new Employee(2, "Петров Петр Петрович", 2, 21000),
            new Employee(3, "Сидоров Сидор Сидорович", 2, 22000),
            new Employee(4, "Андреев Андрей Андреевич", 4, 23000),
            new Employee(5, "Федоров Федр Федорович", 5, 24000),
            new Employee(6, "Кузнецов Александр Александрович", 1, 25000),
            new Employee(7, "Соколов Артем Матвеевич", 2, 26000),
            new Employee(8, "Васильев Михаил Васильевич", 3, 27000),
            new Employee(9, "Богданов Даниил Данилович", 4, 28000),
            new Employee(10, "Комаров Марк Львович", 5, 29000)
    };

    // Список всех сотрудников Задание 1.а
    public static void gettingOutPrintStaff() {
        for (Employee employee : staff) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // Месячный фонд на зарплату Задание 1.b
    public static int gettingSalaryFund() {                             // в рублях
        int fund = 0;
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0) {         // исключаем ошибки с отрицательной зарплатой
                fund += employee.getSalary();
            }
        }
        return fund;
    }

    // Определяем сотрудника с минимальной зарплатой Задание 1.с
    public static Employee gettingStaffMinSalary() {
        Employee result = staff[0];
        int minSalary = staff[0].getSalary();
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0 && employee.getSalary() < minSalary) {  // исключаем ошибки с отрицательной зарплатой
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Определяем сотрудника с максимальной зарплатой Задание 1.d
    public static Employee gettingStaffMaxSalary() {
        Employee result = staff[0];
        int maxSalary = staff[0].getSalary();
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0 && employee.getSalary() > maxSalary) {  // исключаем ошибки с отрицательной зарплатой
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Средняя зарплата персонала Задание 1.e
    public static double gettingAverageSalary() {
        int staffAmount = 0;
        double averageSalary = 0;
        for (Employee employee : staff) {    // извлекаем число сотрудников
            if (employee != null) {
                staffAmount++;
            }
        }
        if (staffAmount > 0) {
            averageSalary = gettingSalaryFund() / (float) staffAmount;
        }
        return averageSalary;
    }

    // Получаем список ФИО всех сотрудников 1.f
    public static void gettingStaffList() {
        for (Employee employee : staff) {
            if (employee != null && !employee.getName().isEmpty()) {
                System.out.println(employee.getName());
            }
        }
    }

    // Часть 2
// Индексируем зарплату сотрудников
    public static void indexingSalary(double rate) {
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0) {
                employee.setSalary((int) (employee.getSalary() * (1.00 + rate / 100.00)));
            }
        }
    }

    // Определяем сотрудника отдела с минимальной зарплатой
    public static Employee gettingDepartmentMinSalaryStaff(int department) {
        Employee result = null;
        int minSalary = 0;
        if (department > 0 && department <= 5) {
            for (Employee employee : staff) {
                if (employee != null && employee.getDepartment() == department && minSalary == 0) {
                    minSalary = employee.getSalary();      // запоминаем первичное значение минимальной зарплаты из первого найденного сотрдника отдела
                    result = employee;
                }
                if (employee != null && employee.getSalary() > 0 && employee.getSalary() < minSalary && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;

                }
            }
        }
        return result;
    }

    // Определяем сотрудника отдела с максимальной зарплатой
    public static Employee gettingDepartmentMaxSalaryStaff(int department) {
        Employee result = null;
        int maxSalary = 0;
        if (department > 0 && department <= 5) {
            for (Employee employee : staff) {
                if (employee != null && employee.getDepartment() == department && maxSalary == 0) {
                    maxSalary = employee.getSalary();      // запоминаем первичное значение минимальной зарплаты из первого найденного сотрдника отдела
                    result = employee;
                }
                if (employee != null && employee.getSalary() > 0 && employee.getSalary() > maxSalary && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;

                }
            }
        }
        return result;
    }

    // Месячный фонд зарплаты отдела
    public static int gettingDepartmentFund(int department) {
        int fund = 0;
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0 && employee.getDepartment() == department) {
                fund += employee.getSalary();
            }
        }
        return fund;
    }

    // Средняя зарплата по отделу
    public static double gettingAverageDepartmentSalary(int department) {
        int staffAmount = 0;
        double averageSalary = 0;
        for (Employee employee : staff) {
            if (employee != null && employee.getDepartment() == department) {
                staffAmount++;
            }
            if (staffAmount > 0 && employee.getDepartment() == department) {
                averageSalary = gettingDepartmentFund(department) / (float) staffAmount;
            }
        }
        return averageSalary;
    }

    // Индексируем зарплату сотрудникам отдела
    public static void indexingSalaryDepartment(double rate, int department) {
        for (Employee employee : staff) {
            if (employee != null && employee.getSalary() > 0 && employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * (1.00 + rate / 100.00)));
            }
        }
    }

    // Получаем список сотрудников отдела
    public static void gettingStaffDepartment(int department) {
        for (Employee employee : staff) {
            if (employee != null && !employee.getName().isEmpty() && employee.getDepartment() == department) {
                System.out.println(employee.outputStaffList());
            }
        }
    }

    // Получаем список сотрудников с зарплатой ниже пороговой величины
    public static void gettingStaffLessSalary(int salary) {
        for (Employee employee : staff) {
            if (employee != null && !employee.getName().isEmpty() && employee.getSalary() <= salary) {
                System.out.println(employee.outputStaffList());
            }
        }
    }

    // Получаем список сотрудников с зарплатой выше или равной пороговой величины
    public static void gettingStaffMoreSalary(int salary) {
        for (Employee employee : staff) {
            if (employee != null && !employee.getName().isEmpty() && employee.getSalary() >= salary) {
                System.out.println(employee.outputStaffList());
            }
        }
    }
}