import ru.netology.javaqa.javaqamvn.services.BonusService;
public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long actiual = service.calculate(5_000, true);
        System.out.println("1. " + expected + " == ? == " + actiual);

    }
}
