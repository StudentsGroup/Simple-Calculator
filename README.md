public class SimpleCalculator{
//Method for addition 
public double add(double a, double b) {
return a+b; 

}
//Method for subtraction 
public double subtract(double a, double b){
return a-b;
}
//Method for multiplication 
public double mltiply(double a, double b){
return a*b; 
}
//Method for division
public double mltiply(double a, double b) throws IllegalArgumentException{
 if(b==0) {
 throw new IllegalArgumentException("Cannot divide by zero"); 
 }
 return a/b; 
}
public static void main(String[]args){
SimpleCalculator calculator = new SimpleCalculator(); 
System.out.println("Addition:" +calculator.add(10,5));
System.out.println(Sutaction:" +calculator.subtract(10,5));
System.out.println(" Multiplication:" +calculator.multiply(10,5));
System.out.println("Division:" +calculator.divide(10,5));
}
}
