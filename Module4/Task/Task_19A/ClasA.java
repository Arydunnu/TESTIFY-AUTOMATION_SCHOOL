package JavaKeywords;

public class ClasA {
    // Final variables
    private final String ballSize;
    private final String ballColour;
    private final String ballTexture;

    // Constructor to initialize final variables
    public ClasA(String ballSize, String ballColour, String ballTexture) {
        this.ballSize = ballSize;
        this.ballColour = ballColour;
        this.ballTexture = ballTexture;
    }

    // Getter methods (no setter for ballSize)
    public String getBallSize() {
        return ballSize;
    }

    public String getBallColour() {
        return ballColour;
    }

    public String getBallTexture() {
        return ballTexture;
    }
}
