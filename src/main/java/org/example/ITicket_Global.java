package org.example;

public class ITicket_Global implements ITicket {
    private   int id;
    private  String description;
    private  String resolution;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    public ITicket_Global(int id, String description, String resolution) {
        this.id = id;
        this.description = description;
        this.resolution = resolution;
    }
}
