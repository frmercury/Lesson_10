package SportFan;

public class Hockey extends SportClub {
    public Hockey(String name, String type, String owner, int numberOfPlayers, int placeInTable, String cityOfOrigin) {
        super(name, type, owner);
        this.numberOfPlayers = numberOfPlayers;
        this.placeInTable = placeInTable;
        this.cityOfOrigin = cityOfOrigin;
    }

    private int numberOfPlayers, placeInTable;
    private String cityOfOrigin;

    public Hockey(String name, String type, String owner) {
        super(name, type, owner);
    }

    public void supportYourClub() {
        System.out.printf("Support your club %s !!!!!!!!!!!!!!%n", name);
    }

    public void yearSubscribe() {
        System.out.printf("You've bought year subscribe for 500$. You are true %s fan!%n", name);
    }
}
