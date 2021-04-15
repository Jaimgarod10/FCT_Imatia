package GestorDeTareas;

import javax.swing.*;
import java.io.File;

public class TasksManager {

    FileManager fm = new FileManager();

    public Tasks createTask() {
        Tasks task = new Tasks(JOptionPane.showInputDialog("NameTask: "), JOptionPane.showInputDialog("Priority: "), JOptionPane.showInputDialog("Deadline: "));
        System.out.println("Task created.");
        return task;
    }

    public void showTasks(String nameF) {
        File f = new File(nameF);
        fm.readLines(f);
    }

    public String deleteTask(){
        String dTask = (JOptionPane.showInputDialog("Introduce the name that you want to eliminate: "));
        System.out.println("Task eliminated");
        return  dTask;
    }

    public void exit(){
        System.exit(0);
    }
}
