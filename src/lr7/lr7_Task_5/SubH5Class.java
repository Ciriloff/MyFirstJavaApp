package lr7.lr7_Task_5;

public class SubH5Class extends SuperA5Class {
    private char rur;
    SubH5Class(){}
    SubH5Class(String substring, char rur){
        super(substring);
        this.rur = rur;
    }

    @Override
    public String toTekst() {
        String nameH5sub;
        nameH5sub = "\n" + "ПОДКЛАСС H: " + this.getClass().getSimpleName() + "\n" +
                "Текстовое поле: " + this.getSuperstring() + "\n" +
                "Символьное поле: " + this.rur;
        return nameH5sub;
    }
}
