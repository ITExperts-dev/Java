// Program for OuterCasting

//Lower value to Higher value data type

import java.util.Scanner;

class Circle{
public static void main(String args[])
{
double radius, area=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the radius of the Circle");
radius=s.nextDouble();
area = (Math.PI)*radius*radius;
System.out.println("area is : "+area);
}
}

//Output is = 95.0133