package sav.AlgoritmoOrdenacao;

import static sav.VisualizarAlgoritmo.RenderizarAlgoritmo.renderizarArrayChar;
import static sav.VisualizarAlgoritmo.RenderizarAlgoritmo.renderizarArrayInt;

/**
 * The type Insertion sort.
 */
public class InsertionSort {
    /**
     * Insertion sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void insertionSort(int[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && ((order.equalsIgnoreCase("az") && arr[j] > key) || (order.equalsIgnoreCase("za") && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            renderizarArrayInt(arr);
        }
    }

    /**
     * Insertion sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void insertionSort(char[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            char key = arr[i];
            int j = i - 1;
            while (j >= 0 && ((order.equalsIgnoreCase("az") && arr[j] > key) || (order.equalsIgnoreCase("za") && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            renderizarArrayChar(arr);
        }
    }
}
