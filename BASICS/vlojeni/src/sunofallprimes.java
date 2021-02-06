import java.util.Scanner;

public class sunofallprimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeSum = 0;
        int nonprimeSum = 0;
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
            } else if(num==1){
                primeSum+=1;
            }
                else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    primeSum += num;
                } else {
                    nonprimeSum += num;
                }}
                input = scanner.nextLine();
            }
            System.out.printf("Sum of all Prime numbers is: %d\n",primeSum);
            System.out.printf("Sum of all non prime numbers is: %d",nonprimeSum);
        }
    }

