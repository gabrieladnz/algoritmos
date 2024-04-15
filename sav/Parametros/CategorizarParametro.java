package sav.Parametros;

import sav.AlgoritmoOrdenacao.BubbleSort;
import sav.AlgoritmoOrdenacao.InsertionSort;

/**
 * The type Categorizar parametro.
 */
public class CategorizarParametro {
    /**
     * Verifica se a String representa um valor numérico.
     *
     * @param str valor a ser verificado
     * @return true se o valor for numérico
     */
    protected static boolean categoriaNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Verifica se a String representa um valor composto por caracteres do alfabeto.
     *
     * @param str valor a ser verificado
     * @return true se o valor for uma String
     */
    protected static boolean categoriaString(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    /**
     * Categoria tipo algoritmo char.
     *
     * @param tipoAlgoritmo     the tipo algoritmo
     * @param tipoDeLista       the tipo de lista
     * @param resultadoFinal    the resultado final
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param speed             the speed
     * @return the char
     */
    protected static char categoriaTipoAlgoritmo(char tipoAlgoritmo, char tipoDeLista, String resultadoFinal, String tipoDeOrdenamento, int speed) {
        tipoAlgoritmo = Character.toLowerCase(tipoAlgoritmo);

        long temporizador = System.currentTimeMillis();

        switch (tipoAlgoritmo) {
            case 'b':
                if (Character.toLowerCase(tipoDeLista) == 'n') {
                    BubbleSort.bubbleSort(resultadoFinal.toCharArray(), tipoDeOrdenamento, speed);
                } else if (Character.toLowerCase(tipoDeLista) == 'c') {
                    BubbleSort.bubbleSort(resultadoFinal.toCharArray(), tipoDeOrdenamento, speed);
                }
                break;
            case 'i':
            case 's':
                if (Character.toLowerCase(tipoDeLista) == 'n') {
                    InsertionSort.insertionSort(resultadoFinal.toCharArray(), tipoDeOrdenamento, speed);
                } else if (Character.toLowerCase(tipoDeLista) == 'c') {
                    InsertionSort.insertionSort(resultadoFinal.toCharArray(), tipoDeOrdenamento, speed);
                }
                break;
            default:
                System.out.println("Tipo de algoritmo desconhecido");
                break;
        }

        long tempoFinal = System.currentTimeMillis();
        long tempoTotal = tempoFinal - temporizador;
        System.out.println("Tempo total para ordenar: " + tempoTotal + " milissegundos");

        return tipoAlgoritmo;
    }

    /**
     * Categoria tipo valor lista aleatoria boolean.
     *
     * @param tipoValorLista the tipo valor lista
     * @return the boolean
     */
    protected static boolean categoriaTipoValorListaAleatoria(char tipoValorLista) {
        return Character.toLowerCase(tipoValorLista) == 'r' ? true : false;
    }

    /**
     * Verificar categoria manual.
     *
     * @param tipoDeAlgoritmo   the tipo de algoritmo
     * @param tipoDeLista       the tipo de lista
     * @param valorDaLista      the valor da lista
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param pausaIteracao     the pausa iteracao
     */
    protected static void verificarCategoriaManual(char tipoDeAlgoritmo, char tipoDeLista, String valorDaLista, String tipoDeOrdenamento, int pausaIteracao) {
        if (tipoDeLista == 'n' && categoriaNumero(valorDaLista)) {
            categoriaTipoAlgoritmo(tipoDeAlgoritmo, tipoDeLista, valorDaLista, tipoDeOrdenamento, pausaIteracao);
        } else if (tipoDeLista == 'c' && categoriaString(valorDaLista)) {
            categoriaTipoAlgoritmo(tipoDeAlgoritmo, tipoDeLista, valorDaLista, tipoDeOrdenamento, pausaIteracao);
        }
    }

    /**
     * Verificar categoria aleatorio.
     *
     * @param tipoValorDaLista  the tipo valor da lista
     * @param tipoDeLista       the tipo de lista
     * @param tamanho           the tamanho
     * @param tipoDeAlgoritmo   the tipo de algoritmo
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param pausaIteracao     the pausa iteracao
     */
    protected static void verificarCategoriaAleatorio(char tipoValorDaLista, char tipoDeLista, String tamanho, char tipoDeAlgoritmo, String tipoDeOrdenamento, int pausaIteracao) {
        int tamanhoNumerico = Integer.parseInt(tamanho);

        if (categoriaTipoValorListaAleatoria(tipoValorDaLista)) {
            if (Character.toLowerCase(tipoDeLista) == 'n') {
                GerarValorAleatorio.gerarValorAleatorioNumerico(tamanhoNumerico, tipoDeAlgoritmo, tipoDeLista, tipoDeOrdenamento, pausaIteracao);
            } else {
                GerarValorAleatorio.gerarValorAleatorioCaractere(tamanhoNumerico, tipoDeAlgoritmo, tipoDeLista, tipoDeOrdenamento, pausaIteracao);
            }
        }
    }
}