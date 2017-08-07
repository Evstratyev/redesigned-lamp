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


        Scanner sc = new Scanner(System.in);                          // третье задание: вывод чисел по возрастанию (3 числа)

        System.out.print("Значение а: ");
        int a = sc.nextInt();
        System.out.print("Значение b: ");
        int b = sc.nextInt();
        System.out.print("Значение c: ");
        int c = sc.nextInt();

        int i, j;

        if ((a < b || a == b) && (a < c || a == c)) {                 // a min || a = b = c
            if (b > c || b == c) {
                j = b;
                i = c;
            } else {
                i = b;
                j = c;
            }
            System.out.print("Результат: " +a + "," + i + "," + j);
        }

        if ((a > b || a == b) && (a > c || a == c) && (a != b && a != c)) {                 // a max
            if (b > c || b == c) {
                j = b;
                i = c;
            } else {
                i = b;
                j = c;
            }
            System.out.print("Результат: " +i + "," + j + "," + a);
        }

        if ((a > b && a < c) || (a > c && a < b)) {                                        // a mid
            if (b > c) {
                i = c;
                j = b;
            } else {
                i = b;
                j = c;
            }
            System.out.print("Результат: " +i + "," + a + "," + j);
        }


//        Scanner sc = new Scanner(System.in);          //4ое задание : вывод по возрастанию , но каждый раз в формате System.out.print(min + mid + max)
//
//        System.out.print("Значение а: ");
//        int a = sc.nextInt();
//        System.out.print("Значение b: ");
//        int b = sc.nextInt();
//        System.out.print("Значение c: ");
//        int c = sc.nextInt();
//
//        int i;
//
//        if ( a > b ) {
//            i = b ;
//            b = a ;
//            a = i ;
//        }
//
//        if ( b > c ) {
//            i = c ;
//            c = b ;
//            b = i ;
//        }
//
//        if ( a > b ) {
//            i = b ;
//            b = a ;
//            a = i ;
//        }
//
//        System.out.print("Результат: " +a +"," +b +"," +c);
    }
}