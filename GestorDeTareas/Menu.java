package GestorDeTareas;

import javax.swing.*;

public class Menu {

    TasksManager m = new TasksManager();
    FileManager fm = new FileManager();

    public void Menu(){
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("   MENU:  \n1--> Create task. \n2--> Show tasks. \n3--> Delete task \n4--> Exit"));
            switch (option) {
                case 1:
                    Tasks task =  m.createTask();
                    fm.write("Tasks.txt",task);
                    break;
                case 2:
                    m.showTasks("Tasks.txt");
                    break;
                case 3:
                    String dTask = m.deleteTask();
                    fm.deleteLines(dTask);
                    break;
                case 4:
                    m.exit();
                    break;
            }
        } while (option < 6);
            System.out.println("The option has to be < 5. Restart the program.");
    }
}