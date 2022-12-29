import termPaper1.TermPaper;

public class Main {
    public static void main(String[] args) {
        int salary;
        int department;
        System.out.println("\nКурсовая работа 1");

        System.out.println("\n1a.Получить список всех сотрудников со всеми имеющимися по ним данными");
        TermPaper.gettingOutPrintStaff();

        System.out.println("\n1b.Посчитать сумму затрат на зарплаты в месяц");
        System.out.println(String.format("%,d", TermPaper.gettingSalaryFund()));

        System.out.println("\n1c.Найти сотрудника с минимальной зарплатой");
        System.out.println(TermPaper.gettingStaffMinSalary());


        System.out.println("\n1d.Найти сотрудника с максимальной зарплатой");
        System.out.println(TermPaper.gettingStaffMaxSalary());

        System.out.println("\n1e.Подсчитать среднее значение зарплаты сотрудников");
        System.out.println(String.format("%.2f", TermPaper.gettingAverageSalary()));


        System.out.println("\n1f.Получить Ф.И.О. всех сотрудников");
        TermPaper.gettingStaffList();

        System.out.println("\n2-1 Индексируем зарплату сотрудникам на произвольный %");
        TermPaper.indexingSalary(10.5);
        TermPaper.gettingOutPrintStaff();

        department = 2;
        System.out.println("\n2-2a Сотрудник отдела с минимальной зарплатой. Отдел " + department);
        System.out.println(TermPaper.gettingDepartmentMinSalaryStaff(department));

        System.out.println("\n2-2b Максимальная зарплата по отделу. Отдел " + department);
        System.out.println(TermPaper.gettingDepartmentMaxSalaryStaff(department));

        System.out.println("\n2-2c Фонд зарплаты отдела. Отдел " + department);
        System.out.println(String.format("%,d", TermPaper.gettingDepartmentFund(department)));

        System.out.println("\n2-2d Средняя зарплата сотрудника отдела. Отдел " + department);
        System.out.println(String.format("%.2f", TermPaper.gettingAverageDepartmentSalary(department)));

        System.out.println("\n2-2e Индексируем зарплату сотрудников отдела на произвольный %. Отдел " + department);
        TermPaper.indexingSalaryDepartment(10.5, department);

        System.out.println("\n2-2f.Получаем список сотрудников отдела. Отдел " + department);
        TermPaper.gettingStaffDepartment(department);

        salary = 27_000;
        System.out.println("\n2-3a.Получаем список сотрудников c зарплатой меньше " + salary + " рублей");
        TermPaper.gettingStaffLessSalary(salary);

        System.out.println("\n2-3b.Получаем список сотрудников c зарплатой выше " + salary + " рублей");
        TermPaper.gettingStaffMoreSalary(salary);
    }
}