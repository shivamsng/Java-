package Eightsep;

interface sum
{
int pq=50;
void suma();
}
interface add
{
int rs=51;
void adda();
}
class A1 implements add ,sum
{
public void suma()
{
System.out.println(+pq);
}
public void adda()
{
System.out.println(+rs);
}
public static void main(String args[])
{
A1 n= new A1();
n.adda();
n.suma();
}
}