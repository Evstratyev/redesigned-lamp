import java.util.Scanner;

/**
 * Created by Евген on 25.07.2017.
 */
public class FirstClass {
    public static void main(String[] args) {

//        System.out.print("Введите число a ");                 // перводе задание : вывод мин макс числа
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.print("Введите число b ");
//        int b = sc.nextInt();
//
//        if (a < b) {
//            System.out.print("a Min: " + a);
//        } else {
//            System.out.print("b Min: " + b);
//        }
//


//        System.out.print("Введите число а ");                         // второе задание : из 3х чичсел найти минимум
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.print("Введите число b ");
//        int b = sc.nextInt();
//        System.out.print("Введите число c ");
//        int c = sc.nextInt();
//
//        if (b > a && c > a) {
//            System.out.print("a min : " + a);
//        } else {
//            if (b > c) {
//                System.out.print("c min : " + c);
//            } else {
//                System.out.print("b min : " + b);
//            }
//        }


//        Scanner sc = new Scanner(System.in);                          // вывод чисел по возрастанию (3 числа)
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (b > a && c > a) {
//            if (c > b) {
//                System.out.print(a + " , " + b + " , " + c);
//            } else {
//                System.out.print(a + " , " + c + " , " + b);
//            }
//        }
//        if (a > b && a > c) {
//            if (c > b) {
//                System.out.print(b + " , " + c + " , " + a);
//            } else {
//                System.out.print(c + " , " + b + " , " + a);
//            }
//        }
//        if ((a < b || a < c) && (a > b || a > c)) {
//            if (c > b) {
//                System.out.print(b + " , " + a + " , " + c);
//            } else {
//                System.out.print(c + " , " + a + " , " + b);
//            }
//        }


        Scanner sc = new Scanner(System.in);          //4ое задание : вывод по возрастанию , но каждый раз в формате
                                                      //       System.out.print(min + mid + max)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min;
        int mid;
        int max;

        if ( a > b || a > c){
            if (c > b){
                min = b;
                mid = a;
                max = c;
                System.out.print(min +" " +mid +" " +max);
            }else{
                min = c;
                mid = a;
                max = b;
                System.out.print(min +" " +mid +" " +max);
            }
        }
        if ( a < b && a < c){
            if (c > b){
                min = a;
                mid = b;
                max = c;
                System.out.print(min +" " +mid +" " +max);
            }else{
                min = a;
                mid = c;
                max = b;
                System.out.print(min +" " +mid +" " +max);
            }
        }
    }
}
