class Circle
{
    double radius; //Promień
    //Domyślny konstruktor
    Circle()
    {
        radius = 1.0; //Ustawienie promienia
        System.out.println("Circle()");
    }
    //Konstruktor przeciążony
    Circle(double r)
    {
        radius = r; //Ustawienie promienia na wartość parametru r
        System.out.println("Circle(double r)");
    }
    //Metody typu setter
    void setRadius(double r)
    {
        radius = r; //Ustawienie promienia na wartość argumentu r
    }
    //Metody typu getter
    double getRadius()
    {
        return radius; //Zwracanie wartości promienia
    }
    double getDiameter()
    {
        return 2 * radius; //Obliczanie średnicy koła i zwracanie wyniku
    }
    double getCircuit()
    {
        return 2 * 3.14 * radius; //Obliczanie obwodu koła i zwracanie wyniku
    }
    double getArea()
    {
        return 3.14 * radius * radius; //Obliczanie pola koła i zwracanie wyniku
    }
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Klasa Circle");
		Circle c1 = new Circle(); //Tworzenie obiektu konstruktorem domyślnym
		System.out.println("Parametry stworzonego obiektu c1:");
		System.out.println("promień = " + c1.radius);
		System.out.println("średnica = " + c1.getDiameter());
		System.out.println("obwód = " + c1.getCircuit());
		System.out.println("pole = " + c1.getArea());
		System.out.println("Parametry zmodyfikowanego obiektu c1:");
		c1.radius = 2.75; //Ustawienie nowego promienia
		System.out.println("promień = " + c1.radius);
		System.out.println("średnica = " + c1.getDiameter());
		System.out.println("obwód = " + c1.getCircuit());
		System.out.println("pole = " + c1.getArea());
		System.out.println();
		Circle c2 = new Circle(7.52); //Tworzenie obiektu konstruktorem przeciążonym
		System.out.println("Parametry stworzonego obiektu c2:");
		System.out.println("promień = " + c2.radius);
		System.out.println("średnica = " + c2.getDiameter());
		System.out.println("obwód = " + c2.getCircuit());
		System.out.println("pole = " + c2.getArea());
		System.out.println();
	}
}
