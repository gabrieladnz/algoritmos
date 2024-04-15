package sav.Parametros;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static sav.Parametros.CategorizarParametro.categoriaTipoAlgoritmo;

/**
 * The type Gerar valor aleatorio.
 */
public class GerarValorAleatorio {
    /**
     * Gerar valor aleatorio numerico.
     *
     * @param tamanho           the tamanho
     * @param tipoDeAlgoritmo   the tipo de algoritmo
     * @param tipoDeLista       the tipo de lista
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param speed             the speed
     */
    protected static void gerarValorAleatorioNumerico(int tamanho, char tipoDeAlgoritmo, char tipoDeLista, String tipoDeOrdenamento, int speed) {
        Random random = new Random();

        StringBuilder valoresAleatorios = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio = random.nextInt(2100) - 1000;
            valoresAleatorios.append(numeroAleatorio);
        }

        String resultadoFinal = valoresAleatorios.toString();
        System.out.println("Lista original: [" + resultadoFinal + "]");

        categoriaTipoAlgoritmo(tipoDeAlgoritmo, tipoDeLista, resultadoFinal, tipoDeOrdenamento, speed);
    }

    /**
     * Gerar valor aleatorio caractere.
     *
     * @param tamanho           the tamanho
     * @param tipoDeAlgoritmo   the tipo de algoritmo
     * @param tipoDeLista       the tipo de lista
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param speed             the speed
     */
    protected static void gerarValorAleatorioCaractere(int tamanho, char tipoDeAlgoritmo, char tipoDeLista, String tipoDeOrdenamento, int speed) {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder valoresAleatorios = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
            char caractereAleatorio = caracteresPermitidos.charAt(indiceAleatorio);
            valoresAleatorios.append(caractereAleatorio);
        }

        String resultadoFinal = valoresAleatorios.toString();
        System.out.println("Lista original: [" + resultadoFinal + "]");
        categoriaTipoAlgoritmo(tipoDeAlgoritmo, tipoDeLista, resultadoFinal, tipoDeOrdenamento, speed);
    }
}
