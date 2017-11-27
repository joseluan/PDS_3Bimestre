/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**Classe para objetos do tipo Cliente, onde serão contidos, valores e métodos para o mesmo.
*
* @author Luan Newton Lucas Wesley
*/
public class Gerente {
    private String nome;
    private long cpf;
    private Double saldo;

    /** Método para inserir ao saldo
     * @param  money double - insere valor ao saldo
      */
    public void deposita(Double money){
        saldo += money;
    }
    
    /** Método para para verificação do emprestimo de money
     * valor do emprestimo tem que ser < 60% do valor que o cliente tem em conta
     * @param  money double - dinheiro do emprestimo
     * @return true 
     * @return false
      */
    protected boolean emprestar(Double money){
        if ((saldo*0.6) <= money) {
            saldo += money;
            return true;
        }else{
            return false;
        }
    }
    
    /** Método para para verificação do emprestimo de money
     * valor do saque tem que ser < do que o valor que o cliente tem em conta
     * @param  saque double - dinheiro do saque
     * @return true 
     * @return false
      */
    private boolean sacar(Double saque){
        if (saque <= saldo){
            saldo -= saque;
            return true;
        }else{
            return false;
        }
    }
    
    
    /** Método para retorno do Nome do cliente
     *   @return String  - Nome */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /** Método para retorno do cpf do cliente
     *   @return long  - cpf */
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    
    /** Método para retorno do saldo do cliente
     *   @return duble  - saldo */
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
