package Homework;

import java.lang.reflect.InvocationTargetException;

public class Homework {

    /**
     * Класс документ - описывает документ.
     * <p>
     * Нужно спроектировать подсистему отчетов, которая будет формировать отчеты для документа.
     * document -> report
     * 1. Формирование PDF-файла (потенциально может быть несколько видов разметки этого PDF-файла).
     * 2. Создание JSON-файла с полями документа
     * 3. Создание XML-файла с полями документа
     * 4. ... потенциально отчеты могут добавляться.
     * <p>
     * После реализации задать себе 2 вопроса:
     * 1. Насколько сложно добавить поддержку нового типа отчета?
     * 2. Как будет выглядеть проект, если типов отчетов будет 1000+?
     */


    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Document doc = new Document();

        ReportEntrypoint entrypoint = new ReportEntrypoint();
        Report pdfRep = entrypoint.create(doc, "pdfCreator");
        Report jsonRep = entrypoint.create(doc, "jsonCreator");
        Report xmlRep = entrypoint.create(doc, "xmlCreator");

        System.out.println(pdfRep);
        System.out.println(jsonRep);
        System.out.println(xmlRep);

    }
}



