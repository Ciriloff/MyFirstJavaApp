package lr7.lr7_Task_4;

public class SubClass_B4 extends SuperClass_A4 {
    public String ektstring;
    SubClass_B4 (){} //конструктор без переметров
    SubClass_B4 (char ektchar, String ektstring){ //параметризованный конструктор
        super(ektchar); //обращение к конструктору суперкласса A4 с 1-м параметром
        this.ektstring = ektstring;
    }
    SubClass_B4(SubClass_B4 subB4){ //конструктор копирования
        super(subB4);
        ektstring = subB4.ektstring;
    }
    public String getEktstring() {
        return ektstring;
    } //getter для печати значения в overrides методе

    @Override
    public String toLine(){
        String subB4Name;
        subB4Name = "\n" + "ПОДКЛАСС B " + "\n" +
                "Символьное поле = " + this.getEktchar() + "\n" +
                "Текстовое поле = " + this.getEktstring() + "\n" +
                "Копия текстового поля = " + this.ektstring;
        return subB4Name;
    }
}
