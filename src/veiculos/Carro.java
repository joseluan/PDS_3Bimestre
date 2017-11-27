/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/*Para importar a classe mensagem*/
import utils.Mensagem;

/**Classe para objetos do tipo Carro,
 * onde conterá valores e métodos para o mesmo.
 * @author Luan Newton Lucas Wesley
 */
public class Carro {
    String marca;
    int ano;
    int potencia;
    String modelo;
    int valor;
    
    /**
     * Método para retoro do inteiro gerado pela divisão da potência pelo valor.
     * @return int - valor da potência
     */
    public int valorPotencia(){
        return potencia/valor;
    }
    
    /**
     * Método que configura qual será a impressão na mensagem de marca e modelo.
     */
    protected void mensagemMM(){
       Mensagem.mostrar(" A marca do carro é "+marca+" e o modelo é "+modelo);
    }
    
    /**
     / Método para retorno do calculo Secreto obtido pela divisão do ano pelo
     * valorpotencia
     * @return int - calculo secreto
     */
    private int calculoSecreto(){
        return ano/valorPotencia();
    }

    /**
     / Método para retorno da marca
     * @return String - marca
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método para retorno do ano
     * @return int - ano
     */
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /**
     * Método para retorno do potencia
     * @return int - potencia
     */
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    /**
     * Método para retorno do modelo
     * @return String - modelo
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Método para retorno do valor do carro
     * @return int - valor
     */
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}