package ISTB_19_2_Pervykh.menu;

import ISTB_19_2_Pervykh.people.Group;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private Group data;
    public MyTableModel(Group group){
        this.data = group;
    }

    // Количество строк
    @Override
    public int getRowCount() {
        return data.getSize();
    }
    // Количество столбцов
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Профессия";
            case 1: return "Имя";
            default: return "Возраст";
        }
    }

    // Функция определения данных ячейки
    @Override
    public Object getValueAt(int row, int column)
    {
        switch (column) {
            case 0: return data.getStaff(row).getProfession();
            case 1: return data.getStaff(row).getName();
            case 2: return data.getStaff(row).getAge();
        }
        return "Не определена";
    }
}
