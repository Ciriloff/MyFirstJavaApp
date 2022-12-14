package lr7.lr7_Task_2;

public class SubClassTask_2 extends SuperClassTask_2 {
    public int numOne;
    SubClassTask_2(String exVvod){super(exVvod);}
    SubClassTask_2(String exVvod2, int exVvod3){
        super(exVvod2);
        this.numOne = exVvod3;
    }
    SubClassTask_2(){numOne = 0;}

    @Override
    public String toString() { //переопределенный метод Суперкласса
        String subClassName;
        subClassName = "ПОДКЛАСС" + "\n" +
                //" Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Текстовое поле = " + this.getLetOne() + "\n" + " Длина текста " + this.getLetOne().length() + "\n" +
                " Целочисленное поле = " + this.getNumOne();
        return subClassName;
    }
    public String toString(String str1){ //переопределенный метод Суперкласса
        this.setLetOne(str1); //используем значение переданного в метод аргумента
        String subName;
        subName = "ПОДКЛАСС" + "\n" +
                " Текстовое поле = " + str1 + "\n" + " Длина текста " + this.getLetOne().length() + "\n" +
                " Целочисленное поле = " + this.getNumOne();
        return subName;
    }
    public String toString(String str1, int number){ //перегруженный метод
        this.setNumOne(number); //используем значение переданного в метод аргумента
        this.setLetOne(str1); //используем значение переданного в метод аргумента
        String subName;
        subName = "ПОДКЛАСС" + "\n" +
                " Текстовое поле = " + str1 + "\n" + " Длина текста " + this.getLetOne().length() + "\n" +
                " Целочисленное поле = " + this.getNumOne();
        return subName;
    }
    public String toString(int number){ //перегруженный метод
        super.setLetOne(); //используем setter Суперкласса. т.к. ничего не передаем, а получаем значение из Суперкласса
        this.setNumOne(number); //используем значение переданного в метод аргумента
        String subName;
        subName = "ПОДКЛАСС" + "\n" +
                " Текстовое поле = " + this.getLetOne() + "\n" + " Длина текста " + this.getLetOne().length() + "\n" +
                " Целочисленное поле = " + this.getNumOne();
        return subName;
    }
    public int getNumOne() {
        return numOne;
    }
    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }
}
