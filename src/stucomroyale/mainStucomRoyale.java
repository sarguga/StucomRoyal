/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stucomroyale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Sara
 */
public class mainStucomRoyale implements Cloneable{

    private static List <Jugador> listplayers = new ArrayList<>();
    private static List <Carta> mazocartas = new ArrayList<>();
    
    private static List <Carta>battle1 = new ArrayList<>();
    private static List <Carta>battle2 = new ArrayList<>();
    
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
       
        //Tipo estructura 
        TipoEstructura e1 = new TipoEstructura("Ballesta", 3, 850, 6);
        TipoEstructura e2 = new TipoEstructura("Torre Bombardera", 4, 900, 5);
        TipoEstructura e3 = new TipoEstructura("Choza de Barbaros", 3, 1100, 3);
        
        mazocartas.add(e1);
        mazocartas.add(e2);
        mazocartas.add(e3);
        
        //Tipo hechizo
        TipoHechizo h1 = new TipoHechizo("Barril de duendes", 3, 50, 10, "defensa");
        TipoHechizo h2 = new TipoHechizo("Cohete", 3, 700, 20, "ataque");
        TipoHechizo h3 = new TipoHechizo("Bola de Fuego", 4, 325, 325, "ataque");
        
        mazocartas.add(h1);
        mazocartas.add(h2);
        mazocartas.add(h3);
        //Tipo tropa
        TipoTropa t1 = new TipoTropa("Mago de hielo", 3, 700, 63);
        TipoTropa t2 = new TipoTropa("P.E.K.K.A.", 4, 2610, 450);
        TipoTropa t3 = new TipoTropa("Bruja", 3, 500, 38);
        
        mazocartas.add(t1);
        mazocartas.add(t2);
        mazocartas.add(t3);
        
        //Jugadores
        Jugador j1 = new Jugador("user1","123",0);
        Jugador j2 = new Jugador("user2","123",0);
        Jugador j3 = new Jugador("user3","123",0);
        Jugador j4 = new Jugador("user4","123",0);
        
        listplayers.add(j1);
        listplayers.add(j2);
        listplayers.add(j3);
        listplayers.add(j4);
        
        try {
            int op;
            
            do{
                mostrarmenu();
                op = Integer.parseInt(in.readLine());
                
                switch (op){
                    case 1:
                        conseguircartas();
                        break;
                    case 2:
                        battle();
                        break;
                    case 3:
                        ranking();
                        break;
                    case 4:
                        System.out.println("El juego se ha cerrado.");
                        System.exit(0);
                        break;
                    
                }
            }while(op != 4);     
        }catch(IOException | NumberFormatException e){
            System.out.println("Error"+e); 
        }
        
    }
    
    private static void conseguircartas(){
        try{
            String user;
            String pass;
            System.out.println("Introduzca un usuario: ");
            user = in.readLine();
            System.out.println("Introduzca una contraseña: ");
            pass = in.readLine();
            
            for (Jugador j : listplayers){
                if(j.getUser().equals(user)&&j.getPass().equals(pass)){
                 int op2 = 5;
                 while (op2 !=2){
                     System.out.println("1. Añadir Cartas");
                     System.out.println("2. Salir");
                     System.out.println("");
                     System.out.println("Introduce una opción:");
                     op2 = Integer.parseInt(in.readLine());
                     switch(op2){
                         case 1:
                             int i =0;
                             if(j.getMazocartas().size()<6){
                                 for(Carta c: mazocartas){
                                     System.out.println(i++ +". "+ c.toString());
                                 }
                                 System.out.println("Seleccione un núm de la carta [Máx de cartas 6]: ");
                                 int opcarta;
                                 opcarta = Integer.parseInt(in.readLine());
                                 j.getMazocartas().add(mazocartas.get(opcarta));
                                 System.out.println(j.getMazocartas());
                                 break;
                             }else{
                                 System.out.println("No está permitido obtener más de 6 cartas.");
                             }
                         case 2:
                             break;
                     }     
                 }
                }else{
                    
                }
            }      
         }catch (IOException e) {
            System.out.println("Error" + e);
        }
    }
    
    private static void battle(){
        try{
            System.out.println("user1");
            String user;
            String pass;
            int i=0;
            System.out.println("Introduzca un user: ");
            user=in.readLine();
            System.out.println("Introduzca una Contraseña: ");
            pass=in.readLine();
            for (Jugador j : listplayers)
                if (j.getUser().equals(user) && j.getPass().equals(pass)) {
                    System.out.print(i++);
                    System.out.println(j.getMazocartas());
                    System.out.println("1.Seleccione 3 cartas de la lista: ");
                    int opc1;
                    int opc2;
                    int opc3;
                    int elixir = 0;
                    System.out.println("Opción1");
                    opc1 = Integer.parseInt(in.readLine());
                    System.out.println("Opción2");
                    opc2 = Integer.parseInt(in.readLine());
                    System.out.println("Opción3");
                    opc3 = Integer.parseInt(in.readLine());
                    elixir = j.getMazocartas().get(opc1).getCostelixir() + j.getMazocartas().get(opc2).getCostelixir() + j.getMazocartas().get(opc3).getCostelixir();
                    while (elixir > 10) {
                        System.out.println("El Coste de elixir de todas no puede ser superior a 10.");
                        System.out.println(j.getMazocartas());
                        System.out.println("Opción1");
                        opc1 = Integer.parseInt(in.readLine());
                        System.out.println("Opción2");
                        opc2 = Integer.parseInt(in.readLine());
                        System.out.println("Opción3");
                        opc3 = Integer.parseInt(in.readLine());
                        elixir = j.getMazocartas().get(opc1).getCostelixir() + j.getMazocartas().get(opc2).getCostelixir() + j.getMazocartas().get(opc3).getCostelixir();

                    }
                    battle1.add(j.getMazocartas().get(opc1));
                    battle1.add(j.getMazocartas().get(opc2));
                    battle1.add(j.getMazocartas().get(opc3));
                    System.out.println(battle1);
                }

            System.out.println("Usuario 2");
            String user2;
            String pass2;
            System.out.println("Introduzca un user: ");
            user2 = in.readLine();
            System.out.println("Introduzca una contraseña: ");
            pass2 = in.readLine();

            for (Jugador j2 : listplayers)
                if (j2.getUser().equals(user2) && j2.getPass().equals(pass2)) {
                    System.out.println(j2.getMazocartas());
                    int opc1;
                    int opc2;
                    int opc3;
                    int elixir = 0;
                    System.out.println("Opción1");
                    opc1 = Integer.parseInt(in.readLine());
                    System.out.println("Opción2");
                    opc2 = Integer.parseInt(in.readLine());
                    System.out.println("Opción3");
                    opc3 = Integer.parseInt(in.readLine());
                    elixir = j2.getMazocartas().get(opc1).getCostelixir() + j2.getMazocartas().get(opc2).getCostelixir() + j2.getMazocartas().get(opc3).getCostelixir();
                    while (elixir > 10) {
                        System.out.println("El Coste de elixir de todas no puede ser superior a 10");
                        System.out.println(j2.getMazocartas());
                        System.out.println("Opción 1");
                        opc1 = Integer.parseInt(in.readLine());
                        System.out.println("Opción 2");
                        opc2 = Integer.parseInt(in.readLine());
                        System.out.println("Opción 3");
                        opc3 = Integer.parseInt(in.readLine());
                        elixir = j2.getMazocartas().get(opc1).getCostelixir() + j2.getMazocartas().get(opc2).getCostelixir() + j2.getMazocartas().get(opc3).getCostelixir();
                    }
                    battle2.add(j2.getMazocartas().get(opc1));
                    battle2.add(j2.getMazocartas().get(opc2));
                    battle2.add(j2.getMazocartas().get(opc3));
                    System.out.println(battle2);
                }


            System.out.println("[** COMBATE **]");

            int randomn = (int) Math.random() * 1;
            if (randomn == 0) {
                ataca(battle1, battle2);
            } else {
                ataca(battle2, battle1);
            }
            int vidaJ1 = 0;
            int vidaJ2 = 0;
            for (int b = 0; b < 3; b++) {
                vidaJ1 += battle1.get(b).getLvlvida();
                vidaJ2 += battle2.get(b).getLvlvida();
            }


            for (Jugador j : listplayers) {
                if (vidaJ1 > vidaJ2) {
                    if (user.equalsIgnoreCase(j.getUser())) {
                        j.setNumtrofeos(j.getNumtrofeos() + 5);
                    }
                } else if (vidaJ2 > vidaJ1) {
                    if (user2.equalsIgnoreCase(j.getUser())) {
                        j.setNumtrofeos(j.getNumtrofeos() + 5);
                    }

                } else {
                    System.out.println(j.getUser() + " has empatado a " + j.getUser() + " con una vida de " + vidaJ1);
                }
                System.out.println("[** BATALLA FINALIZADA **]");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

      public static void ataca(List<Carta> carta1, List<Carta> carta2) {
        int f = 0;

        for (Carta turno1 : carta1) {

            if (turno1 instanceof TipoTropa) {
                carta2.get(f).setLvlvida(((TipoTropa) turno1).getLvlataque() / 2);
            } else if (turno1 instanceof TipoEstructura) {
                for (Carta CartaEstructura : carta1) {
                    CartaEstructura.setLvlvida(CartaEstructura.getLvlvida() + ((TipoEstructura) turno1).getLvldefensa());
                }
            } else if (turno1 instanceof TipoHechizo) {
                if (((TipoHechizo) turno1).getModo().equals("ataque")) {
                    for (Carta TipoHechizoataque : carta2) {
                        TipoHechizoataque.setLvlvida(TipoHechizoataque.getLvlvida() - ((TipoHechizo) turno1).getLvlalcance() * 2 / 3);
                    }
                } else {
                    for (Carta TipoHechizoDefensa : carta1) {
                        TipoHechizoDefensa.setLvlvida(TipoHechizoDefensa.getLvlvida() + ((TipoHechizo) turno1).getLvlalcance() * 2 / 3);
                    }
                }
            }

            f++;
        }
        f = 0;
        for (Carta turno1 : carta2) {
            if (turno1 instanceof TipoTropa) {
                carta1.get(f).setLvlvida(((TipoTropa) turno1).getLvlataque() / 2);
            } else if (turno1 instanceof TipoEstructura) {
                for (Carta CartaEstructura : carta2) {
                    CartaEstructura.setLvlvida(CartaEstructura.getLvlvida() + ((TipoEstructura) turno1).getLvldefensa());
                }
            } else if (turno1 instanceof TipoHechizo) {
                if (((TipoHechizo) turno1).getModo().equals("ataque")) {
                    for (Carta TipoHechizoataque : carta1) {
                        TipoHechizoataque.setLvlvida(TipoHechizoataque.getLvlvida() - ((TipoHechizo) turno1).getLvlalcance() * 2 / 3);
                    }
                } else {
                    for (Carta TipoHechizoDefensa : carta2) {
                        TipoHechizoDefensa.setLvlvida(TipoHechizoDefensa.getLvlvida() + ((TipoHechizo) turno1).getLvlalcance() * 2 / 3);
                    }
                }
            }
            f++;
        }
    }
    
    public static void ranking() {

        int num = 1;
       
        Collections.sort(listplayers);
        System.out.println("[** Ranking **]");
        for (Jugador j : listplayers) {
            System.out.println("");
            System.out.println(num + " | " + j.getUser() + ", trofeos: " + j.getNumtrofeos());
            num++;
        }
    }
    
    private static void mostrarmenu() {
        System.out.println("[*****[ *STUCOM ROYALE* ]******]");
        System.out.println("[*    [1]- Conseguir cartas   *]");
        System.out.println("[*    [2]- Batalla            *]");
        System.out.println("[*    [3]- Ver Ranking        *]");
        System.out.println("[*    [4]- Salir              *]");
        System.out.println("[******************************]");
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

