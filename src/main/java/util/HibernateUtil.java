package util;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;
import lombok.experimental.UtilityClass;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

@UtilityClass
public class HibernateUtil {
    public static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Detail.class);
        configuration.configure();
        return configuration.buildSessionFactory();
    }
}
