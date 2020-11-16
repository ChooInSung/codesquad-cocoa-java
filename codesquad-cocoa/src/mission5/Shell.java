package mission5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("hash> ");
            String[] command = br.readLine().split(" ");

            while (!command[0].equals("quit")) {

                if (command[0].equals("ls")) {
                    List list = new List();
                    list.printCurrentFileList();
                }

                if (command[0].equals("cp")) {
                    CopyFile cf = new CopyFile(command[1], command[2]);
                    cf.copyFile();
                }

                System.out.print("hash> ");
                command = br.readLine().split(" ");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
