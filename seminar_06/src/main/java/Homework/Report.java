package Homework;

import java.util.Arrays;

public class Report {
    private byte[] data;

    public Report (String id, String date, String desc) {
        this.data = (id + date + desc).getBytes();
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

