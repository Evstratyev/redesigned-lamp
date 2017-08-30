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

        int buf = array[0];
        for (int i = 1; i < array.length - 1; i++) {

            if (buf > array[i]) {
                buf = array[i];
            }
        }

        System.out.println("Минимальное значение массива " + buf);

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " " + array[i]);
        }

        System.out.println("");

        for (int i = array.length; i != 0; i--) {

            for (int j = 0; j != i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
        
        System.out.print("Сортировка 'пузырьком': ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
