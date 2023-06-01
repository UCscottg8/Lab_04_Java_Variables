// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Integer variables
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum, intProduct, intDifference, intQuotient, intModulo;

        // Double variables
        double doubleOperandA = 1.5;
        double doubleOperandB = 2.6;
        double doubleSum, doubleProduct, doubleDifference, doubleQuotient;

        // Integer operations
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        // Double operations
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        // Output statements
        System.out.println("The sum using integers of " + intOperandA + " and " + intOperandB +  " is " + intSum);
        System.out.println("The product using integers of " + intOperandA + " and " + intOperandB +  " is " + intProduct);
        System.out.println("The difference using integers of " + intOperandA + " and " + intOperandB +  " is " + intDifference);
        System.out.println("The quotient using integers of " + intOperandA + " and " + intOperandB +  " is " + intQuotient);
        System.out.println("The modulo using integers of " + intOperandA + " and " + intOperandB +  " is " + intModulo);

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB +  " is " + doubleQuotient);
        }
    }
