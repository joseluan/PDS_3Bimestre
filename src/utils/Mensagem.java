/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**Classe para objetos do tipo Mensagem, onde ser�o contidos, valores e m�todos para o mesmo.
*
* @author Luan Newton Lucas Wesley
*/
public class Mensagem {
	/** M�todo para para impressao de textos
     * @param  texto String - mostrar textos
     *  */
    public static void mostrar(String texto){
        System.out.println("*** "+texto+" ***");
    }
    /** M�todo para para impressao de textos Obscuros
     * @param  texto String - mostrar textos Obscuros
      */
    protected static void mostrarObscuro(String texto){
        System.out.println("--- "+texto+" ---");
    }
    
    /** M�todo para para impressao de textos Dark
     * @param  texto String - mostrar textos Dark
       */
    private static void mostrarDark(String texto){
        System.out.println("¨¨¨¨ "+texto+" ¨¨¨¨");
    }
}
