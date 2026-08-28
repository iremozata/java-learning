//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(1000000));
        }
    }
}
