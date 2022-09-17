/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversariosurpresa_com_observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Root
 */
//representa o subject, quem percebe o namorado chegar e avisa para namorada, notifica todos os interessados no evento
public class Porteiro extends Thread {
    //lista dos interessados no evento, no nosso caso é so a namorada que é o observer
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    //metodo para registrar o observador
    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer){
    this.observers.add(observer);
    }
    @Override
    public void run() {
        //sempre que clicar na tecla 1 o evento ocorreu, 1 representa o namorado chegando
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int valor = scanner.nextInt();
            if (valor == 1) {
                //instanciar um novo evento
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                //notificar os interessados no evento que ele chegou/ocorreu
                for(ChegadaAniversarianteObserver observer: this.observers){
                    observer.chegou(event);
                }
            }else{System.out.print("Alarme false");}
        }
    }
}
