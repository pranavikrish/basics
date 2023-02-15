public class Main
{
public static void main(String args[])
{
SBI sbi = new SBI();
sbi.credit(1000.0,500.0);
sbi.debit(1000.0,500.0);
sbi.generatepassbook();
sbi.printpassbook();
}
}

//class SBI extends RBI
//{
//
//void generatepassbook()
//{
//System.out.println("passbook got generated");
//}
//
//
//void printpassbook()
//{
//System.out.println("passbook got printed");
//}
//
//}
//
//class RBI
//{
//double credit(double balance,double amount)
//{
//balance = balance+amount;
//System.out.println(balance);
//return balance;
//}
//double debit(double balance,double amount)
//{
//balance=balance-amount;
//System.out.println(balance);
//return balance;
//}
// }
