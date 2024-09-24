
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
}
class E extends C {
void Div() {
c=a*b;
System.out.println("Division is"+c);


public static void main(String[]args){
E e=new E();
e.Add();
e.Sub();
e.Mul();
}
}
