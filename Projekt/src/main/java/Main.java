import java.util.Scanner;

public class Main {
    private static int liczbaPszczolNaWejsciu;
    private static int liczbaSzerszeniNaWejsciu;
    private static double szerokoscLaki = 20;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe pszczol mniejsza od " + szerokoscLaki*szerokoscLaki + ": ");
        liczbaPszczolNaWejsciu = scan.nextInt();

        while(liczbaPszczolNaWejsciu<=0 || liczbaPszczolNaWejsciu>=0.8*(szerokoscLaki*szerokoscLaki)){
            if(liczbaPszczolNaWejsciu<=0){
                System.out.println("Podana liczba jest nieprawidlowa, podaj dodatnia wartosc:");
            }
            else
                System.out.println("Podana liczba jest nieprawidlowa, podaj mniejsza liczbe:");

            liczbaPszczolNaWejsciu = scan.nextInt();
        }

        System.out.print("Podaj liczbe szerszeni mniejsza od " + (szerokoscLaki*szerokoscLaki-liczbaPszczolNaWejsciu) + ": ");
        liczbaSzerszeniNaWejsciu = scan.nextInt();

        while(liczbaSzerszeniNaWejsciu<=0 || liczbaSzerszeniNaWejsciu>=szerokoscLaki*szerokoscLaki-liczbaPszczolNaWejsciu){
            if(liczbaSzerszeniNaWejsciu<=0){
                System.out.println("Podana liczba jest nieprawidlowa, podaj dodatnia wartosc:");
            }
            else
                System.out.println("Podana liczba jest nieprawidlowa, podaj mniejsza liczbe:");

            liczbaSzerszeniNaWejsciu = scan.nextInt();
        }
    }

    public int getLiczbaPszczolNaWejsciu() {
        return liczbaPszczolNaWejsciu;
    }

    public int getLiczbaSzerszeniNaWejsciu() {
        return liczbaSzerszeniNaWejsciu;
    }

    public void wyswietlLake(){

    }
}
