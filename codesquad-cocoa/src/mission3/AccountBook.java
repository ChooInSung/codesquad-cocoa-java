package mission3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountBook {

    String userName;
    String password;
    String[] data = new String[4];


    public static void main(String args[]) {
        AccountBook accountBook = new AccountBook();
        String menu;
        String index;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        accountBook.addUserInfo();
        try {
            menu = br.readLine();

            while (!menu.equals("finish")) {

                if (menu.equals("delete")) {
                    accountBook.deleteData();
                }

                if (menu.equals("update")) {
                    accountBook.updateData();
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUserInfo() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("사용자 이름을 입력하세요 : ");
            userName = br.readLine();
            System.out.print("비밀번호를 입력하세요 : ");
            password = br.readLine();
            System.out.print("날짜를 입력하세요 : ");
            data[0] = br.readLine();
            System.out.print("적요를 입력하세요 : ");
            data[1] = br.readLine();
            System.out.print("수입을 입력하세요 : ");
            data[2] = br.readLine();
            System.out.print("지출을 입력하세요 : ");
            data[3] = br.readLine();

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        int index;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("삭제할 data index 번호를 입력하세요 : ");
            index = Integer.parseInt(br.readLine());

            while (index < 0 || index > 3) {
                System.out.println("index가 잘못 입력되었습니다. index를 다시 입력해주세요");
                System.out.print("index : ");
                index = Integer.parseInt(br.readLine());
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        data[index] = null;
    }

    public void updateData() {
        int index = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("update할 index 번호를 입력해주세요.");
            System.out.print("index : ");
            index = Integer.parseInt(br.readLine());
            while (index < 0 || index > 3) {
                System.out.println("index가 잘못 입력되었습니다. index를 다시 입력해주세요");
                System.out.print("index : ");
                index = Integer.parseInt(br.readLine());
            }
            System.out.print("다시 입력할 정보를 입력해주세요 : ");
            data[index] = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
