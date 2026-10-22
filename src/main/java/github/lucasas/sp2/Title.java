package github.lucasas.sp2;

public abstract class Title {
    private static final double RATE = 0.067574;

    private final String title;
    private final String literatureType;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }


}
