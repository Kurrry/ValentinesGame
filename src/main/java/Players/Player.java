package Players;

public class Player {
    private int lovePoints = 0;
    private String name;
    private String[] powersOfLove;


    public Player(String name, String[] powersOfLove) {
        this.name = name;
        this.powersOfLove = powersOfLove;
    }

    public Player(String name) {
        this.name = name;
    }

    public void incrementLovePoints() {
        lovePoints++;
    }

    public int getLovePoints() {
        return lovePoints;
    }

    public void setLovePoints(int lovePoints) {
        this.lovePoints = lovePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPowersOfLove() {
        return powersOfLove;
    }

    public void setPowersOfLove(String[] powersOfLove) {
        this.powersOfLove = powersOfLove;
    }

    public void printPowers() {
        int count = 1;

        for (String powers : this.getPowersOfLove()) {
            System.out.println(count + ": " + powers);
            count++;
        }
    }
}
