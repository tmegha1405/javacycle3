import java.util.*;
class shapes
{
void area(double side)
{
double square=side*side;
System.out.println("the area of the sqare is:"+square);
}
void Area(double r)
{
double circle=3.14*r*r;
System.out.println("the area of the circle is:"+circle);
}
void area(double l,double b)
{
double rect=l*b;
System.out.println("the area of the rctangle is:"+rect);
}
public static void main(String args[])
{
shapes obj = new shapes();
Scanner sc = new Scanner(System.in);
System.out.println(" Area of different shapes using overloaded functions ");
System.out.println("\nRECTANGLE");
System.out.println("Enter the length and breadth:");
double l = sc.nextDouble();
double b = sc.nextDouble();
obj.area(l,b);
System.out.println("\nSQUARE");
System.out.println("Enter the side:");
double s = sc.nextDouble();
obj.area(s);
System.out.println("\nCIRCLE");
System.out.println("Enter the radius:");
double r = sc.nextDouble();
obj.Area(r);
sc.close();
}
}
