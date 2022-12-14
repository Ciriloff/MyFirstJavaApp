package lr7.lr7_Task_5;

public class SuperA5Class {
    private String superstring;
    SuperA5Class(){}
    SuperA5Class(String superstring){
        this.superstring = superstring;
    }
    public String getSuperstring() {
        return superstring;
    }
    public String toTekst(){
        String nameA5super;
        nameA5super = "\n" + "СУПЕРКЛАСС A5: " + this.getClass().getSimpleName() + "\n" +
                "Текстовое поле: " + superstring;
        return nameA5super;
    }
}
