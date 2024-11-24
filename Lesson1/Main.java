class MyClass {
    // Pole klasy MyClass
    int a;

    // Konstruktor klasy MyClass
    MyClass() {
        a = 0; // ustawienie pola a
        System.out.println("MyClass()");
    }

    // Metoda klasy MyClass (setter)
    void setA(int arg) {
        a = arg; // ustawienie pola a na wartość arg
    }

    // Metoda klasy MyClass (getter)
    int getA() {
        return a; // zwracanie wartości pola a
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.println("Bye");

        MyClass mc1 = new MyClass(); // Tworzenie obiektu mc1 z klasy MyClass
        System.out.println(mc1.a); // Wyświetlenie wartości pola "a" obiekut klasy MyClass
        mc1.a = 10; // Ustawienie wartości pola "a" obiektu klasy myclass
        System.out.println(mc1.a); // Wyświetlenie wartości pola "a" obiekut klasy MyClass
        mc1.setA(21); // Wywołanie metody setA z klasy MyClass na rzecz obiektu mc1
        System.out.println(mc1.getA()); // Wywołanie metody getA z klasy MyClass na rzecz obiektu mc1
    }
}
