public class Card extends Taskboard {
    protected String cardType;
    protected int columnChoice;

    public Card(String[] columns, String cardType, int columnChoice) {
        super(columns);
        this.cardType = cardType;
        this.columnChoice = columnChoice;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setColumnChoice(int columnChoice) {
        this.columnChoice = columnChoice;
    }
}
