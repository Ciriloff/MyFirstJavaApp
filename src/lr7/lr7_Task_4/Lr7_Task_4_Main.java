package lr7.lr7_Task_4;

public class Lr7_Task_4_Main {
    public static void main(String[] args) {
        SuperClass_A4 superA4 = new SuperClass_A4('Z');
        String superImiy = superA4.toLine();
        System.out.println(superImiy);

        SubClass_B4 subB4 = new SubClass_B4('G',"Первый подкласс");
        String subImiy = subB4.toLine();
        System.out.println(subImiy);

        SubClass_F4 subF4 = new SubClass_F4('X', "Второй подкласс", 333);
        String subImiyF4 = subF4.toLine();
        System.out.println(subImiyF4);

        SuperClass_A4 superA4copy = new SuperClass_A4(superA4);
        superA4copy.ektchar = 'W';
        String superImiycopy = superA4copy.toLine();
        System.out.println(superImiycopy);

        SubClass_B4 subB4copy = new SubClass_B4(subB4);
        subB4copy.ektchar = 'V';
        subB4copy.ektstring = "Замена копии";
        String subImiycopy = subB4copy.toLine();
        System.out.println(subImiycopy);

        SubClass_F4 subF4copy = new SubClass_F4(subF4);
        subF4copy.ektchar = 'U';
        subF4copy.ektstring = "Ещё одна копия";
        subF4copy.ektint = 555;
        String subImiycopyF = subF4copy.toLine();
        System.out.println(subImiycopyF);
    }
}
