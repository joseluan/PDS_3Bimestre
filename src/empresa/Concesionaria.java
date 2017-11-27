/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.List;
import veiculos.Carro;
import conta.Cliente;

/**Classe para objetos do tipo Concesionaria, onde serão contidos, valores e métodos para o mesmo.
 *
 * @author Luan Newton Lucas Wesley
 */
public class Concesionaria {
    String nome;
    int anoFundacao;
    
    private List<Cliente> meusClientes = new  ArrayList<>();
    private List<Carro> meusCarros = new ArrayList<>();
    
    /** Método para para impressao da marca, modelo, potencia do carros
     *  */
    public void mostrarCarros(){
        for(Carro c : meusCarros){
            System.out.println("-----------------------------------------");
            System.out.println("Marca : "+c.getMarca());
            System.out.println("Modelo : "+c.getModelo());
            System.out.println("PotÃªncia : "+c.getPotencia());
            System.out.println("------------------------------------------");
        }
    }
    
    /** Método para para impressao da Nome, Saldo do clientes
     *  */
    
    protected void mostrarClientes(){
        for(Cliente c : meusClientes){
            System.out.println("******************************************");
            System.out.println("Nome : "+c.getNome());
            System.out.println("Saldo : "+c.getSaldo());
            System.out.println("******************************************");
        }
    }
    
    
    /** Método para retorno do valor do total de carros
     * @param  valor int - Valor total dos carros
     *   @return int - valor*/
    private int valorTotalCarros(){
        int valor = 0;
        for(Carro c : meusCarros){
            valor += c.getValor();
        }
        return valor;
    }
    /** Método para retorno do Nome do cliente
     *   @return String  - Nome */
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    /** Método para retorno do Ano da fundacao
     *   @return String  - ano da fundacao */
    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    /** Método para retorno dos meus clientes
     *   @return List  - Meus clientes */
    public List<Cliente> getMeusClientes() {
        return meusClientes;
    }

    public void setMeusClientes(List<Cliente> meusClientes) {
        this.meusClientes = meusClientes;
    }
    /** Método para retorno dos meus carros
     *   @return List  - meus carros */
    public List<Carro> getMeusCarros() {
        return meusCarros;
    }

    public void setMeusCarros(List<Carro> meusCarros) {
        this.meusCarros = meusCarros;
    }
    
}
