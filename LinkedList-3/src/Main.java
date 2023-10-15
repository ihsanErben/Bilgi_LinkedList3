
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add(1,"cacacaaa");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);

    }

    public static void sehirleri_turla(LinkedList<String> x) {
        ListIterator<String> iterator = x.listIterator();
        Scanner input = new Scanner(System.in);

        if (!iterator.hasNext()) {
            System.out.println("Listede hic sehir bulunmamaktadir.");
        }
        boolean ileri = true;
        boolean cikis = false;

        while (!cikis) {
            islemleri_bastir();
            System.out.print("islem seciniz: ");
            int islem = input.nextInt();
            System.out.println();
            switch (islem) {
                case 1:

                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }

                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("bir onceki sehre gidiliyor.");
                        System.out.println("Gidilen sehir: " + iterator.previous());
                        ileri = false;
                    } else {
                        System.out.println("Suandan once bir sehir bulunmamaktadir.");
                    }
                    break;
                case 2:

                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }

                    }
                    if (iterator.hasNext()) {
                        System.out.println("bir sonraki sehre gidiliyor.");
                        System.out.println("Gidilen sehir: " + iterator.next());
                        ileri = true;
                    } else {
                        System.out.println("Suandan sonra bir sehir bulunmamaktadir.");
                    }
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor.");
                    cikis = true;
                    break;
            }
            System.out.println("--------------------------------------------------------------------------------------------");
        }

    }

    public static void islemleri_bastir() {

        System.out.println("1 - bir onceki sehre git.");
        System.out.println("2 - bir sonraki sehre git.");
        System.out.println("0 - cikis yap.");

    }
}
