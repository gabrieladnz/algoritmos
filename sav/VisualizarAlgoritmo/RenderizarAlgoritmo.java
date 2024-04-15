package sav.VisualizarAlgoritmo;

/**
 * The type Renderizar algoritmo.
 */
public class RenderizarAlgoritmo {
    /**
     * Renderizar array int.
     *
     * @param array the array
     */
    public static void renderizarArrayInt(int[] array) {
        System.out.print("Iteração: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Renderizar array char.
     *
     * @param array the array
     */
    public static void renderizarArrayChar(char[] array) {
        System.out.print("Iteração: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
