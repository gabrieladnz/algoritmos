package sav.Parametros;

import static sav.Parametros.CategorizarParametro.*;
import static sav.Parametros.ValidarParametro.formatarValor;

/**
 * The type Exibir parametro.
 */
public class ExibirParametro {
    /**
     * Receber parametro validar parametro . parametros validados.
     *
     * @param args the args
     * @return the validar parametro . parametros validados
     */
    public static ValidarParametro.ParametrosValidados receberParametro(String[] args) {
        char tipoDeAlgoritmo = args[0].charAt(0);
        char tipoDeLista = args[1].charAt(0);
        String tipoDeOrdenamento = args[2];
        char tipoValorDaLista = args[3].charAt(0);
        String valorDaLista = args[4];
        int pausaIteracao = Integer.parseInt(args[5]);

        exibirParametro(tipoDeAlgoritmo, tipoDeLista, tipoDeOrdenamento, tipoValorDaLista, valorDaLista, pausaIteracao);
        return new ValidarParametro.ParametrosValidados(tipoDeAlgoritmo, tipoDeLista, tipoDeOrdenamento, tipoValorDaLista, valorDaLista, pausaIteracao);
    }

    /**
     * Exibir parametro.
     *
     * @param tipoDeAlgoritmo   the tipo de algoritmo
     * @param tipoDeLista       the tipo de lista
     * @param tipoDeOrdenamento the tipo de ordenamento
     * @param tipoValorDaLista  the tipo valor da lista
     * @param valorDaLista      the valor da lista
     * @param pausaIteracao     the pausa iteracao
     */
    protected static void exibirParametro(char tipoDeAlgoritmo, char tipoDeLista, String tipoDeOrdenamento, char tipoValorDaLista, String valorDaLista, int pausaIteracao) {
        if (categoriaTipoValorListaAleatoria(tipoValorDaLista)) {
            System.out.println("a=" + tipoDeAlgoritmo + " t=" + tipoDeLista + " o=" + tipoDeOrdenamento + " in=" + tipoValorDaLista + " r=\"" + valorDaLista + "\"" + " s=" + pausaIteracao + "\n");
            verificarCategoriaAleatorio(tipoValorDaLista, tipoDeLista, valorDaLista, tipoDeAlgoritmo, tipoDeOrdenamento, pausaIteracao);
        } else {
            System.out.println("a=" + tipoDeAlgoritmo + " t=" + tipoDeLista + " o=" + tipoDeOrdenamento + " in=" + tipoValorDaLista + " v=\"" + formatarValor(valorDaLista) + "\"" + " s=" + pausaIteracao + "\n");
            System.out.println("Lista original: [" + valorDaLista + "]");
            verificarCategoriaManual(tipoDeAlgoritmo, tipoDeLista, valorDaLista, tipoDeOrdenamento, pausaIteracao);
        }
    }
}
