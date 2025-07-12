import java.util.Scanner; // Importujemy klasę Scanner do pobierania danych

public class ProstyKalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy obiekt Scanner

        System.out.println("--- Prosty Kalkulator ---");

        // Pobieranie pierwszej liczby
        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble(); // Odczytujemy liczbę typu double

        // Pobieranie operatora
        System.out.print("Podaj operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Odczytujemy pierwszy znak z wprowadzonego ciągu

        // Pobieranie drugiej liczby
        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        double wynik = 0; // Zmienna do przechowywania wyniku

        // Wykonujemy operację w zależności od wybranego operatora
        switch (operator) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                if (liczba2 != 0) { // Sprawdzamy, czy dzielnik nie jest zerem
                    wynik = liczba1 / liczba2;
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                    return; // Kończymy program w przypadku błędu
                }
                break;
            default:
                System.out.println("Błąd: Nieprawidłowy operator!");
                return; // Kończymy program w przypadku błędu
        }

        // Wyświetlanie wyniku
        System.out.println("Wynik: " + liczba1 + " " + operator + " " + liczba2 + " = " + wynik);

        scanner.close(); // Zamykamy obiekt Scanner, aby zwolnić zasoby
    }
}