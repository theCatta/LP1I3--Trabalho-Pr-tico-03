/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class TP03 {
    static int home(Hora h){
    Scanner scan = new Scanner(System.in);
    System.out.println("--------------------------------------------");
    System.out.println("                 Resultados                 ");
    System.out.println("Hora Formato 24h: " + h.getHora1());
    System.out.println("Hora Formato 12h (AM/PM): " + h.getHora2());
    System.out.println("Hora Formato Segundos: " + h.getSegundos());
    System.out.println("--------------------------------------------");
    System.out.println("                 Alterar Hora               ");
    System.out.println("Alterar hora completa                    - 1");
    System.out.println("Alterar apenas a hora                    - 2");
    System.out.println("Alterar apenas o minuto                  - 3");
    System.out.println("Alterar apenas o segundo                 - 4");
    System.out.println("Zerar relógio                            - 5");
    System.out.println("--------------------------------------------");
    System.out.println("                 Ver Detalhes               ");
    System.out.println("Ver apenas Horas                         - 6");
    System.out.println("Ver apenas minutos                       - 7");
    System.out.println("Ver apenas segudos                       - 8");
    System.out.println("--------------------------------------------");
    System.out.println("Sair                                     - 0");
    System.out.println("--------------------------------------------");

    System.out.print("\nEscolha uma opção: ");
    int key = scan.nextInt();
    System.out.println("\n");
    
    return key;    
  }
    
    public static void main(String[] args) {
        Hora h = new Hora();
    int key = home(h);

    while(key != 0){
      switch(key){
        case 1:
          h.finaliza();
          h = new Hora();
          key = home(h);
          break;
        case 2:
          h.setHor();
          key = home(h);
          break;
        case 3:
          h.setMin();
          key = home(h);
          break;
        case 4:
          h.setSeg();
          key = home(h);
          break;
        case 5:
          h.finaliza();
          h = new Hora(0,0,0);
          key = home(h);
          break; 
        case 6:
          System.out.println("A Hora atual é:" + h.getHor());
          key = home(h);
          break;
        case 7:
          System.out.println("O Minuto atual é:" + h.getMin());
          key = home(h);
          break;
        case 8:
          System.out.println("O Segundo atual é:" + h.getSeg());
          key = home(h);
          break; 
        
      }
    }

  }
    
}
