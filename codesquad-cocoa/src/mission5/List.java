package mission5;

import java.io.File;

public class List {

    public void printCurrentFileList() {
        File dir = new File("./src/mission5");
        String[] fileList = dir.list();
        for (String filename : fileList) {
            System.out.print(filename + " ");
        }
        System.out.println();
    }

}
