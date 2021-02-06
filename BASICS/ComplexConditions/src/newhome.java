import java.util.Scanner;

public class newhome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String flower= scanner.nextLine();
        int numberofflowers=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());
        double price=0.0;
        if(flower.equals("Roses")&&numberofflowers>80)
        {
            price=(5*numberofflowers)*0.9;
        }
        else if(flower.equals("Roses")&&numberofflowers<=80)
        {
            price=(5*numberofflowers);
        }
        else if(flower.equals("Dahlias")&&numberofflowers>90)
        {
            price=(3.8*numberofflowers)*0.85;
        }
        else if(flower.equals("Dahlias")&&numberofflowers<=90)
        {
            price=(3.8*numberofflowers);
        }
        else if(flower.equals("Tulips")&&numberofflowers>80)
        {
            price=(2.8*numberofflowers)*0.85;
        }
        else if(flower.equals("Tulips")&&numberofflowers<=80)
        {
            price=(2.8*numberofflowers);
        }
        else if(flower.equals("Narcissus")&&numberofflowers>120)
        {
            price=(3*numberofflowers);
        }
        else if(flower.equals("Narcissus")&&numberofflowers<=120)
        {
            price=(3*numberofflowers)*1.15;
        }
        else if(flower.equals("Gladiolus")&&numberofflowers>80)
        {
            price=(2.5*numberofflowers);
        }
        else if(flower.equals("Gladiolus")&&numberofflowers<=80)
        {
            price=(2.5*numberofflowers)*1.2;
        }
        if(price<budget)
        {
            double moneyleft=budget-price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberofflowers,flower,moneyleft);
        }
        else{
            double moneyyouneed=price-budget;
            System.out.printf("Not enough money, you need %.2f leva more.",moneyyouneed);
        }
    }
    }

