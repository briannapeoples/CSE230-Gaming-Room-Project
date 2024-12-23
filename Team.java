import java.util.ArrayList;
import java.util.List;

public class Team extends Entity {
    private List<Player> players = new ArrayList<>();

    public Team(long id, String name) {
        super(id, name);
    }

    public Player addPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player; 
            }
        }
        Player player = new Player(players.size() + 1, name);
        players.add(player);
        return player;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String toString() {
        return "Team [id =" + getId() + ", name =" + getName() + "]";
    }
}