package lesson9.labs.prob11b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final Function<List<Employee>, String> EMPLOYEES_WITH_HIGH_SALARY_AND_LASTNAME_N_TO_Z =
            emps -> emps.stream()
                    .filter(e -> e.getSalary() > 100000)
                    .filter(e -> e.getLastName().charAt(0) >= 'N' && e.getLastName().charAt(0) <= 'Z')
                    .map(Employee::fullName)
                    .sorted()
                    .collect(Collectors.joining(", "));
}
