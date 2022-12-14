package lr7.lr7_Task_3;

public class SubClassB_3 extends SuperClassA_3 {
    public char rizechar;
    SubClassB_3 (){}
    SubClassB_3 (int intVvodB, char rizechar){ //конструктор с 2-я параметрами
        super(intVvodB); //обращение к конструктору суперкласса с 1-м параметром
        this.rizechar = rizechar;
    }
    public void setRizechar(int intVvodB, char rizechar) { //метод с 2-я параметрами
        super.setRize(intVvodB); //обращение к методу суперкласса с 1-м параметром
        this.rizechar = rizechar;
    }
    public char getRizechar() {
        return rizechar;
    } //получаем значение переменной текущего подкласса
    @Override
    public String toString(){ //переопределенный метод суперкласса SuperClassA_3
        String subClassBname;
        subClassBname = "ПОДКЛАСС" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Поле класса целочисленное = " + this.getRize() + "\n" +
                " Поле класса символьное = " + this.getRizechar() + "\n";
        return subClassBname;
    }
}
