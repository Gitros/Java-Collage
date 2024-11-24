class Circle
{
    double radius; //Promień
    //Domyślny konstruktor
    Circle()
    {
        radius = 1.0;
    }
    //Metody typu setter
    void setRadius(double r)
    {
        radius = r;
    }
    //Metody typu getter
    double getRadius()
    {
        return radius;
    }
    double getDiameter()
    {
        return 2 * radius; //Obliczanie średnicy koła
    }
    double getCircuit()
    {
        return 2 * 3.14 * radius; //Obliczanie obwodu koła
    }
    double getArea()
    {
        return 3.14 * radius * radius; //Obliczanie pola koła
    }
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Klasa Circle");
		Circle c1 = new Circle(); //Tworzenie obiektu
		System.out.println("Parametry stworzonego obiektu c1:");
		System.out.println("promień = " + c1.radius);
		System.out.println("średnica = " + c1.getDiameter());
		System.out.println("obwód = " + c1.getCircuit());
		System.out.println("pole = " + c1.getArea());
		System.out.println("Parametry zmodyfikowanego obiektu c1:");
		c1.radius = 2.75;
		System.out.println("promień = " + c1.radius);
		System.out.println("średnica = " + c1.getDiameter());
		System.out.println("obwód = " + c1.getCircuit());
		System.out.println("pole = " + c1.getArea());
	}
}
