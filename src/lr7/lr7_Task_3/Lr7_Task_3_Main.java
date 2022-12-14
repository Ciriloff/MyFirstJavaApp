package lr7.lr7_Task_3;

public class Lr7_Task_3_Main {
    public static void main(String[] args) {
        SuperClassA_3 superA = new SuperClassA_3();
        superA.setRize(10);
        String superName = superA.toString();
        System.out.println(superName);

        SubClassB_3 subB = new SubClassB_3();
        subB.setRizechar(20,'S');
        String subNameB = subB.toString();
        System.out.println(subNameB);

        SubClassD_3 subD = new SubClassD_3();
        subD.setRizeString(45,'Z', "Строка");
        String subNameD = subD.toString();
        System.out.println(subNameD);
    }
}
