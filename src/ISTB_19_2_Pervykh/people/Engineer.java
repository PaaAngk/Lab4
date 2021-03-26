package ISTB_19_2_Pervykh.people;

public class Engineer extends Staff {

    public Engineer () {
        super("Костик",18,"Инженер");
    }

    public Engineer (String name, int age) {
        super(name,age,"Инженер");
    }

    @Override
    public String work () {
        return "Новый день - новый чертёж!";
    }

}
