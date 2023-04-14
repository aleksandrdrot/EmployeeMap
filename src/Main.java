public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();
        employee.addEmployee("Пушкин", "Александр", "Сергеевич");
        employee.addEmployee("Гришин", "Александр", "Николаевич");
        employee.addEmployee("Пупков", "Максим", "Викторович");
        employee.addEmployee("Пупков", "Александр", "Викторович");
        employee.addEmployee("Перов", "Дмитрий", "Иванович");

        System.out.println(employee.print());

        employee.addEmployee("Пупков", "Максим", "Викторович");

        employee.removeEmployee("Перов");

        System.out.println(employee.print());

        employee.search("Пушкин");
    }
}