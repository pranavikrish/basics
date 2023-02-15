public class Method 
{
double square (double a)
{
double c=a*a;
System.out.println("The answer is"+c);
return c;
}
double cube (double a)
{
double c=a*square(a);
System.out.println("The answer is"+c);
return c;
}
public static void main(String args[])
{
Method cal=new Method ();
cal.square(2);
cal.cube(3);
}

}
