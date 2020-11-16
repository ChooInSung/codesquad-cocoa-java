package mission3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun2630 {

    int[][] arr;

    public static void main(String[] args) {
        Baekjun2630 main = new Baekjun2630();
        main.setArr();
    }

    public void setArr() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int size = Integer.parseInt(br.readLine());
            this.arr = new int[size][size];
            String lineOfArr;
            for (int i = 0; i < size; i++) {
                lineOfArr = br.readLine();
                StringTokenizer st = new StringTokenizer(lineOfArr, " ");
                int index = 0;
                while (st.hasMoreTokens()) {
                    this.arr[i][index++] = Integer.parseInt(st.nextToken());
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
