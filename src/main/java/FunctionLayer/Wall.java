package FunctionLayer;

public class Wall {
    private int styklisteid;
    private int smallBrick;
    private int mediumBrick;
    private int largeBrick;

    public Wall(int smallBrick, int mediumBrick, int largeBrick) {
        this.smallBrick = smallBrick;
        this.mediumBrick = mediumBrick;
        this.largeBrick = largeBrick;
    }

    public Wall(int styklisteid, int smallBrick, int mediumBrick, int largeBrick) {
        this.styklisteid = styklisteid;
        this.smallBrick = smallBrick;
        this.mediumBrick = mediumBrick;
        this.largeBrick = largeBrick;
    }

    public int getStyklisteid() {
        return styklisteid;
    }

    public void setStyklisteid(int styklisteid) {
        this.styklisteid = styklisteid;
    }

    public int getSmallBrick() {
        return smallBrick;
    }

    public void setSmallBrick(int smallBrick) {
        this.smallBrick = smallBrick;
    }

    public int getMediumBrick() {
        return mediumBrick;
    }

    public void setMediumBrick(int mediumBrick) {
        this.mediumBrick = mediumBrick;
    }

    public int getLargeBrick() {
        return largeBrick;
    }

    public void setLargeBrick(int largeBrick) {
        this.largeBrick = largeBrick;
    }
    
    
}
