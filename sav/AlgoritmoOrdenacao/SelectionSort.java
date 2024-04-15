package sav.AlgoritmoOrdenacao;

import static sav.VisualizarAlgoritmo.RenderizarAlgoritmo.renderizarArrayChar;
import static sav.VisualizarAlgoritmo.RenderizarAlgoritmo.renderizarArrayInt;

/**
 * The type Selection sort.
 */
public class SelectionSort {
    /**
     * Selection sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void selectionSort(int[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (order.equalsIgnoreCase("az") && arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else if (order.equalsIgnoreCase("za") && arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            renderizarArrayInt(arr);
        }
    }

    /**
     * Selection sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void selectionSort(char[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (order.equalsIgnoreCase("az") && arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else if (order.equalsIgnoreCase("za") && arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            char temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            renderizarArrayChar(arr);
        }
    }
}
