package GestorDeTareas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileManager {

    PrintWriter esc = null;
    FileWriter fich;
    Scanner sc;

    public void write(String nombreFich, Tasks t) {

        try {
            File f = new File(nombreFich);
            fich = new FileWriter(f.getAbsoluteFile(),true);
            esc = new PrintWriter(fich);
            esc.println(t.toString());


        } catch (IOException ex) {
            System.out.println("Writing error: " + ex.getMessage());

        } finally {
            esc.close();
        }
    }

    public void readLines(File fichero) {
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                System.out.println("Lines to show: \n" + sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error in the line: " + ex.getMessage());
        }
    }

    public void deleteLines(String taskName){
        Path path = Paths.get("Tasks.txt");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines = lines.stream().filter(linea->!linea.contains(taskName)).collect(Collectors.toList());
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
