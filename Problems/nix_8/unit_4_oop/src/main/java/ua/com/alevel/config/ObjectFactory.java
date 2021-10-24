package ua.com.alevel.config;

import org.reflections.Reflections;
import ua.com.alevel.db.UserDB;
import ua.com.alevel.db.impl.AaDB;
//import ua.com.alevel.db.impl.AaDB;
//import ua.com.alevel.db.impl.SomeUserDB;
import ua.com.alevel.db.impl.SomeUserDB;
import ua.com.alevel.db.impl.UserInMemoryDB;
import ua.com.alevel.util.ResourcesUtil;

import java.util.Map;
import java.util.Set;

public class ObjectFactory {

    private static ObjectFactory objectFactory;
    private final Reflections reflections;
    private final Map<String, String> propertiesMap;

    private ObjectFactory() {
        reflections = new Reflections("ua.com.alevel");
        propertiesMap = ResourcesUtil.getProperties(this.getClass().getClassLoader());
    }

    public static ObjectFactory getInstance() {
        if (objectFactory == null) {
            objectFactory = new ObjectFactory();
        }
        return objectFactory;
    }

    public <IFC> IFC getCurrentObject(Class<IFC> ifc) {
        if (ifc.isInterface()) {
            Set<Class<? extends IFC>> implS = reflections.getSubTypesOf(ifc);
            for (Class<? extends IFC> impl : implS) {
                if (ifc.isAssignableFrom(UserDB.class)) {
                    String db = propertiesMap.get("db");
                    if (db.equals("some")) {
                        return (IFC) SomeUserDB.getInstance();
                    } else {
                        return (IFC) UserInMemoryDB.getInstance();
                    }
                }
                if (!impl.isAnnotationPresent(Deprecated.class)) {
                    try {
                        return impl.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        throw new RuntimeException("class not found by interface");
    }
}
