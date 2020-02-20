package klasyanonimowe;

public class Main {
    public static void main(String[] args) {

        //        ZachowaniePoWciśnieciu z = new ZachowaniePoWciśnieciu() {
//            @Override
//            public void akcja() {
//                System.out.println("klasa anonimowa");
//            }
//        };

//    //replaced with lambda expressions:

        ZachowaniePoWcisnieciu z = () -> System.out.println("klasa anonimowa");
        ZachowaniePoWcisnieciu2 z2 = (a, b) -> a + b;

        //z.akcja();
        Przycisk p = new Przycisk();
        p.dodajAkcje(() -> {
            System.out.println("z klasy anonimowej");
        });

        int wynik = p.dodajAkcje2(5, 10, z2);

        System.out.println(wynik);

        System.out.println();
        MakeCoffee m = () -> System.out.println("Hot!");
        m.make();

    }
}

interface ZachowaniePoWcisnieciu {
    void akcja();
}

interface ZachowaniePoWcisnieciu2 {
    int akcja2(int a, int b);
}


class Przycisk {//} implements ZachowaniePoWciśnieciu {

    void dodajAkcje(ZachowaniePoWcisnieciu z) {
        z.akcja();
    }

    int dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z) {
        return z.akcja2(a, b);
    }
}

//    class Przycisk2 implements ZachowaniePoWciśnieciu {
//        @Override
//        public void akcja() {
//            System.out.println("przycisk2");
//        }
//    }

interface MakeCoffee {
    void make();
}

class Coffee {
    void make2Coffees(MakeCoffee m) {
        m.make();
    }
}