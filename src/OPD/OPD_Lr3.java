package OPD;
import java.util.Scanner;
public class OPD_Lr3 {
    public static void main(String[] args) {
        System.out.println("Планируемый срок выполнения проекта в месяцах: ");
        Scanner data = new Scanner(System.in);
        double planDays = data.nextDouble();
        System.out.println("Планируемый размер бюджета: ");
        double planBudget = data.nextDouble();
        System.out.println("Количество месяцев с начала проекта: ");
        double controlDays = data.nextDouble();
        System.out.println("Фактические затраты на текущий момент в у.е.: ");
        double facktBudget = data.nextDouble();
        System.out.println("Стадия готовности проекта на текущий момент (в процентах):");
        double percent = data.nextDouble();
        double delayDays = ((((controlDays * 30) / percent) * 100) - (planDays * 30));
        double overBudget = ((facktBudget / percent) * 100) - planBudget;
        System.out.println("Задержка срока выполнения проекта в днях: " + (int)delayDays);
        System.out.println("Перерасход бюджета составит: " + overBudget);
    }
}
