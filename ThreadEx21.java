class MulTable extends Thread //Multiplication Table of 5
{
public void run()
{
for (int i = 1; i <= 10; i++)
{
System.out.println ("5 x " + i + " = " + (5 * i));
try
{
Thread.sleep(500); // Adding delay for better visibility
} catch (InterruptedException e)
{
System.out.println (e);
}
}
}
}
class OddNum extends Thread //First N Odd Numbers
{
private int N;
public OddNum(int N) // Constructor to initialize N
{
this.N = N;
}
public void run()
{
int count = 0, num = 1;
while (count < N)
{
System.out.print(num + " ");
num += 2; // Next odd number
count++;
try
{
Thread.sleep(500);
} catch (InterruptedException e)
{ System.out.println(e); }
}
System.out.println();
}
}

public class ThreadEx21 // Main class to execute threads
{
public static void main(String[] args)
{ // Creating thread objects
MulTable t1 = new MulTable();
OddNum t2 = new OddNum(10); // Display first 10 odd numbers
// Starting threads
t1.start();
t2.start();
}
}