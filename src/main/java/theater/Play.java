package theater;

/**
 * Class representing a play.
 * @author null
 */
public class Play {
    private String name;
    private String type;

    /**
     * Constructs a Play object with name and type.
     * @param name1 name
     * @param type1 type
     */
    public Play(String name1, String type1) {
        this.name = name1;
        this.type = type1;
    }

    /**
     * Returns the name of the play.
     * @return name of Play
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the play.
     * @param name1 name
     */
    public void setName(String name1) {
        this.name = name1;
    }

    /**
     * Returns the type of play.
     * @return the type of play
     */
    public String getType() {
        return type;
    }
}
