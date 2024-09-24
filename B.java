import java.util.*;
class A{
int a=10,b=20,c;
void Add() {
c=a+b;
System.out.println("Addition is"+c);
}
}
class B extends A {
void Sub() {
c=a-b;
System.out.println("Subtraction  is"+c);
}
public static void main(String[]args){
B b=new B();
b.Add();
b.Sub();
}
}

