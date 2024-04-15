package sav.Parametros;

/**
 * Classe responsável por validar parâmetros e direcionar a aplicação do algoritmo de ordenação
 */
public class ValidarParametro {
    /**
     * The type Parametros validados.
     */
    public static class ParametrosValidados {
        private char tipoDeAlgoritmo;
        private char tipoDeLista;
        private String tipoDeOrdenamento;
        private char tipoValorDaLista;
        private String valorDaLista;
        private int pausaIteracao;

        /**
         * Instantiates a new Parametros validados.
         *
         * @param tipoDeAlgoritmo   the tipo de algoritmo
         * @param tipoDeLista       the tipo de lista
         * @param tipoDeOrdenamento the tipo de ordenamento
         * @param tipoValorDaLista  the tipo valor da lista
         * @param valorDaLista      the valor da lista
         * @param pausaIteracao     the pausa iteracao
         */
        protected ParametrosValidados(char tipoDeAlgoritmo, char tipoDeLista, String tipoDeOrdenamento, char tipoValorDaLista, String valorDaLista, int pausaIteracao) {
            this.tipoDeAlgoritmo = tipoDeAlgoritmo;
            this.tipoDeLista = tipoDeLista;
            this.tipoDeOrdenamento = tipoDeOrdenamento;
            this.tipoValorDaLista = tipoValorDaLista;
            this.valorDaLista = valorDaLista;
            this.pausaIteracao = pausaIteracao;
        }
    }

    /**
     * Filtra e formata o valor de entrada, adicionando vírgulas e espaços entre os valores no retorno.
     *
     * @param valorParametro o valor a ser filtrado e formatado.
     * @return uma String contendo o valor separado e formatado.
     */
    protected static String formatarValor(String valorParametro) {
        StringBuilder valorFiltrado = new StringBuilder();

        for (int i = 0; i < valorParametro.length(); i++) {
            char caractere = valorParametro.charAt(i);

            valorFiltrado.append(caractere);

            if (i < valorParametro.length() - 1) {
                valorFiltrado.append(", ");
            }
        }

        return valorFiltrado.toString();
    }
}
