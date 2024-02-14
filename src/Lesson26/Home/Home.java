package Lesson26.Home;

public class Home {
    private HomeBuilder.HomeName homeName;
    private HomeBuilder.HomeWall homeWall;
    private HomeBuilder.HomeGarden homeGarden;
    private HomeBuilder.HomeBasen homeBasen;
    private boolean yesFantan;
    private boolean kamen;
    private boolean garaj;

    public Home(HomeBuilder.HomeName homeName, HomeBuilder.HomeWall homeWall, HomeBuilder.HomeGarden homeGarden, HomeBuilder.HomeBasen homeBasen, boolean yesFantan, boolean kamen, boolean garaj) {
        this.homeName = homeName;
        this.homeWall = homeWall;
        this.homeGarden = homeGarden;
        this.homeBasen = homeBasen;
        this.yesFantan = yesFantan;
        this.kamen = kamen;
        this.garaj = garaj;
    }

    @Override
    public String toString() {
        return "Home{ \n" +
                " homeName=" + homeName + ",\n homeWall=" + homeWall + ",\n homeGarden=" + homeGarden +
                ", \n homeBasen=" + homeBasen +
                ",\n yesFantan=" + yesFantan +
                ",\n kamen=" + kamen +
                ", \n garaj=" + garaj +
                '}';
    }

}
