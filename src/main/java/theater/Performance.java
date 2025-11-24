package theater;

/**
 * Class representing a performance of a play.
 * This class is not intended to be subclassed.
 */
public final class Performance {
    private final String playID;
    private final int audience;

    /**
     * Constructs a Performance with the given play identifier and audience count.
     * @param playId1 id
     * @param audience1 count
     */
    public Performance(String playId1, int audience1) {
        this.playID = playId1;
        this.audience = audience1;
    }

    /**
     * Returns unique identifier of play.
     * @return playID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the amount of people in the audience.
     * @return audience count
     */
    public int getAudience() {
        return audience;
    }
}
