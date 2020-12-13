package ISTB_19_2_Pervykh.people;

import ISTB_19_2_Pervykh.menu.Menu_graphics;
import ISTB_19_2_Pervykh.menu.Menu_logic;

import java.util.ArrayList;
import java.util.Random;

public class Group {

    public static Random rnd = new Random();
    public static ArrayList<Staff> staff = new ArrayList<Staff>();

    public static void add (String[] list){
        switch (list[0]) {
            case "Рабочий":
                staff.add(new Worker(list[1], Integer.parseInt(list[2])));
                break;
            case "Инженер":
                staff.add(new Engineer(list[1], Integer.parseInt(list[2])));
                break;
            case "Администратор":
                staff.add(new Administration(list[1], Integer.parseInt(list[2])));
                break;
        }
    }

    public static void delete (String name) {
        int i = -1;
        for (Staff org: staff) {
            if (name.equals(org.getName())) i = staff.indexOf(org);
        }
        if (i != -1) {
            staff.remove(i);
            if (staff.size() == 0) Menu_logic.listNull = true;
        }
        else Menu_graphics.error("Сотрудник не найден");
    }

    public static void search (String name) {
        int check = 0;
        for (Staff stf : staff) {
            if (name.equals(stf.getName())) {
                System.out.println();
                stf.getInfo();
                check++;
            }
        }
        if (check == 0) Menu_graphics.error("Сотрудник не найден");
    }

    public static void info () {
        for (Staff stf : staff) {
            System.out.println();
            System.out.println("Сотрудник №" + (staff.indexOf(stf) + 1));
            System.out.println("Должность: " + stf.getProfession() + " Имя: " + stf.getName() + " Возраст: " + stf.getAge());
            System.out.println();
        }
    }

    public static void work (String name) {
        int check = 0;
        for (Staff stf : staff) {
            if (name.equals(stf.getName())) {
                stf.work();
                check++;
            }
        }
        if (check == 0) Menu_graphics.error("Сотрудник не найден");
    }

}
