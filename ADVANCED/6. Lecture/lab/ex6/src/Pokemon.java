public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;

    }

    public String getElement() {
        return element;
    }

    public String getName() {

        return name;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth() {
        this.health = -10;
        if (this.health <= 0) {
            this.health = 0;
        }
    }

    public void deletePokemon() {
    }
}
