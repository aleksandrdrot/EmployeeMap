import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeBook {
    private Map<String, String> piople = new HashMap<>();

    public void addEmployee(String lastName, String firstName, String middleName) {
        if (!searchEmployee(lastName)) {
            String str = firstName + " " + middleName;
            piople.put(lastName, str);
            System.out.println("Сотрудник добавлен");
        } else {
            System.out.println("Сотрудник с такой фамилией уже есть!");
        }
    }

    public void removeEmployee(String lastName) {
        if (searchEmployee(lastName)) {
            piople.remove(lastName);
            System.out.println("Сотрудник удален!");
        } else {
            System.out.println("Сотрудник не найден!");
        }
    }

    public boolean searchEmployee(String lastName) {
        if (piople.containsKey(lastName)) {
            return true;
        } else {
            return false;
        }
    }

    public void search(String lastName) {
        if (searchEmployee(lastName)) {
            System.out.println(lastName + " " + piople.get(lastName));
        } else {
            System.out.println("Сотрудник не найден!");
        }
    }

    public String print() {
        return piople.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return Objects.equals(piople, that.piople);
    }

    @Override
    public int hashCode() {
        return Objects.hash(piople);
    }
}
