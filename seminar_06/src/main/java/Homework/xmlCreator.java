package Homework;

public class xmlCreator implements ReportCreator {

    public xmlCreator() {
    }

    @Override
    public Report createReport(Document document) {
        System.out.println("Create XML-report for document: " + document);
        return new Report(document.getId().toString(), document.getDate().toString(), document.getDescription());
    }
}
