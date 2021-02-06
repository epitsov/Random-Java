public class clock {
    public static void main(String[] args) throws InterruptedException {
        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int sec = 0; sec <= 59; sec++) {
                    System.out.printf("%d:%d:%d%n", hours, minutes, sec);
                    Thread.sleep(1000);
                }
            }
        }
    }
}
