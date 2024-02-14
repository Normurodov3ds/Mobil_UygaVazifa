package Lesson26.Home;

public interface HomeBuilder {
    enum HomeName{
        Business,SimpleHome,LuxHome;
    }
    enum HomeWall{
        BrickWall,ConcreteWall;
    }
    enum HomeBasen{
        BigBasen(15,35),SimalBasen(4,5),SimpleBasen(10,15),LuxBasen(25,55);
       private int x;
       private int y;

        HomeBasen(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
    enum HomeGarden{
        LuxLanshaft,SimpleLanshaft;
    }

    void setWall(HomeWall homeWall);
    void ChangeName(HomeName homeWall);
    void setBasen(HomeBasen homeBasen);
    void setGarden(HomeGarden homeGarden);
    void setKamen(boolean b);
    void setGaraj(boolean b);
    void setFantan(boolean b);
}
