package ISTB_19_2_Pervykh.people;

import ISTB_19_2_Pervykh.menu.Menu_graphics;

import java.util.Random;

public class Worker extends Staff {

    Random random = new Random();

    public Worker () {
        super("Костик",18,"Рабочий");
    }

    public Worker (String name, int age) {
        super(name,age,"Рабочий");
    }

    @Override
    public void work () {
        int salary = random.nextInt(6);
        if (salary < 3) System.out.printf("Неудачный день - маленькие деньги%n");
        else System.out.printf("Удачный день - большие деньги%n");
    }

}
