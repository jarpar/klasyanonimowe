package klasyanonimowe;

public class Main {
    public static void main(String[] args) {
        ZachowaniePoWciśnieciu z = new ZachowaniePoWciśnieciu() {
            @Override
            public void akcja() {
                System.out.println("klasa anonimowa");
            }
        };
        z.akcja();

    }

    interface ZachowaniePoWciśnieciu {
        void akcja();
    }

    class Przycisk implements ZachowaniePoWciśnieciu {
        @Override
        public void akcja() {
            System.out.println("przycisk");
        }
    }

    class Przycisk2 implements ZachowaniePoWciśnieciu {
        @Override
        public void akcja() {
            System.out.println("przycisk2");
        }
    }
}