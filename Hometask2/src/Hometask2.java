import java.util.Scanner;


/**
 * Created by Евген on 11.07.2017.
 */
public class Hometask2 {

    public static void main (String[] args){

        System.out.println("Решение уравнения ax^2 + bx + c = 0");

        Double x1Var;
        Double x2Var;

        System.out.print("Введите значение переменной а: ");
        Scanner sc = new Scanner (System.in);
        Double aVar;
        aVar = sc.nextDouble();

        System.out.print("Ввудите значение переменной b: ");
        Double bVar;
        bVar = sc.nextDouble();

        System.out.print("Введите значение переменной c: ");
        Double cVar;
        cVar = sc.nextDouble();

        if (aVar == 0) {
            if (bVar == 0) {
                System.out.println("В линенйом уравнении bx + c = 0 x не определен, так как коэффициент b = 0");
            } else {
                double x3Var;
                x3Var = -cVar / bVar;
                System.out.format("%f"+"x"+"%+f"+" = 0 %n" +"x = " +"%+f",bVar,cVar,x3Var);
            }
        }

        Double dVar;
        dVar = Math.pow(bVar,2) - 4*aVar*cVar;           //значение Дискриминанта

        if (dVar == 0){
            x1Var = -bVar/2*aVar;
            System.out.format("%f" +"x^2" +"%+f" +"x" +"%+f" +" = 0 %n",aVar,bVar,cVar);
            System.out.print("При данных условиях Дискриминант равен 0, а следовательно x1 = x2 = "+x1Var);
        }

        if (dVar>0) {
            x1Var = (-bVar + Math.pow(dVar, 0.5)) / (2 * aVar);
            x2Var = (-bVar - Math.pow(dVar, 0.5)) / (2 * aVar);
            System.out.format("%f" +"x^2" +"%+f" +"x" +"%+f" +" = 0 %n",aVar,bVar,cVar);
            System.out.format("x1 = " +"%+f%n" +"x2 = " +"%+f",x1Var,x2Var);

            }else{                                  //(dVar<0)
                double x1iVar;
                double x2iVar;
                x1Var = -bVar/(2 * aVar);
                x1iVar = Math.pow(dVar*(-1),0.5)/(2*aVar);
                x2Var = -bVar/(2*aVar);
                x2iVar = - Math.pow(dVar*(-1),0.5)/(2*aVar);
                System.out.format("%f" +"x^2" +"%+f" +"x" +"%+f" +" = 0%n",aVar,bVar,cVar);
                System.out.format("x1 = " +"%+f" +"%+f" +"i%n" +"x2 = " +"%+f" +"%+f"+"i",x1Var,x1iVar,x2Var,x2iVar);
        }
    }
}
