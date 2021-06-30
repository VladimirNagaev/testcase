package opendev.dataModel;

/**
 * Created by Vladimir on 30.06.2021.
 */
public class Modification {
    private String mark_id;
    private String folder_id;
    private String modification_id;
    private long configuration_id;
    private long tech_param_id;
    private String body_type;
    private String years;
    private String complectations = "";

    public Modification(String mark_id, String folder_id, String modification_id, long configuration_id, long tech_param_id, String body_type, String years, String complectations) {
        this.mark_id = mark_id;
        this.folder_id = folder_id;
        this.modification_id = modification_id;
        this.configuration_id = configuration_id;
        this.tech_param_id = tech_param_id;
        this.body_type = body_type;
        this.years = years;
        this.complectations = complectations;
    }

    public String getMark_id() {
        return mark_id;
    }

    public void setMark_id(String mark_id) {
        this.mark_id = mark_id;
    }

    public String getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(String folder_id) {
        this.folder_id = folder_id;
    }

    public String getModification_id() {
        return modification_id;
    }

    public void setModification_id(String modification_id) {
        this.modification_id = modification_id;
    }

    public long getConfiguration_id() {
        return configuration_id;
    }

    public void setConfiguration_id(long configuration_id) {
        this.configuration_id = configuration_id;
    }

    public long getTech_param_id() {
        return tech_param_id;
    }

    public void setTech_param_id(long tech_param_id) {
        this.tech_param_id = tech_param_id;
    }

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getComplectations() {
        return complectations;
    }

    public void setComplectations(String complectations) {
        this.complectations = complectations;
    }

    @Override
    public String toString() {
        return "\nModification{" +
                "mark_id='" + mark_id + '\'' +
                ", folder_id='" + folder_id + '\'' +
                ", modification_id='" + modification_id + '\'' +
                ", configuration_id=" + configuration_id +
                ", tech_param_id=" + tech_param_id +
                ", body_type='" + body_type + '\'' +
                ", years='" + years + '\'' +
                ", complectations='" + complectations + '\'' +
                '}';
    }
}
