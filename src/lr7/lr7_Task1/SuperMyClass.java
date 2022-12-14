package lr7.lr7_Task1;

public class SuperMyClass {
    private String let1; //закрытое текстовое поле
    SuperMyClass(String strVxod){ //конструктор с текстовым аргументом
        this.let1 = strVxod;
    }
    SuperMyClass(){
    }
    @Override
    public String toString(){
        String superMyClassName;
        superMyClassName = "СУПЕРКЛАСС" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Текстовое поле = " + this.getLet1();
        return superMyClassName;
    }
    public String getLet1(){
        return let1;
    }
    public void setLet1(String strVxod){
        this.let1 = strVxod;
    }
}
