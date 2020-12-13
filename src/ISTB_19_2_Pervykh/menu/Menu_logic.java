package ISTB_19_2_Pervykh.menu;

import ISTB_19_2_Pervykh.people.Group;

public class Menu_logic {

    //Статус пустоты списка (true = пустой)
    public static boolean listNull = true;

    //Обработка команд
    public static void menuChanger (String command) {
        switch (command) {
            case "new":
                Group.add(Menu_control.add());
                listNull = false;
                break;
            case "delete":
                if (!listNull)
                    Group.delete(Menu_control.staffName());
                else
                    Menu_graphics.error("Список сотрудников пуст");
                break;
            case  "search":
                if (!listNull)
                    Group.search(Menu_control.staffName());
                else
                    Menu_graphics.error("Список сотрудников пуст");
                break;
            case "info":
                if (!listNull)
                    Group.info();
                else
                    Menu_graphics.error("Список сотрудников пуст");
                break;
            case "work":
                if (!listNull)
                    Group.work(Menu_control.staffName());
                else
                    Menu_graphics.error("Список сотрудников пуст");
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

}
