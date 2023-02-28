package OPD;
import java.util.Scanner;

public class OPD_Lr5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пользовательских экранов => ");
        int kUI = in.nextInt();
        System.out.println("Минимально возможное время на отладку 1-го экрана (часов) => ");
        int time1_1 = in.nextInt();
        System.out.println("Наиболее вероятное время отладки 1-го экрана (часов) => ");
        int time1_2 = in.nextInt();
        System.out.println("Максимальное время на отладку 1-го экрана (часов) => ");
        int time1_3 = in.nextInt();

        System.out.println("Введите количество обработчиков событий => ");
        int kAct = in.nextInt();
        System.out.println("Минимально возможное время отладки 1-го обработчика событий (часов) => ");
        int time2_1 = in.nextInt();
        System.out.println("Наиболее вероятное время отладки 1-го обработчика событий (часов) => ");
        int time2_2 = in.nextInt();
        System.out.println("Максимальное время отладки 1-го обработчика событий (часов) => ");
        int time2_3 = in.nextInt();

        System.out.println("Введите количество новых бизнес-объектов => ");
        int kBo = in.nextInt();
        System.out.println("Минимально возможное время отладки 1-го бизнес-объекта (часов) => ");
        int time3_1 = in.nextInt();
        System.out.println("Наиболее вероятное время отладки 1-го бизнес-объекта (часов) => ");
        int time3_2 = in.nextInt();
        System.out.println("Максимальное время отладки 1-го бизнес-объекта (часов) => ");
        int time3_3 = in.nextInt();

        System.out.println("Введите количество новых или модифицируемых бизнес-методов => ");
        int kMeth = in.nextInt();
        System.out.println("Минимально возможное время отладки 1-го бизнес-метода (часов) => ");
        int time4_1 = in.nextInt();
        System.out.println("Наиболее вероятное время отладки 1-го бизнес-метода (часов) => ");
        int time4_2 = in.nextInt();
        System.out.println("Максимальное время отладки 1-го бизнес-метода (часов) => ");
        int time4_3 = in.nextInt();

        double Eui = medE(time1_1, time1_2, time1_3);
        System.out.printf("Средняя трудоемкость кодирования пользовательского экрана равна %.2f чел*час\n", Eui);
        double Eact = medE(time2_1, time2_2, time2_3);
        System.out.printf("Средняя трудоемкость кодирования одного обработчика событий равна %.2f чел*час\n", Eact);
        double Ebo = medE(time3_1, time3_2, time3_3);
        System.out.printf("Средняя трудоемкость кодирования нового бизнес-объекта равна %.2f чел*час\n", Ebo);
        double Ebm = medE(time4_1, time4_2, time4_3);
        System.out.printf("Средняя трудоемкость кодирования нового бизнес-метода равна %.2f чел*час\n\n", Ebm);

        double CKOui = CKO(time1_1, time1_3);
        System.out.printf("Среднеквадратичное отклонение кодирования пользовательского экрана " +
                "равно %.2f чел*час\n", CKOui);
        double CKOact = CKO(time2_1, time2_3);
        System.out.printf("Среднеквадратичное отклонение кодирования одного обработчика событий " +
                "равна %.2f чел*час\n", CKOact);
        double CKOb = CKO(time3_1, time3_3);
        System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-объекта " +
                "равна %.2f чел*час\n", CKOb);
        double CKObm = CKO(time4_1,time4_3);
        System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-метода " +
                "равна %.2f чел*час\n\n", CKObm);

        double Ettl = Eui * kUI + Eact * kAct + Ebo * kBo + Ebm * kMeth;
        System.out.printf("Суммарная трудоемкость проекта равна %.2f чел*час\n\n", Ettl);
        double totCKO = Math.sqrt(kUI * Math.pow(CKOui, 2) + kAct * Math.pow(CKOact, 2) +
                kBo * Math.pow(CKOb, 2) + kMeth * Math.pow(CKObm, 2));
        System.out.printf("Среднеквадратичное отклонение суммарной трудоемкости кодирования проекта " +
                "равно %.2f чел*час\n", totCKO);
        double Etot95 = Ettl + 2 * totCKO;
        System.out.printf("Суммарная трудоемкость кодирования проекта с вероятность 95 процентов " +
                "равна %.2f чел*час\n", Etot95);
        double relativeCKO = (totCKO / Ettl) * 100;
        System.out.printf("Относительная погрешность в оценке суммарной трудоемкости кодирования " +
                "равна %.2f чел*час\n", relativeCKO);
        double wProject = 4 * Etot95;
        System.out.printf("Общая трудоемкость проекта равна %.2f чел*час\n", wProject);
        double manMonthTotalE = wProject / 132;
        System.out.printf("Общая трудоемкость проекта равна %.2f чел*мес.\n", manMonthTotalE);
        double duration = 2.5 * Math.pow(manMonthTotalE, 1./3);
        System.out.printf("Оптимальная продолжительность проекта равна %.1f месяцев\n", duration);
        double teams = manMonthTotalE / duration;
        System.out.printf("Средняя численность команды равна %.1f человек", teams);
    }
    // Оценка средней трудоемкости кодирования
    public static double medE(int min, int probable, int worst) {
        return (double) (worst + 4 * probable + min)/ 6;
    }
    // Среднеквадратичное отклонение
    public static double CKO(int min, int worst) {
        return (double) (worst - min) / 6;
    }
}
