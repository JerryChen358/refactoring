package theater;

public class Play {
    private String name;
    private String type;

    public Play(String name1, String type1) {
        this.name = name1;
        this.type = type1;
    }

    /**
     * @return name of Play
     */
    public String getName() {
        return name;
    }

    /**
     * @param name of play
     */
    public void setName(String name1) {
        this.name = name1;
    }

    /**
     * @return the type of play
     */
    public String getType() {
        return type;
    }
}
//