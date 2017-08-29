/**
 * Created by Евген on 25.08.2017.
 */
public class FirstClass {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            if (array[i] % 3 == 0 && array[i] != 0) {
                System.out.println(+array[i] + "" + " кратно 3");
            }
        }

        System.out.println("");

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i+1]){
                int a = array[i];
                array[i] = array[i+1];
                array[i+1] = a;
            }
        }

        System.out.println("Минимальное значение массива " +array[array.length - 1]);

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " " + array[i]);
        }

        System.out.println("");

        int m, z;
        int q = 0;
        while (q < array.length * (array.length - 1)) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    z = array[i];
                    m = array[i + 1];
                    array[i + 1] = z;
                    array[i] = m;
                }
                q++;
            }
        }
        System.out.print("Сортировка 'пузырьком': ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
