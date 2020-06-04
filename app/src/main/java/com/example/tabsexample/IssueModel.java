package com.example.tabsexample;

public class IssueModel {

    private String reporter;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String title;
    private String category;
    public IssueModel() {

    }

    public IssueModel(String reporter, String title, String category) {
        this.reporter = reporter;
        this.title = title;
        this.category = category;
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
