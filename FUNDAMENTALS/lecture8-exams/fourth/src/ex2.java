import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []input=scanner.nextLine().split("\\|");
        List<String>  rooms=new ArrayList<>(Arrays.asList(input));
        int health=100;
        int bitcoins=0;
        boolean isdead=false;
        boolean healthover=false;
        for (int i = 0; i<rooms.size() ; i++) {
            if(isdead==true)
            {break;}
            String current=rooms.get(i);
            String []input1=current.split(" ");
    String command=input1[0];
    int index=Integer.parseInt(input1[1]);
            switch (command){
                    case "potion":
                    if(!healthisfull(health))
                    {health+=index;
                    if (health>100)
                    {healthover=true;
                    System.out.printf("You healed for %d hp.%n",(index-(health-100)));
                    health=100;}
                    if(healthover==false){
                    System.out.printf("You healed for %d hp.%n",index);}}
                    System.out.printf("Current health: %d hp.%n",health);
                    break;
                    case "chest":
                    bitcoins+=index;
                    System.out.printf("You found %d bitcoins.%n",index);
                    break;
default:
        health-=index;
        if(health<=0)
        {
        System.out.printf("You died! Killed by %s.\n",command );
        System.out.printf("Best room: %d\n",i+1);
        isdead=true;
        }
        else
        {
        System.out.printf("You slayed %s.\n",command);
        }
        break;

        }
        }
        if(health>0)
        {
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n",bitcoins);
        System.out.printf("Health: %d",health);}
        }

private static boolean healthisfull(int health) {
        return health>=100;}
        }
