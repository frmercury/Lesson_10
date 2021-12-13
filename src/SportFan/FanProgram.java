package SportFan;

public class FanProgram {

    public static void main(String[] args) {
        Football fclub1 = new Football("Manchester United","football","Glaciers", 32, 5, "Manchester");
        Football fclub2 = new Football("Manchester City","football","Emirates", 32, 1, "Manchester");
        Football fclub3 = new Football("Liverpool","football","Fenway Sports Group", 32, 2, "Liverpool");

        Basketball bclub1 = new Basketball("Lakers", "basketball", "Buss Family Trust");

        Hockey hclub1 = new Hockey("Chicago Blackhawks", "hockey","Virts");

        fclub1.supportYourClub();
        fclub2.supportYourClub();
        fclub3.supportYourClub();

        bclub1.yearSubscribe();

        hclub1.yearSubscribe();
    }
}