public class Main {
    public static void main(String args[]) {
        Taskboard tb = new Taskboard(new String[]{"Story", "Planned", "In Progress", "In Review", "Done"});
        StoryCard sc = new StoryCard(new String[]{"Story"}, "Story", 0, "A title",
                "A description", 50);

    }
}
