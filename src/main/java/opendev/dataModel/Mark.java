package opendev.dataModel;

import java.util.ArrayList;

/**
 * Created by Vladimir on 30.06.2021.
 */
public class Mark {
    private String code;
    private ArrayList<Folder> folders;

    public Mark(String code, ArrayList<Folder> folders) {
        this.code = code;
        this.folders = folders;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    @org.jetbrains.annotations.NotNull
    private String getFoldersString(){
        StringBuilder stringBuilder = new StringBuilder();
        folders.forEach(folder -> stringBuilder.append(folder.toString()));
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "\nMark{" +
                "code='" + code + '\'' +
                ", folders=" + getFoldersString() +
                '}';
    }
}
