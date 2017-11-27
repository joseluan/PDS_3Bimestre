/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/*Para importar a classe mensagem*/
import utils.Mensagem;

/**Classe para objetos do tipo Carro,
 * onde conter� valores e m�todos para o mesmo.
 * @author Luan Newton Lucas Wesley
 */
public class Carro {
    String marca;
    int ano;
    int potencia;
    String modelo;
    int valor;
    
    /**
     * M�todo para retoro do inteiro gerado pela divis�o da pot�ncia pelo valor.
     * @return int - valor da pot�ncia
     */
    public int valorPotencia(){
        return potencia/valor;
    }
    
    /**
     * M�todo que configura qual ser� a impress�o na mensagem de marca e modelo.
     */
    protected void mensagemMM(){
       Mensagem.mostrar(" A marca do carro � "+marca+" e o modelo � "+modelo);
    }
    
    /**
     / M�todo para retorno do calculo Secreto obtido pela divis�o do ano pelo
     * valorpotencia
     * @return int - calculo secreto
     */
    private int calculoSecreto(){
        return ano/valorPotencia();
    }

    /**
     / M�todo para retorno da marca
     * @return String - marca
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * M�todo para retorno do ano
     * @return int - ano
     */
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /**
     * M�todo para retorno do potencia
     * @return int - potencia
     */
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    /**
     * M�todo para retorno do modelo
     * @return String - modelo
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * M�todo para retorno do valor do carro
     * @return int - valor
     */
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}