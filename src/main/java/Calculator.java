public class Calculator {

    public String helloWorld() {
        return "Hello World!";
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int subtraction(int number1, int number2){
        return number1 - number2;
    }

    public int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public int sumAndSubtraction(int number1, int number2){
        return (number1 + number2) - (number1 + number1);

    }
}
