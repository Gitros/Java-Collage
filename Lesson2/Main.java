//Klasa reprezetnująca punkt na płaszczyźnie 2D
class Point2D
{
    double x, y; //Współrzędne punktu
    //Konstruktor bezargumentowy
    Point2D()
    {
        this.x = 0.0; //Ustawienie pola this.x klasy na wartość 0.0
        this.y = 0.0; //Ustawienie pola this.y klasy na wartość 0.0
        System.out.println("Point2D()");
    }
    //Konstruktor argumentowy
    Point2D(double x, double y)
    {
        this.x = x; //Ustawienie pola this.x klasy na wartość argumentu x
        this.y = y; //Ustawienie pola this.y klasy na wartość argumentu y
        System.out.println("Point2D(double x, double y)");
    }
    //Metody dostępowe typu setter
    void setX(double x)
    {
        this.x = x;
    }
    void setY(double y)
    {
        this.y = y;
    }
    void setXY(double x, double y)
    {
        this.setX(x);
        this.setY(y);
    }
    //Metody dostępowe typu getter
    double getX()
    {
        return this.x;
    }
    double getY()
    {
        return this.y;
    }
}
//Klasa reprezetnująca koło
class Circle
{
    double radius; //Promień
    Point2D centre; //Środek koła
    //Domyślny konstruktor
    Circle()
    {
        this.radius = 1.0; //Ustawienie promienia
        this.centre = new Point2D(); //Tworzenie obiektu jako środka koła
        System.out.println("Circle()");
    }
    //Konstruktor przeciążony
    Circle(double r)
    {
        this.radius = r; //Ustawienie promienia na wartość parametru r
        this.centre = new Point2D(); //Tworzenie obiektu jako środka koła
        System.out.println("Circle(double r)");
    }
    Circle(double r, double x, double y)
    {
        this.radius = r; //Ustawienie promienia na wartość parametru r
        this.centre = new Point2D(x, y); //Tworzenie obiektu jako środka koła z argumentami x, y
        System.out.println("Circle(double r, double x, double y)");
    }
    //Metody typu setter
    void setRadius(double r)
    {
        this.radius = r; //Ustawienie promienia na wartość argumentu r
    }
    //Metody typu getter
    double getRadius()
    {
        return this.radius; //Zwracanie wartości promienia
    }
    double getDiameter()
    {
        return 2 * this.radius; //Obliczanie średnicy koła i zwracanie wyniku
    }
    double getCircuit()
    {
        return 2 * 3.14 * this.radius; //Obliczanie obwodu koła i zwracanie wyniku
    }
    double getArea()
    {
        return 3.14 * this.radius * this.radius; //Obliczanie pola koła i zwracanie wyniku
    }
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Klasa Circle (dla tworzenia kółek) i Point2D (dla tworzenia punktów)");
		Point2D p1 = new Point2D(); //Tworzenie obiektu p1 konstruktorem domyślnym
		Point2D p2 = new Point2D(-9.5, 21.05); //Tworzenie obiektu p1 konstruktorem domyślnym
		System.out.println("p2(" + p2.getX() + ", " + p2.getY() + ")");
		Circle c1 = new Circle(); //Tworzenie obiektu c1 konstruktorem domyślnym
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
