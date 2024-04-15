package sav;

import sav.Parametros.ExibirParametro;
import sav.Parametros.ValidarParametro;

/**
 * Classe principal que iniciará a execução do programa, recebendo os parâmetros pelo CLI.
 * Permite a entrada do tipo e valor (númerico ou caractere) a ser ordenado.
 *
 * @author Gabriela Diniz Santos
 * @version 1.1
 */
public class SAVExecutor {
    /**
     * Método principal que inica a execução do programa e a entrada de dados pela CLI.
     *
     * @param args argumentos passados pela CLI.
     */
    public static void main(String[] args) {
        ValidarParametro.ParametrosValidados parametrosValidados = ExibirParametro.receberParametro(args);
    }
}