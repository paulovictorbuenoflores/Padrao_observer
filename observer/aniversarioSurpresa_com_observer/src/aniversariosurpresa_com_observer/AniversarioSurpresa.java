/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversariosurpresa_com_observer;

/**
 *
 * @author Root
 */
//resposavel por execultaerr nosso exemplo
public class AniversarioSurpresa {
    
   public static void main(String [] args){
    Namorada namorada =new Namorada();
    Porteiro porteiro = new Porteiro();
   porteiro.addChegadaAniversarianteObserver(namorada);//adiciona a namorada na lista de observers
   
   porteiro.start();//passa a monitorar os eventos
   }
   
}
