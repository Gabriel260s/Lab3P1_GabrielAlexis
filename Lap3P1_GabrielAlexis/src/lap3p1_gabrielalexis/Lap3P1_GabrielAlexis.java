package lap3p1_gabrielalexis;

import java.util.Scanner;

public class Lap3P1_GabrielAlexis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc = 1;

        while (opc >= 1 && opc <= 4) {
            System.out.println("1. Sucesion");
            System.out.println("2. Pokemon");
            System.out.println("3. Forma");
            System.out.println("4. Salir");
            System.out.println("Elige una opción:");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la inicial: ");
                    int inicial = input.nextInt();
                    System.out.println("Ingrese la diferencia: ");
                    int dif = input.nextInt();
                    System.out.println("Ingrese la cantidad: ");
                    int cant = input.nextInt();
                    for (int i = 1; i <= cant; i++) {
                        if (i == cant) {
                            System.out.println(inicial);
                        } else {
                            System.out.print(inicial + ",");
                        }
                        dif += 1;
                        inicial += dif - 1;
                    }

                    System.out.println("¿Qué número desea ver más adelante en la sucesión?");
                    int pos = input.nextInt();

                    for (int i = cant + 1; i <= pos; i++) {
                        inicial += dif;
                    }

                    System.out.println("El numero es de: "+inicial);
                    
                    break;

                case 2:
                    System.out.println("Ingrese qué modo de pelea desea:");
                    System.out.println("1. Hasta la muerte.");
                    System.out.println("2. Por rondas");
                    int opc2 = input.nextInt();
                    System.out.println("Estadísticas de los pokemones");
                    System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15");
                    System.out.println("Gyarados Vida: 300 Ataque:80 Defensa:10");
                    System.out.println("Giratina Vida: 300 Ataque:70 Defensa: 25");
                    System.out.println("Dragonite Vida:250 Ataque:75 Defensa: 20");
                    System.out.println("");
                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1. Sylveon vs Dragonite");
                    System.out.println("2. Gyarados vs Giratina");
                    System.out.println("3. Dragonite vs Giratina");
                    System.out.println("4. Giratina vs Sylveon");
                    System.out.println("");
                    System.out.println("Elige una: ");
                    int pelea = input.nextInt();
                    int vida1, vida2, limite, controndas = 1;
                    double ataque1, ataque2, defensa1, defensa2, dano1, dano2;
                    boolean xRonda = false;

                    switch (opc2) {
                        case 1:
                            xRonda = false;
                            break;
                        case 2:
                            xRonda = true;
                            break;
                    }

                    switch (pelea) {
                        case 1:
                            if (xRonda == false) {
                                limite = 9999;
                            } else {
                                limite = 10;
                            }
                            vida1 = 280;
                            vida2 = 250;
                            ataque1 = 80;
                            ataque2 = 75;
                            defensa1 = 0.15;
                            defensa2 = 0.20;

                            for (int i = 1; i <= limite && vida1 > 0 && vida2 > 0; i++) {
                                System.out.println("----------------- Ronda " + controndas + " -----------------");
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado.");
                                System.out.println("Pokemon 2 ha atacado");
                                dano1 = ataque1 * defensa2;
                                dano2 = ataque2 * defensa1;
                                vida1 = (int) (vida1 - dano2);
                                vida2 = (int) (vida2 - dano1);
                                if (vida1 < 0) {
                                    vida1 = 0;
                                } else if (vida2 < 0) {
                                    vida2 = 0;
                                }
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                controndas++;
                            }
                            System.out.println("");
                            if (vida1 < vida2) {
                                System.out.println("El ganador es el pokemon 2.");
                            } else if (vida1 > vida2) {
                                System.out.println("El ganador es el pokemon 1.");
                            } else {
                                System.out.println("¡Es un empate!");
                            }
                            System.out.println("------- Fin de la batalla -------");
                            break;

                        case 2:
                            if (xRonda == false) {
                                limite = 9999;
                            } else {
                                limite = 10;
                            }
                            vida1 = 300;
                            vida2 = 300;
                            ataque1 = 50;
                            ataque2 = 70;
                            defensa1 = 0.10;
                            defensa2 = 0.25;

                            for (int i = 1; i <= limite && vida1 > 0 && vida2 > 0; i++) {
                                System.out.println("----------------- Ronda " + controndas + " -----------------");
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado.");
                                System.out.println("Pokemon 2 ha atacado");
                                dano1 = ataque1 * defensa2;
                                dano2 = ataque2 * defensa1;
                                vida1 = (int) (vida1 - dano2);
                                vida2 = (int) (vida2 - dano1);
                                if (vida1 < 0) {
                                    vida1 = 0;
                                } else if (vida2 < 0) {
                                    vida2 = 0;
                                }
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                controndas++;
                            }
                            System.out.println("");
                            if (vida1 < vida2) {
                                System.out.println("El ganador es el pokemon 2.");
                            } else if (vida1 > vida2) {
                                System.out.println("El ganador es el pokemon 1.");
                            } else {
                                System.out.println("¡Es un empate!");
                            }
                            System.out.println("------- Fin de la batalla -------");
                            break;

                        case 3:
                            if (xRonda == false) {
                                limite = 9999;
                            } else {
                                limite = 10;
                            }
                            vida1 = 250;
                            vida2 = 300;
                            ataque1 = 75;
                            ataque2 = 70;
                            defensa1 = 0.20;
                            defensa2 = 0.25;

                            for (int i = 1; i <= limite && vida1 > 0 && vida2 > 0; i++) {
                                System.out.println("----------------- Ronda " + controndas + " -----------------");
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado.");
                                System.out.println("Pokemon 2 ha atacado");
                                dano1 = ataque1 * defensa2;
                                dano2 = ataque2 * defensa1;
                                vida1 = (int) (vida1 - dano2);
                                vida2 = (int) (vida2 - dano1);
                                if (vida1 < 0) {
                                    vida1 = 0;
                                } else if (vida2 < 0) {
                                    vida2 = 0;
                                }
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                controndas++;
                            }
                            System.out.println("");
                            if (vida1 < vida2) {
                                System.out.println("El ganador es el pokemon 2.");
                            } else if (vida1 > vida2) {
                                System.out.println("El ganador es el pokemon 1.");
                            } else {
                                System.out.println("¡Es un empate!");
                            }
                            System.out.println("------- Fin de la batalla -------");
                            break;

                        case 4:
                            if (xRonda == false) {
                                limite = 9999;
                            } else {
                                limite = 10;
                            }
                            vida1 = 300;
                            vida2 = 280;
                            ataque1 = 70;
                            ataque2 = 80;
                            defensa1 = 0.25;
                            defensa2 = 0.15;

                            for (int i = 1; i <= limite && vida1 > 0 && vida2 > 0; i++) {
                                System.out.println("----------------- Ronda " + controndas + " -----------------");
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado.");
                                System.out.println("Pokemon 2 ha atacado");
                                dano1 = ataque1 * defensa2;
                                dano2 = ataque2 * defensa1;
                                vida1 = (int) (vida1 - dano2);
                                vida2 = (int) (vida2 - dano1);
                                if (vida1 < 0) {
                                    vida1 = 0;
                                } else if (vida2 < 0) {
                                    vida2 = 0;
                                }
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida2);
                                controndas++;
                            }
                            System.out.println("");
                            if (vida1 < vida2) {
                                System.out.println("El ganador es el pokemon 2.");
                            } else if (vida1 > vida2) {
                                System.out.println("El ganador es el pokemon 1.");
                            } else {
                                System.out.println("¡Es un empate!");
                            }
                            System.out.println("------- Fin de la batalla -------");
                            break;

                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese un número impar mayor a 7 para la forma:");
                    int num3 = input.nextInt();
                    if (num3 % 2 != 0 && num3 > 7) {
                        for (int i = 1; i <= num3; i++) {
                            for (int j = 1; j <= num3; j++) {
                                if (i == 1 || i == num3 || j == 1 || j == num3) {
                                    System.out.print(" * ");
                                } else if (j == num3 / 2 + 1) {
                                    System.out.print(" | ");
                                } else if (i == j || i + j == num3 + 1) {
                                    System.out.print(" > ");
                                } else if (i == j) {
                                    System.out.print(" > ");
                                } else {
                                    System.out.print("   ");
                                }
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Nmero no válido. Debe ser impar y mayor a 7.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println("1. Sucesion");
            System.out.println("2. Pokemon");
            System.out.println("3. Forma");
            System.out.println("4. Salir");
            System.out.println("Elige una opción:");
            opc = input.nextInt();
        }
    }
}
