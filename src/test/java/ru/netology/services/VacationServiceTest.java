package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

@ParameterizedTest
@CsvFileSource(files="src/test/resources/vacation.csv")
public void testVacation(int income, int expenses, int threshold) {

    VacationService service = new VacationService();
    int actual = service.calculate(income, expenses, threshold);
    System.out.println(actual);

}
}
