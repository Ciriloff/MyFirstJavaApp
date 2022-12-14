package lr7.lr7_Task_4;

public class SubClass_F4 extends SubClass_B4 {
    public int ektint;
    SubClass_F4 (){} //конструктор без переметров
    SubClass_F4 (char ektchar, String ektstring, int ektint){ //параметризованный конструктор
        super(ektchar,ektstring); //обращение к конструктору суперкласса B4 с 2-я параметрами
        this.ektint = ektint;
    }
    SubClass_F4 (SubClass_F4 subF4){ //конструктор копирования
        super(subF4);
        ektint = subF4.ektint;
    }

    @Override
    public String toLine() {
        String subF4Name;
        subF4Name = "\n" + "ПОДКЛАСС F " + "\n" +
                "Символьное поле = " + this.getEktchar() + "\n" +
                "Текстовое поле = " + this.getEktstring() + "\n" +
                "Целочисленное поле = " + this.ektint + "\n" +
                "Копия целочисленного поля = " + this.ektint;
        return subF4Name;
    }
}
