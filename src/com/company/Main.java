package com.company;

import java.util.*;
import java.util.Map.Entry;


public class Main {



    private static final String GREETING_MESSAGE =
            "Program Person - wersja konsolowa\n" +
                    "Autor: Piotr Rachwalik\n" +
                    "Data:  26.10.2021r.\n";

    private static final String MENU =
            "    M E N U   G Ł Ó W N E   \n" +
                    "1 - Listy \n" +
                    "2 - Sety   \n" +
                    "3 - Map   \n" +
                    "4 - Metody equals() i hashCode() - słowne wyjaśnienie  \n" +
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

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 1:
                        listy();
                        break;
                    case 2:
                        sety();
                        break;
                    case 3:
                        mapy();
                        break;
                    case 4:
                        metody();
                        break;
                    case 0: //zakończenie programu
                        UI.printInfoMessage("\nProgram zakończył działanie!");
                        System.exit(0);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void listy(){

        String MENU =
                "    M E N U   L I S T  \n" +
                        "1 - Stworz nowe auto \n" +
                        "ArrayList \n" +
                        "2 - Dodaj auto   \n" +
                        "3 - Pokaż wszystkie auta   \n" +
                        "4 - Usuń auto   \n" +
                        "LinkedList \n" +
                        "5 - Dodaj auto   \n" +
                        "6 - Pokaż wszystkie auta   \n" +
                        "7 - Usuń auto   \n" +
                        "0 - Wróć   \n";

        List<Auto> ArrayLista = new ArrayList<Auto>();
        List<Auto> LinkLista = new LinkedList<Auto>();

        boolean n=true;

        while (n) {
            UI.clearConsole();
            showCurrentAuto();

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 1: //tworzenie nowego auta
                        currentAuto = noweAuto();
                        break;
                    case 2: //dodawanie auta do listy (array)
                        ArrayLista.add(currentAuto);
                        break;
                    case 3: //wypisanie listy (array)
                        wypsanieListy(ArrayLista);
                        break;
                    case 4: //usuwanie auta (array)
                        usuwanieListy(ArrayLista);
                        break;
                    case 5: //dodawanie auta do listy (linked)
                        LinkLista.add(currentAuto);
                        break;
                    case 6: //wypisanie listy (linked)
                        wypsanieListy(LinkLista);
                        break;
                    case 7: //usuwanie auta (linked)
                        usuwanieListy(LinkLista);
                        break;
                    case 0: //powrót do menu głównego
                        n=false;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    void sety(){

        String MENU =
                "    M E N U   S E T Ó W  \n" +
                        "1 - Stworz nowe auto \n" +
                        "Hashset \n" +
                        "2 - Dodaj auto   \n" +
                        "3 - Pokaż wszystkie auta   \n" +
                        "4 - Usuń auto   \n" +
                        "Treeset \n" +
                        "5 - Dodaj auto   \n" +
                        "6 - Pokaż wszystkie auta   \n" +
                        "7 - Usuń auto   \n" +
                        "0 - Wróć   \n";

        Set<Auto> hash = new HashSet<Auto>();
        Set<Auto> tree = new TreeSet<Auto>();

        boolean n=true;

        while (n) {
            UI.clearConsole();
            showCurrentAuto();

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 1: //tworzenie nowego auta
                        currentAuto = noweAuto();
                        break;
                    case 2: //dodawanie auta (hashset)
                        hash.add(currentAuto);
                        break;
                    case 3: //wypisanie (hashset)
                        wypisanieSety(hash);
                        break;
                    case 4: //usuwanie (hashset)
                        usuwanieSety(hash);
                        break;
                    case 5: //dodawanie auta (treeset)
                        tree.add(currentAuto);
                        break;
                    case 6: //wypisanie (treeset)
                        wypisanieSety(tree);
                        break;
                    case 7: //usuwanie (treeset)
                        usuwanieSety(tree);
                        break;
                    case 0: //powrót do menu głównego
                        n=false;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    void mapy(){

        String MENU =
                "    M E N U   M A P  \n" +
                        "1 - Stworz nowe auto \n" +
                        "HashMap \n" +
                        "2 - Dodaj auto   \n" +
                        "3 - Pokaż wszystkie auta   \n" +
                        "4 - Usuń auto   \n" +
                        "TreeMap \n" +
                        "5 - Dodaj auto   \n" +
                        "6 - Pokaż wszystkie auta   \n" +
                        "7 - Usuń auto   \n" +
                        "0 - Wróć   \n";

        Map<Integer,Auto> hash = new HashMap<Integer,Auto>();
        Map<Integer,Auto> tree = new TreeMap<Integer,Auto>();

        boolean n=true;

        while (n) {
            UI.clearConsole();
            showCurrentAuto();

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 1: //tworzenie nowego auta
                        currentAuto = noweAuto();
                        break;
                    case 2: //dodawanie auta (hashmap)
                        dodawanieMapy(hash,currentAuto);
                        break;
                    case 3: //wypisanie (hashmap)
                        wypisanieMapy(hash);
                        break;
                    case 4: //usuwanie (hashmap)
                        usuwanieMapy(hash);
                        break;
                    case 5: //dodawanie auta (treemap)
                        dodawanieMapy(tree,currentAuto);
                        break;
                    case 6: //wypisanie (treemap)
                        wypisanieMapy(tree);
                        break;
                    case 7: //usuwanie (treemap)
                        usuwanieMapy(tree);
                        break;
                    case 0: //powrót do menu głównego
                        n=false;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    void metody(){

        String MENU =
                        "Przy niezdefiniowanych equals() oraz hashCode() \n" +
                        "program rozróżnia różne obiekty o identycznych parametrach, \n" +
                        "co nie pozwala na przykład usuwać konkretnych obiektów przez \n" +
                        "podanie jego parametrów tak jak jest w programie w HashSet oraz TreeSet \n" +
                        "po zaimplementowaniu equals() oraz hashCode() program uznaje je za ten sam obiekt. \n\n" +
                        "0 - Wróć   \n";



        boolean n=true;

        while (n) {
            UI.clearConsole();

            try {
                switch (UI.enterInt(MENU + "=>")) {
                    case 0: //powrót do menu głównego
                        n=false;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }





        void showCurrentAuto(){
            System.out.println("Aktualne auto:");
            showAuto(currentAuto);
        }

        static void showAuto(Auto auto){
            StringBuilder sb = new StringBuilder();

            if (auto != null) {
                        sb.append("             Marka: ").append(auto.getMarka()).append("\n")
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
        auto.setMarka(marka);
        auto.setModel(model);
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
            }*////
            return auto;
        }

        static void dodawanieMapy( Map<Integer,Auto> mapa, Auto auto){

            System.out.println("\nPodaj klucz do tego samochodu (liczba dziesiętna): ");
            Scanner scanner=new Scanner(System.in);
            int klucz= scanner.nextInt();
            mapa.put(klucz,auto);
        }

        static void wypsanieListy( List<Auto> lista){

            int i=1;

            for( Auto auto : lista){
                System.out.println(String.format("\n\nAuto nr %d",i));
               showAuto(auto);
               i++;
            }
        }

        static void wypisanieSety( Set<Auto> set){

            for(Auto auto : set){
                showAuto(auto);
            }
        }

        static void wypisanieMapy( Map<Integer,Auto> map){

            Set<Entry<Integer,Auto>> entrySet = map.entrySet();
            for(Entry<Integer, Auto> entry: entrySet) {
                System.out.println(String.format("Klucz: %d",entry.getKey()));
                showAuto(map.get(entry.getKey()));
            }
        }

        static void usuwanieListy(List<Auto> lista){
            System.out.println("\nPodaj numer auta z listy które chcesz usunąć: ");
            Scanner scanner=new Scanner(System.in);
            int nr= scanner.nextInt();
            lista.remove(nr-1);
        }

        static void usuwanieSety(Set<Auto> set){
            System.out.println("\nPodaj auto które chcesz usunąć: ");
           Auto auto1=noweAuto();
           set.remove(auto1);
        }

        static  void usuwanieMapy( Map<Integer,Auto> map){

            System.out.println("\nPodaj klucz auta które chcesz usunąć: ");
            Scanner scanner=new Scanner(System.in);
            int klucz= scanner.nextInt();
            map.remove(klucz);
        }


}
