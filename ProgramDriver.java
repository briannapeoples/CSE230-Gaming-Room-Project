public class ProgramDriver {
    public static void main(String[] args) {
        GameService service = GameService.getInstance();

        System.out.println("\nInitializing game data...");

        Game game1 = service.addGame("Game #1");
        System.out.println(game1);

        Team team1 = service.addTeam(game1.getId(), "Team #1");
        System.out.println(team1);

        Player player1 = service.addPlayer(team1.getId(), "Player #1");
        System.out.println(player1);

        SingletonTester tester = new SingletonTester();
        tester.testSingleton();
    }
}
