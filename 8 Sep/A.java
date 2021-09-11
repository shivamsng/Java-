package Eightsep;

abstract class A
{
abstract void call();
}
class B extends A
{
public void call()
{
System.out.println("call me from B");
}
public static void main(String arr[])
{
B b=new B();
b.call();
}
}
