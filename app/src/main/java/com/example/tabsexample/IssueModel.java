package com.example.tabsexample;

public class IssueModel {

    private String reporter;
    private String title;

    public IssueModel() {

    }

    public IssueModel(String reporter, String title) {
        this.reporter = reporter;
        this.title = title;
    }

    public String getReporter() {
        return reporter;
    }

    public String getTitle() {
        return title;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
