import java.util.ArrayList;
import java.util.List;

public class GameService {
    private static GameService instance;

    private static List<Game> games = new ArrayList<>();
    private static long nextGameId = 1;

    private GameService() {
    }

    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    public Game addGame(String name) {
        for (Game game : games) {
            if (game.getName().equals(name)) {
                return game; 
            }
        }
        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    public Team addTeam(long gameId, String name) {
        Game game = getGame(gameId);
        if (game != null) {
            return game.addTeam(name);
        }
        return null;
    }

    public Player addPlayer(long teamId, String name) {
        for (Game game : games) {
            for (Team team : game.getTeams()) {
                if (team.getId() == teamId) {
                    return team.addPlayer(name);
                }
            }
        }
        return null;
    }

    public Game getGame(long id) {
        for (Game game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    public int getGameCount() {
        return games.size();
    }
}
