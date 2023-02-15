public class Table 
{
void print()
{
int num=76542;
for(int i=1;i<=10;i=i+1)
{
System.out.println(num+"*"+i+"="+(num*i));
}
}
public static void main(String args[])
{
Table sum=new Table();
sum.print();
}
}
