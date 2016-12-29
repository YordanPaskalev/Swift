
import java.io.File;
import java.util.Scanner;

public class Task2_ListRelativeFileStructure {

    static void directoryNext(File file) {
        for (int i = 0; i < file.listFiles().length; i++) {

            if (file.listFiles()[i].isDirectory()) {
                System.out.println(file.listFiles()[i]);
                directoryNext(file.listFiles()[i]);
            } else if (file.listFiles()[i].isFile()) {

                System.out.println(file.listFiles()[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dir = sc.nextLine();
        File directory = new File(dir);
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println(file);
            } else {
                System.out.println(file);
                directoryNext(file);
            }
        }
    }

}
