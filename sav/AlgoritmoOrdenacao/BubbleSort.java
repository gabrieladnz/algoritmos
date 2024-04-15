package sav.AlgoritmoOrdenacao;

import static sav.VisualizarAlgoritmo.RenderizarAlgoritmo.*;

/**
 * The type Bubble sort.
 */
public class BubbleSort {
    /**
     * Bubble sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void bubbleSort(int[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (order.equalsIgnoreCase("az") && arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    renderizarArrayInt(arr);
                } else if (order.equalsIgnoreCase("za") && arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    renderizarArrayInt(arr);
                }
            }
        }
    }

    /**
     * Bubble sort.
     *
     * @param arr   the arr
     * @param order the order
     * @param speed the speed
     */
    public static void bubbleSort(char[] arr, String order, int speed) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (order.equalsIgnoreCase("az") && arr[j] > arr[j + 1]) {
                    // Swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    renderizarArrayChar(arr);
                } else if (order.equalsIgnoreCase("za") && arr[j] < arr[j + 1]) {
                    // Swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    renderizarArrayChar(arr);
                }
            }
        }
    }
}
