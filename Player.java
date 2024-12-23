public class Player extends Entity {
    public Player(long id, String name) {
        super(id, name);
    }

    public String toString() {
        return "Player [id =" + getId() + ", name =" + getName() + "]";
    }
}
