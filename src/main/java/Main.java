import ru.netology.javaqa.netology_java_maven_homework2.services.RestMonthsService;

public class Main {
    public static void main(String[] args) {
        RestMonthsService service = new RestMonthsService();
        int restMonths = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Количество месяцев отдыха в следующем году: " + restMonths);
    }
}
