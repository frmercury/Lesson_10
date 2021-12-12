package SportFan;

public abstract class SportClub {

    public SportClub(String name, String type, String owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    public String name;
    private String type, owner;

    public abstract void supportYourClub ();
    public abstract void yearSubscribe ();

}