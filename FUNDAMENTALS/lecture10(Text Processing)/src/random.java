public class random {
    public static void main(String[] args) {
        String text = "The Bridgeport, Connecticut, Centennial half dollar is a fifty-cent piece issued by the United States Bureau of the Mint in 1936 as a commemorative coin. Designed by Henry Kreis, the obverse (pictured) depicts the showman P. T. Barnum, who was one of Bridgeport's most famous residents, mayor of the city, helped develop it, and is buried there. Bridgeport authorities wanted a commemorative coin, and authorizing legislation passed Congress without opposition. Kreis had designed the Connecticut Tercentenary half dollar (1935), and he produced designs showing Barnum and a modernistic eagle similar to the one on the Connecticut piece. The coins were vended to the public beginning in September 1936 at a price of $2. Too late for most of the centennial celebrations, the coins sold well. Unsold pieces were bought up by coin dealers and wholesale quantities were available on the secondary market until the 1970s. ";
        if (text.indexOf("the") != -1) {
            System.out.print("the text contains the");
            System.out.print(countOccurances(text,"the"));
        } else {
            System.out.println("text doesn't contain the");
        }

    }

    static int countOccurances(String text, String word) {
        int count = 0;
        text=text.toLowerCase();
        word=word.toLowerCase();
       int start = text.indexOf(word);
       while(start!=-1)
       {count++;
       start=text.indexOf(word,start+1);
       }
      //  if (start != -1) {
        //    count++;
        //}
        //int start = -1;
        //while ((start = text.indexOf(word, start + 1)) != -1) {
        //  count++;
        //}
        return count;
    }
}
