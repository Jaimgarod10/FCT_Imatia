package GestorDeTareas;

import java.io.File;

public class TaskManager {

    /*

    Statement:

    Implement a program that allows us to manage tasks through a terminal.
    The program will load and save the tasks in a text file, to which you can add new tasks and delete tasks.
    The program interface is left to the developer's choice. Consider that the requirements must be met.

    For example the program could have the following commands:
        > appName data.txt add 'New task.'
        > appName data.txt list
        > appName data.txt remove 'New *'

    Requirements:
        • Load tasks from a text file.
        • Save tasks in a text file.
        • Create tasks.
        • List tasks.
        • Delete tasks.
    */

    public static void main(String[] args) {

        File f = new File("Tasks.txt");
        Menu menu = new Menu();
        menu.Menu();
    }
}
