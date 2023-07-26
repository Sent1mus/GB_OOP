package Homework;

import java.util.Date;
import java.util.UUID;

public class Document {

    private UUID id;
    private Date date;
    private String description;

    public Document() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id: {" + id + "}, creation date: " + date + ", description: " + description;
    }
}