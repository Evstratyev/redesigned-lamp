import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

/**
 * Created by Евген on 16.07.2017.
 */
public class FirstClass {
    public static void main(String[] args) {

        System.out.println("Введите Фималию Имя Отчество");
        Scanner a = new Scanner(System.in);
        String Var = a.nextLine();

        char res1;
        char res2;
        char res3;

        System.out.print("Фамилия: ");
        for (int i = 0; i <= Var.length()-1; i++) {

            res1 = Var.charAt(i);
            int count = i;

            if (res1 != ' ') {
                System.out.print(res1);
            } else {

                System.out.print("\nИмя: ");
                for (int q = count + 1; q <= Var.length() - 1; q++) {

                    res2 = Var.charAt(q);
                    int count2 = q;

                    if (res2 != ' ') {
                        System.out.print(res2);
                    } else {

                        System.out.print("\nОтчество: ");
                        for (int w = count2 + 1; w <= Var.length() - 1; w++) {

                            if (w < Var.length()) {
                                break;
                            } else {

                                res3 = Var.charAt(w);

                                System.out.print(res3);
                            }
                        }
                    }
                }
                break;              // почему сработалоооооо ????????????????????
            }
        }
    }
}