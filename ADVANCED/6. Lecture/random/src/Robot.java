public class Robot {
    public static int version = 3;
    String name;
    String serialNum;
    int power;

    public Robot(String name, String serialNum, int power) {

        this.name = name;
        this.serialNum = serialNum;
        this.power = power;

    }
    public static int getVersion()
    {
        return Robot.version;
    }

    public Robot(String name) {
        this( name, "FF", 0 );
    }

    public Robot() {
        this( "", "FF", 0 );
    }

    public void setPower(int newPower) {
        this.power = newPower;
    }

    public int getPower() {
        return this.power;
    }

    public String toString() {
        return "power" + this.power;
    }
}
