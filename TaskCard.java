public class TaskCard extends Card {
    private String color;
    private String title;
    private String description;
    private String[] tags = new String[100];

    public TaskCard(String[] columns, String cardType, int columnChoice, String color, String title, String description, String[] tags) {
        super(columns, cardType, columnChoice);
        this.color = color;
        this.title = title;
        this.description = description;
        this.tags = tags;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void moveTaskCardTo(int index) {
        setColumnChoice(index);
    }
}
