package lr7.lr7_Task_5;

public class SubG5Class extends SuperA5Class {
    private int wush;
    SubG5Class(){} //конструктор без переметров
    SubG5Class(String substring, int wush){
        super(substring);
        this.wush = wush;
    }
    @Override
    public String toTekst() {
        String nameG5sub;
        nameG5sub = "\n" + "ПОДКЛАСС G: " + this.getClass().getSimpleName() + "\n" +
                "Текстовое поле: " + this.getSuperstring() + "\n" +
                "Целочисленное поле: " + this.wush;
        return nameG5sub;
    }
}
