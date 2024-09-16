/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(12, 2);
        System.out.println();

    }

    // 1. add
    public static int add (int a, int b) {
        return a+b;
    }
    
    // 2. add
    public static int add (int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return ("早上好, " + name);
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return ("下午好, " + name);
    }
    // 5. triple
    public static String triple (String triple) {
        return (triple + triple + triple);
    }

    // 6. half
    public static int half (int number){
        return number/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double number1) {
        int roundPositive = (int) number1;
        return roundPositive;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double number2){
        int roundNegative = (int) number2;
        return roundNegative;
    }
}
