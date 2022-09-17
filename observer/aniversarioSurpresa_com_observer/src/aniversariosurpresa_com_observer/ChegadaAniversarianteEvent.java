/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversariosurpresa_com_observer;

import java.util.Date;

/**
 *
 * @author Root
 */
public class ChegadaAniversarianteEvent {

    private final Date horaDaChegada;

    public ChegadaAniversarianteEvent(Date horaDaChegada) {
        super();
        this.horaDaChegada = horaDaChegada;

    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }

}
