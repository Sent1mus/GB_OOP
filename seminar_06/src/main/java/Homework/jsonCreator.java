package Homework;

public class jsonCreator implements ReportCreator {

    public jsonCreator() {
    }

    @Override
    public Report createReport(Document document) {
        System.out.println("Create JSON-report for document: " + document);
        return new Report(document.getId().toString(), document.getDate().toString(), document.getDescription());
    }
}
