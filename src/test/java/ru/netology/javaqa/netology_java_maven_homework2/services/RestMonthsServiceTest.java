package ru.netology.javaqa.netology_java_maven_homework2.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestMonthsServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "incomeExpensesThreshold.csv")
    public void RestMonthsServiceTestFirst(int expected, int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}