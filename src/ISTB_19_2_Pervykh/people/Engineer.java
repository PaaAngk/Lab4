package ISTB_19_2_Pervykh.people;

import ISTB_19_2_Pervykh.menu.Menu_graphics;

public class Engineer extends Staff {

    public Engineer () {
        super("Костик",18,"Инженер");
    }

    public Engineer (String name, int age) {
        super(name,age,"Инженер");
    }

    @Override
    public void work () {
        System.out.printf("Новый день - новый чертёж!");
    }

}
