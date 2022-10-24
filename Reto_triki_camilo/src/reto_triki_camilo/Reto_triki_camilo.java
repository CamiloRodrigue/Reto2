package reto_triki_camilo;

import java.util.Scanner;

public class Reto_triki_camilo {

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);

        System.out.println("Ingrese el nombre Player One");
        String playerOne = capture.nextLine();
        playerOne = Red_color + playerOne + Black_color;

        System.out.println("Ingrese el nombre Player Two");
        String playerTwo = capture.nextLine();
        playerTwo = Blue_color + playerTwo + Black_color;

        String SymbolP1 = String.valueOf(SelectSymbol(playerOne));
        String SymbolP2 = String.valueOf(SelectSymbol(playerTwo));

        SymbolP1 = Red_color + SymbolP1 + Black_color;
        SymbolP2 = Blue_color + SymbolP2 + Black_color;

        System.out.println("");
        System.out.println("la seleccion del Player One es " + SymbolP1);
        System.out.println("");
        System.out.println("la seleccion del Player Two es " + SymbolP2);
        System.out.println("");

        System.out.println("******* TABLERO DE JUEGO *******");
        System.out.println("");
        System.out.println("");
        System.out.println("        1  |  2   |  3          ");
        System.out.println("     __________________         ");
        System.out.println("        4  |  5   |  6          ");
        System.out.println("     __________________         ");
        System.out.println("        7  |  8   |  9          ");
        System.out.println("");

        String[] triki = {"", "", "", "", "", "", "", "", ""};

        System.out.println("Posiciones disponibles");
        String disponible = "";
        String ocupado = "";

        for (int i = 1; i <= 9; i++) {

            if (triki[i - 1] == "") {
                disponible = disponible + (i) + " ";
            } else {
                ocupado = ocupado + (i) + " ";
            }
            //System.out.println(i+"  "+triki[i-1]);
        }

        System.out.println("los disponibles son " + disponible);

        boolean juego = true;
        int turno = 1;
        int seleccion = 0;
        
        int ganadasJ1=0;
        int ganadasJ2=0;
        int empate=0;
        boolean jugarDeNuevo=true;
        
        while(jugarDeNuevo==true){
            
        while (juego == true) {
            seleccion = Integer.parseInt(capture.nextLine());
            switch (seleccion) {
                case 1: {
                    if (triki[0] == "" && turno == 1) {
                        triki[0] = SymbolP1;
                        turno = 2;
                    } else if (triki[0] == "" && turno == 2) {
                        triki[0] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 2: {
                    if (triki[1] == "" && turno == 1) {
                        triki[1] = SymbolP1;
                        turno = 2;
                    } else if (triki[1] == "" && turno == 2) {
                        triki[1] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }
                case 3: {
                    if (triki[2] == "" && turno == 1) {
                        triki[2] = SymbolP1;
                        turno = 2;
                    } else if (triki[2] == "" && turno == 2) {
                        triki[2] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }
                case 4: {
                    if (triki[3] == "" && turno == 1) {
                        triki[3] = SymbolP1;
                        turno = 2;
                    } else if (triki[3] == "" && turno == 2) {
                        triki[3] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 5: {
                    if (triki[4] == "" && turno == 1) {
                        triki[4] = SymbolP1;
                        turno = 2;
                    } else if (triki[4] == "" && turno == 2) {
                        triki[4] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 6: {
                    if (triki[5] == "" && turno == 1) {
                        triki[5] = SymbolP1;
                        turno = 2;
                    } else if (triki[5] == "" && turno == 2) {
                        triki[5] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 7: {
                    if (triki[6] == "" && turno == 1) {
                        triki[6] = SymbolP1;
                        turno = 2;
                    } else if (triki[6] == "" && turno == 2) {
                        triki[6] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 8: {
                    if (triki[7] == "" && turno == 1) {
                        triki[7] = SymbolP1;
                        turno = 2;
                    } else if (triki[7] == "" && turno == 2) {
                        triki[7] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }

                case 9: {
                    if (triki[8] == "" && turno == 1) {
                        triki[8] = SymbolP1;
                        turno = 2;
                    } else if (triki[8] == "" && turno == 2) {
                        triki[8] = SymbolP2;
                        turno = 1;
                    } else {
                        System.out.println("esta ocupado no se puede llenar");
                    }
                    break;
                }
                
            }
            System.out.println("el turno actual es del jugador " + turno);
            
        System.out.println("        "+triki[0]+" | "+triki[1]+"  |  "+triki[2]+"");
        System.out.println("     ________________        ");
        System.out.println("        "+triki[3]+" | "+triki[4]+"  |  "+triki[5]+"");
        System.out.println("     ________________       ");
        System.out.println("        "+triki[6]+" | "+triki[7]+"  |  "+triki[8]+"");
        
            if (triki[0] != "" && triki[1] != "" && triki[2] != "" && triki[3] != "" && triki[4] != "" && triki[5] != "" && triki[6] != "" && triki[7] != "" && triki[8] != "" ) {
                System.out.println("EMPATE");
                empate +=1;
                break;
            }

            if(triki[0]==triki[1] && triki[1]==triki[2] && triki[0]!="" && triki[1]!="" && triki[2]!="" ){  //0,1,2
               if(triki[0]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[3]==triki[4] && triki[4]==triki[5]&& triki[3]!="" && triki[4]!="" && triki[5]!=""){ //3,4,5
                if(triki[3]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[6]==triki[7] && triki[7]==triki[8]&& triki[6]!="" && triki[7]!="" && triki[8]!=""){ //6,7,8
                if(triki[6]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[0]==triki[3] && triki[3]==triki[6]&& triki[0]!="" && triki[3]!="" && triki[6]!=""){ //0,3,6
                if(triki[0]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[1]==triki[4] && triki[4]==triki[7]&& triki[1]!="" && triki[4]!="" && triki[7]!=""){ //1,4,7
                if(triki[1]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[2]==triki[5] && triki[5]==triki[8]&& triki[2]!="" && triki[5]!="" && triki[8]!=""){ //2,5,8
                if(triki[2]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[0]==triki[4] && triki[4]==triki[8]&& triki[0]!="" && triki[4]!="" && triki[8]!=""){ //0,4,8
                if(triki[0]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else if(triki[6]==triki[4] && triki[4]==triki[2]&& triki[6]!="" && triki[4]!="" && triki[2]!=""){ //6,4,2
                if(triki[6]==SymbolP1){
                   System.out.println("!!! El ganador es el jugador 1 "+playerOne);
                   juego = false;
                   ganadasJ1+=1;
               }else{
                   System.out.println("!!! El ganador es el jugador 2 "+playerTwo);
                   juego = false;
                   ganadasJ2+=1;
               }
            }else{
                
            }
        }
        
            System.out.println("quiere jugar ingrese 1 para jugar de nuevo y otro numero para terminar");
            int captura = Integer.parseInt(capture.nextLine());
            if(captura==1){
                jugarDeNuevo=true;
                for (int i = 0; i <=8; i++) {
                    triki[i]="";
                    juego=true;
                    
                }
                System.out.println("Jugamos de nuevo ingrese una posicion numero del 1 al 9");
                System.out.println("inicia jugador"+turno);
            }else{
                jugarDeNuevo=false;
            }
            
        }
        System.out.println("!!resultado final!!");
        System.out.println("jugadas ganadas jugador "+playerOne+"  "+ganadasJ1);
        System.out.println("jugadas ganadas jugador "+playerTwo+"  "+ganadasJ2);
        System.out.println("jugadas empatadas "+empate);
    }


    

    //asignar colores
    public static final String Red_color = "\u001B[31m";
    public static final String Blue_color = "\u001B[34m";
    public static final String Black_color = "\u001B[30m";

    // seleccionar el simbolo del jugador
    public static char SelectSymbol(String player) {

        Scanner capture = new Scanner(System.in);

        System.out.println("Ingresar el numero de el simbolo quiere para el player " + player);
        System.out.println("1 = ☺");
        System.out.println("2 = ☻");
        System.out.println("3 = ♥");
        System.out.println("4 = ♠");
        System.out.println("5 = ♀");
        System.out.println("6 = ♂");

        int seleccion = Integer.parseInt(capture.nextLine());
        char resultSelection = '0';

        switch (seleccion) {
            case 1: {
                resultSelection = '☺';
                break;
            }
            case 2: {
                resultSelection = '☻';
                break;
            }
            case 3: {
                resultSelection = '♥';
                break;
            }
            case 4: {
                resultSelection = '♠';
                break;
            }
            case 5: {
                resultSelection = '♀';
                break;
            }
            case 6: {
                resultSelection = '♂';
                break;
            }
            default:
                resultSelection = 'X';

        }
        return resultSelection;
    }

}
