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
public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {//chamado sempre que o evento ocorrer
//nesse metodo que o ambiente da susrpresa é preparado 
        System.out.print("Apagar As Luzes...");
        System.out.print("Fazer Silêncio...");
        System.out.print("Surpresa!!!");
    }

}
