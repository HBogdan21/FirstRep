public class StoryCard extends Card {
    private String color;
    private String title;
    private String description;
    private int storyPoints;

    public StoryCard(String[] columns, String cardType, int columnChoice, String title, String description, int storyPoints) {
        super(columns, cardType, columnChoice);
        this.color = "Yellow";
        this.title = title;
        this.description = description;
        this.storyPoints = storyPoints;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }
}
