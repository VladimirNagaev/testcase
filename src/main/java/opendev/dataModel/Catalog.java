package opendev.dataModel;

import java.util.ArrayList;

/**
 * Created by Vladimir on 30.06.2021.
 */
public class Catalog {
    private ArrayList<Mark> marks;

    public Catalog(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }
}
