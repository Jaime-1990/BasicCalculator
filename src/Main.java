public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        //prueba suma
        System.out.println(myCalculator.add(5,7));
        //prueba resta
        System.out.println(myCalculator.subtract(45,11));
        //prueba multiplicación
        System.out.println(myCalculator.multiply(3,78));
        //prueba división
        System.out.println(myCalculator.divided(58,21));
        //prueba módulo
        System.out.println(myCalculator.module(154, 33));
    }
}
