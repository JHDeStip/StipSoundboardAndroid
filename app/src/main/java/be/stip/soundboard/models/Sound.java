package be.stip.soundboard.models;

public class Sound {

    private String name;

    public String getName() {
        return name;
    }

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public Sound(String name, String fileName) {
        this.name = name;
        this.fileName = fileName;
    }
}
