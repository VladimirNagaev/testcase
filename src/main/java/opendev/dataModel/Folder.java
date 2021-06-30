package opendev.dataModel;

import java.util.ArrayList;

/**
 * Created by Vladimir on 30.06.2021.
 */
public class Folder {

    private  String modelName;
    private  int modelId;
    private ArrayList<Modification> modifications;

    public Folder(String modelName, int modelId, ArrayList<Modification> modifications) {
        this.modelName = modelName;
        this.modelId = modelId;
        this.modifications = modifications;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelId() {
        return modelId;
    }

    public ArrayList<Modification> getModifications() {
        return modifications;
    }

    public String getModificationString(){
        StringBuilder stringBuilder = new StringBuilder();
        modifications.forEach(modification -> stringBuilder.append(modification.toString()));
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "\nFolder{" +
                "modelName='" + modelName + '\'' +
                ", modelId=" + modelId +
                ", modifications=" + getModificationString() +
                '}';
    }
}
