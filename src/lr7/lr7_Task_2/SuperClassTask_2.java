package lr7.lr7_Task_2;

public class SuperClassTask_2 {
    private String letOne;
    SuperClassTask_2(String strVvod){
        this.letOne = strVvod;
    }
    SuperClassTask_2(){}
    public String toString(){ //метод переопределен в Подклассе
        String superClassName;
        superClassName = "СУПЕРКЛАСС" + "\n" +
                //" Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Текстовое поле = " + this.getLetOne() + "\n" + " Длина текста " + this.getLetOne().length();
        return superClassName;
    }
    public String toString(String str2){ //метод переопределен в Подклассе
        this.setLetOne(str2); //используем значение переданного в метод аргумента
        String superClassTwoName;
        superClassTwoName = "СУПЕРКЛАСС" + "\n" +
                " Текстовое поле = " + this.getLetOne() + "\n" + " Длина текста " + this.getLetOne().length();
        return superClassTwoName;
    }
    public String getLetOne() {
        return letOne;
    }
    public void setLetOne(String letOne) {
        this.letOne = letOne;
    }
    public void setLetOne() {
        this.letOne = "Из Суперкласса, Setter без параметров";
    }
}
