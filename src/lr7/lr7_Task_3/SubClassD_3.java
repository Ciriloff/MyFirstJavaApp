package lr7.lr7_Task_3;

public class SubClassD_3 extends SubClassB_3 {
    public String rizeString;
    SubClassD_3 (){}
    SubClassD_3 (int intVvodB, char rizechar, String rizeString){ //конструктор с 3-я параметрами
        super(intVvodB, rizechar); //обращение к конструктору суперкласса с 2-я параметрами
        this.rizeString = rizeString;
    }
    public void setRizeString(int intVvodB, char rizechar, String rizeString) { //метод с 3-я параметрами
        super.setRizechar(intVvodB,rizechar); //обращение к методу суперкласса с 2-я параметрами
        this.rizeString = rizeString;
    }
    public String getRizeString() {
        return rizeString;
    } //получаем значение переменной текущего подкласса
    @Override
    public String toString() { //переопределенный метод суперкласса SubClassB_3
        String subClassDname;
        subClassDname = "ПОДКЛАСС" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Поле класса целочисленное = " + this.getRize() + "\n" +
                " Поле класса символьное = " + this.getRizechar() + "\n" +
                " Поле класса текстовое = " + this.getRizeString() + "\n";
        return subClassDname;
    }
}
