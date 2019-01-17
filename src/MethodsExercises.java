import java.util.Scanner;


    public class MethodsExercises {
        public static void main(String[] args) {
            int result = factorial(4);
            System.out.println(result);
        }


        public static int factorial(int number) {
            int result = 1;

            do {
                result *= number;
                number--;
            } while(number >= 1);

            return result;

        }

        public static boolean userWantsToContinue() {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Do you want to continue? Type y or yes");
            String answer = scan.next();
            boolean Continue = answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
            return Continue;
        }

        public static int getInt() {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            return scan.nextInt();
        }

        public static int getInt(int min, int max) {
            System.out.println("Please input a number between " + min + " and " + max);
            int userInt = getInt();

            if(userInt < min || userInt > max) {
                System.out.println("The number is out of range");
                userInt = getInt(min, max);
            }

            return userInt;
        }


        // create a multiply method without * operator and implement using recursion
        public static int multiply(int n1, int n2) {

            if(n1 == 0 || n2 == 0) {
                return 0;
            }

            if(n2 > 0) {
                n2--;
                return n1 + multiply(n1, n2);
            } else {
                return -multiply(n1, -n2);
            }

        }

        // multiply without * operator
        public static long multiply(long n1, long n2) {
            if(n1 == 0 || n2 == 0) {
                return 0;
            }

            long product = 0;

            if(n2 > 1) {
                do {
                    product += n1;
                    n2--;

                } while(n2 >= 1);
            } else {
                do {
                    product -= n1;
                    n2++;

                } while(n2 <= -1);
            }

            return product;
        }


        public static int add(int n1    , int n2) {
            return n1 + n2;
        }

        public static double add(double n1, double n2) {
            return n1 + n2;
        }

        public static long add(long n1, long n2) {
            return n1 + n2;
        }

        // create a subtract method
        public static int subtract(int n1, int n2) {
            return n1 - n2;
        }

        public static double multiply(double n1, double n2) {
            return n1 * n2;
        }

        // create a divide method
        public static double divide(int n1, int n2) {
            return n1 / n2;
        }

        public static double divide(double n1, double n2) {
            return n1 / n2;
        }

        // create a remainder() method that returns the remainder of integer division of two numbers
        public static int remainder(int a, int b) {
            return a % b;
        }
    }
