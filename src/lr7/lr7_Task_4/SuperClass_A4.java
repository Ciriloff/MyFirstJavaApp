package lr7.lr7_Task_4;

public class SuperClass_A4 {
    public char ektchar;
    SuperClass_A4(){} //конструктор без переметров
    SuperClass_A4(char ektchar){ //параметризованный конструктор
        this.ektchar = ektchar;
    }
    SuperClass_A4(SuperClass_A4 superA4){ //конструктор копирования
        ektchar = superA4.ektchar;
    }
    public char getEktchar() {
        return ektchar;
    } //getter для печати значения в overrides методе

    public String toLine(){
        String superA4Name;
        superA4Name = "\n" + "СУПЕРКЛАСС " + "\n" +
                "Символьное поле = " + this.getEktchar() + "\n" +
                "Копия символьного поля = " + this.ektchar;
        return superA4Name;
    }
}
