public class Taskboard {
    protected String[] columns = new String[100];
    //private String[] rows = new String[100];


    public Taskboard(String[] columns) {
        this.columns = columns;
    }

    /*
        public Taskboard(String[] columns, String[] rows) {
            this.columns = columns;
            this.rows = rows;
        }
        */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    /*
    public void setRows(String[] rows) {
        this.rows = rows;
    }
    */

}
