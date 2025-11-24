package theater;

/**
 * Class representing a performance of a play.
 * This class is not intended to be subclassed.
 */
public final class Performance {
    private final String playID;
    private final int audience;

    public Performance(String playID1, int audience1) {
        this.playID = playID1;
        this.audience = audience1;
    }

    /**
     * @return play id
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * @return audience count
     */
    public int getAudience() {
        return audience;
    }
}
