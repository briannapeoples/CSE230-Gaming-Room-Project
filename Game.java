import java.util.ArrayList;
import java.util.List;

public class Game extends Entity {
    private List<Team> teams = new ArrayList<>();

    public Game(long id, String name) {
        super(id, name);
    }

    public Team addTeam(String name) {
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team; // Return existing team if name matches
            }
        }
        Team team = new Team(teams.size() + 1, name);
        teams.add(team);
        return team;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String toString() {
        return "Game [id =" + getId() + ", name =" + getName() + "]";
    }
}