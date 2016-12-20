package com.example.practicaltest.Model;

import java.util.List;

/**
 * Created by C4Q on 12/19/16.
 */
public class Data {
    List<Records> records ;

    public Data(List<Records> records) {
        this.records = records;
    }

    public List<Records> getRecord() {
        return records;
    }

    public void setRecord(List<Records> records) {
        this.records = records;
    }
}
