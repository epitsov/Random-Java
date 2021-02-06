package ex6;

public class Vihecle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vihecle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    //Type: {typeOfVehicle}
    //Model: {modelOfVehicle}
    //Color: {colorOfVehicle}
    //Horsepower: {horsepowerOfVehicle}
    @Override

    public String toString()
    {String result=String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",this.type,this.model,this.color,this.horsePower);
    return result;}

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(Object brand) {
        this.model = model;
    }
}
