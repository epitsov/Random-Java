import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int NumOfBadges;
    private List<Pokemon> list = new ArrayList();

    public Trainer() {
        this.NumOfBadges = 0;
        this.list = new ArrayList<>();
    }

    public void increaseBadges() {
        this.NumOfBadges = this.NumOfBadges + 1;
    }

    public int getNumOfBadges() {
        return this.NumOfBadges;
    }
    public int collectionSize()
    {
        return list.size();
    }

    public void addToList(Pokemon pokemon) {
        this.list.add( pokemon );
    }

    public void removeFromList(Pokemon pokemon) {
        this.list.remove( pokemon );
    }

    public List<Pokemon> getList() {
        return list;
    }


}
