package com.company;

import java.util.Arrays;
import java.lang.Object;
import java.util.Scanner;

public class Main {

    private static final String GREETING_MESSAGE =
            "Program Person - wersja konsolowa\n" +
                    "Autor: spawacz sam\n" +
                    "Data:  2137 r.\n";

    private static final String MENU =
            "    M E N U   G Ł Ó W N E  \n" +
                    "1 - Stworz nowe auto \n" +
                    "2 - Dodaj auto   \n" +
                    "3 -    \n" +
                    "4 -    \n" +
                    "5 -    \n" +
                    "0 - Zakończ program   \n";


    private static final KonsolaObsluga UI = new KonsolaObsluga();

    public static void main(String[] args) {
        Main application = new Main();
        application.runMainLoop();
    }

    private Auto currentAuto = null;

    public void runMainLoop() {
        UI.printMessage(GREETING_MESSAGE);

        while (true) {
            UI.clearConsole();
            showCurrentAuto();

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 1: //tworzenie nowego auta
                        currentAuto = noweAuto();
                        break;
                    case 2:
                        break;
                    case 0: //zakonczenie programu
                        UI.printInfoMessage("\nProgram zakończył działanie!");
                        System.exit(0);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

        void showCurrentAuto(){
        showAuto(currentAuto);
        }

        static void showAuto(Auto auto){
            StringBuilder sb = new StringBuilder();

            if (auto != null) {
                sb.append("Aktualne auto: \n")
                        .append("             Marka: ").append(auto.getMarka()).append("\n")
                        .append("             Model: ").append(auto.getModel()).append("\n")
                        .append("Pojemnosc silnika.: ").append(auto.getPojemnosc_silnika()).append("\n")
                        .append("  Kraj pochodzenia: ").append(auto.getKraj()).append("\n");
            } else
                sb.append( "Brak danych auta\n" );
            UI.printMessage( sb.toString() );
        }

        static Auto noweAuto () {

       // String marka,model;
       // Double pojemnosc_silnika;
        //KrajPochodzenia kraj;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj marke: ");
        String marka=scanner.nextLine();
        System.out.print("Podaj model: ");
        String model=scanner.nextLine();
        System.out.print("Podaj pojemność(l) :");
        Double pojemnosc_silnika=scanner.nextDouble();
        System.out.print("Podaj kraj: ");
        KrajPochodzenia kraj= KrajPochodzenia.valueOf(scanner.next());

        Auto auto = new Auto(marka,model);
        auto.setPojemnosc_silnika(pojemnosc_silnika);
        auto.setKraj(kraj);

        /* String marka = UI.enterString("Podaj marke: ");
            String model = UI.enterString("Podaj model :");
            String pojemnosc_silnika = UI.enterString("Podaj pokemność(l) :");
            String kraj = UI.enterString("Podaj kraj pochodzenia :");

            Auto auto;
            try {
                auto = new Auto((String) marka,(String) model);
                auto.setPojemnosc_silnika(pojemnosc_silnika);
                auto.setKraj(kraj);
            } catch (AutoException e) {
                UI.printErrorMessage(e.getMessage());
                return null;
            }*/
            return auto;
        }


}
