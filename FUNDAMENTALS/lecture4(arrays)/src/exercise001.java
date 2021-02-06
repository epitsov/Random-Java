public class exercise001 {
    public static void main(String[] args) {
        int []numbers ={13, 42, 69};
        String [] strings= new String[numbers.length];
        for(int i=0;i<strings.length;i++)
        {strings[i]=String.valueOf(numbers[i]);}
        //String [] numberStrings={"13","42","69"};
        String  joined =String.join("->", strings);
        System.out.println(joined);
    }
}
