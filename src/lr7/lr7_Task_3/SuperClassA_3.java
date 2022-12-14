package lr7.lr7_Task_3;

public class SuperClassA_3 {
    public int rize; // по условиям задания переменная должна быть public
    SuperClassA_3(){}
    SuperClassA_3(int intVvod){
        this.rize = intVvod;
    }
    public void setRize(int rize) {
        this.rize = rize;
    }
    public int getRize() { //получаем значение переменной текущего супперкласса
        return rize;
    }
    public String toString(){
        String superClassAname;
        superClassAname = "СУПЕРКЛАСС" + "\n" +
                " Имя класса: " + this.getClass().getSimpleName() + "\n" +
                " Поле класса целочисленное = " + this.getRize() + "\n";
        return superClassAname;
    }
}
