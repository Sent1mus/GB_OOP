package Homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;

public class ReportEntrypoint {

    Map<String, Class> creators = new HashMap<String, Class>();

    public ReportEntrypoint() {
        findCreators();
    }

    private void findCreators() {
        Reflections reflections = new Reflections("Homework");
        Set<Class<? extends ReportCreator>> classes = reflections.getSubTypesOf(ReportCreator.class);
        for (Class item : classes) {
            creators.put(item.getSimpleName(), item);
        }
    }

    public Report create(Document document, String reportType) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<?> creatorConstructor = creators.get(reportType).getConstructors()[0];

        ReportCreator newCreator = (ReportCreator) creatorConstructor.newInstance();

        Report newRep = newCreator.createReport(document);

        return newRep;
    }

}
