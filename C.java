
// Multiple inheritance
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
}
class C extends B {
void Mul() {
c=a*b;
System.out.println("Multiplication is"+c);
}

public static void main(String[]args){
C c=new C();
c.Add();
c.Sub();
c.Mul();
}
}
