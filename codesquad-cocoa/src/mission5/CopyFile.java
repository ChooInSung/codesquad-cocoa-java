package mission5;

import java.io.*;

public class CopyFile {

    String firstFileName;
    String secondFileName;

    public CopyFile(String firstFileName, String secondFileName) {
        this.firstFileName = firstFileName;
        this.secondFileName = secondFileName;
    }

    public void copyFile() {
        try {
            InputStream in = new FileInputStream("./src/mission5/" + this.firstFileName);
            OutputStream out = new FileOutputStream("./src/mission5/" + this.secondFileName);

            int readLen;
            byte[] buf = new byte[1024];

            while (true) {
                readLen = in.read(buf);
                if (readLen == -1) {
                    break;
                }
                out.write(buf, 0, readLen);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
