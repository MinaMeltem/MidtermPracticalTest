package com.example.practicaltest.Model;

import java.util.List;

/**
 * Created by C4Q on 12/19/16.
 */
public class Data {
    List<Records> record ;

    public Data(List<Records> record) {
        this.record = record;
    }

    public List<Records> getRecord() {
        return record;
    }

    public void setRecord(List<Records> record) {
        this.record = record;
    }
}
