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


        Scanner sc = new Scanner(System.in);          //4ое задание : вывод по возрастанию , но каждый раз в формате System.out.print(min + mid + max)

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min, mid, max;

        if ((a > b || a > c) && (a < b || a < c)) {                                   // если а это mid
            if (c > b) {
                min = b;
                mid = a;
                max = c;
                System.out.print(min + " " + mid + " " + max);
            } else {
                min = c;
                mid = a;
                max = b;
                System.out.print(min + " " + mid + " " + max);
            }
        }
        if (a > b && a > c && b > c) {                                              //если а это max
            min = c;
            mid = b;
            max = a;
            System.out.print(min + " " + mid + " " + max);
        } else if (a > b && a > c && b < c) {
            min = b;
            mid = c;
            max = a;
            System.out.print(min + " " + mid + " " + max);
        }
        if (a < b && a < c) {                                                           // если a это min
            if (c > b) {
                min = a;
                mid = b;
                max = c;
                System.out.print(min + " " + mid + " " + max);
            } else if (c < b) {
                min = a;
                mid = c;
                max = b;
                System.out.print(min + " " + mid + " " + max);
            }
        }
        if ((a == b || a == c) && (b != c)) {                                           //если а == b или с
            if (a == b && b > c) {
                min = c;
                mid = max = a;
                System.out.print(min + " " + mid + " " + max);
            } else if (a == b && b < c) {
                min = mid = a;
                max = c;
                System.out.print(min + " " + mid + " " + max);
            }
            if (a == c && b > c) {
                min = mid = c;
                max = b;
                System.out.print(min + " " + mid + " " + max);
            } else if (a == c && b < c) {
                min = b;
                mid = max = c;
                System.out.print(min + " " + mid + " " + max);
            }
        }
        if (b == c && b > a) {                                                          // если b == c && !a
            min = a;
            mid = max = b;
            System.out.print(min + " " + mid + " " + max);
        } else if (b == c && b < a) {
            min = mid = b;
            max = a;
            System.out.print(min + " " + mid + " " + max);
        }
        if (a == b && a == c) {                                                         // если a == b == c
            min = mid = max = a;
            System.out.print(min + " " + mid + " " + max);
        }
    }
}