package Homework;

public class pdfCreator implements ReportCreator {

    public pdfCreator() {
    }

    @Override
    public Report createReport(Document document) {
        System.out.println("Create PDF-report for document: " + document);
        return new Report(document.getId().toString(), document.getDate().toString(), document.getDescription());
    }
}
