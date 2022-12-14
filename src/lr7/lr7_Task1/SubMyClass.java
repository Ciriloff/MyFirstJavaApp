package lr7.lr7_Task1;

public class SubMyClass extends SuperMyClass {
    private String let2;
    private String let3;
    SubMyClass(String strVxod){ //конструктор с одним параметром
        super(strVxod);
    }
    SubMyClass(String strVxod2, String strVxod3){ //конструктор с двумя параметрами
        this.let2 = strVxod2;
        this.let3 = strVxod3;
    }
    @Override
    public String toString(){
        String subMyClassName;
        subMyClassName = "ПОДКЛАСС" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Текстовое поле = " + this.getLet1() + "\n" +
                " Текстовое поле = " + this.let2 + "\n" +
                " Текстовое поле = " + this.let3;
        return subMyClassName;
    }
    public String getLet3(){
        return let3;
    }
    public void setLet3(String str3){
        this.let3 = str3;
    }
    public String getLet2(){
        return let2;
    }
    public void setLet2(String str2){
        this.let2 = str2;
    }
}