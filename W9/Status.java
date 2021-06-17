package W9;

public class Status {
    private int code;
    private String description;

    public Status() {
        code = 0;
        description = null;
    }

    public Status(int nCode, String nDescription){
        this.code = nCode;
        this.description = nDescription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}