import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int snowballvalue=0;
        int maxvalue=Integer.MIN_VALUE;
        short maxsnowballSnow=0;
        short maxsnowballTime=0;
        short maxsnowballQuality=0;

        for (int i = 0; i <n ; i++) {
            {short snowballSnow=scanner.nextShort();
            short snowballTime=scanner.nextShort();
            byte snowballQuality=scanner.nextByte();
            snowballvalue= (int) Math.pow((snowballSnow/snowballTime),snowballQuality);
                if(snowballvalue>maxvalue)
            {maxvalue=snowballvalue;
                maxsnowballSnow=snowballSnow;
                maxsnowballTime=snowballTime;
                maxsnowballQuality=snowballQuality;}}
        }
        System.out.printf("%s : %s = %d (%s)",maxsnowballSnow,maxsnowballTime,maxvalue,maxsnowballQuality);
    }
}
