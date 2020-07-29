// Program for Type Casting

// Higher value data type to Lower value data type

import java.util.Scanner;


class Circle{
public static void main(String args[])
{
double radius;
int area=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the radius of the Circle");
radius=s.nextDouble();
area = (int)((Math.PI)*radius*radius);
System.out.println("area is : "+area);
}
}

//Output : 95