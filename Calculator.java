public class Calculator
{
double add (double a,double b)
{
double c=a+b;
System.out.print("addition value is"+c);
return c;
}
double sub (double a,double b)
{
double c=a-b;
System.out.print("subtraction value is"+c);
return c;
}
double mul (double a,double b)
{
double c=a*b;
System.out.print("multiplication value is"+c);
return c;
}
double div (double a,double b)
{
double c=a/b;
System.out.print("division value is"+c);
return c;
}
double mod (double a,double b)
{
double c=a%b;
System.out.print("modulo value is"+c);
return c;
}
public static void main(String args[])
{
Calculator cal =new Calculator();
cal.add(7.0,5.0);
cal.sub(7.0,5.0);
cal.mul(7.0,5.0);
cal.div(7.0,5.0);
cal.mod(7.0,5.0);
}
}

