package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //datos jugador

        String nickname;
        String nicknameBD = "alejis";
        String contrasena;
        String contrasenaBD = "123";
        String juego1 = "free fire";
        String juego2 = "fifa 24";
        String juegoSelecionado;
        Integer nivelVida = 70;
        Integer contadorSkills = 0;
        Integer contadorDisparos = 0;
        Integer precioSkillsVida = 100000;
        Integer danoDisparos = -5;
        boolean estaMuerto = false;

        Scanner lea = new Scanner(System.in);
        System.out.println("********Ingresando********");
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("****Bienvenido****");
        System.out.println("-----------------------------");

        System.out.println("digite nombre de usuario: ");
        nickname = lea.nextLine();

        System.out.println("digite una contraseña: ");
        contrasena = lea.nextLine();

        //rutina
        if (nickname.equals(nicknameBD) && contrasena.equals(contrasenaBD)) {
            System.out.println("bienvenido a psplus" + nickname);

            System.out.println("selecione un juego");
            juegoSelecionado = lea.nextLine();

            if (juegoSelecionado.equals(juego1)) {
                do {


                    Random random = new Random();
                    int disparo = random.nextInt(2);


                    if (disparo == 1) {
                        contadorDisparos = contadorDisparos + 1;
                        nivelVida = nivelVida - 5;
                        System.out.println("te dispararon,y tu vida quedo en : " + nivelVida);

                        if (contadorDisparos == 3) {
                            estaMuerto = true;
                            break;

                            if (nivelVida == 0) {
                                estaMuerto = true;
                                break;
                                {


                                }
                            }

                        } else {
                        }

                        contadorDisparos = 0;

                    }
                    while (estaMuerto == false) ;

                    System.out.println("estas muerto ! ! !");

                } else{
                    System.out.println("usuario no encontrado");
                }

            }
        }

    }


