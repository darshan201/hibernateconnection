/*
 * package hibernateconnection;
 * 
 * import org.hibernate.Session; import org.hibernate.SessionFactory; import
 * org.hibernate.Transaction; import org.hibernate.boot.Metadata; import
 * org.hibernate.boot.MetadataSources; import
 * org.hibernate.boot.registry.StandardServiceRegistry; import
 * org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 * 
 * public class StroreData {
 * 
 * public static void main(String[] args) { StandardServiceRegistry ssr = new
 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
 * SessionFactory factory = meta.getSessionFactoryBuilder().build(); Session
 * session = factory.openSession(); Transaction t = session.beginTransaction();
 * Employee employee = new Employee();
 * 
 * 
 * employee.setId(2); employee.setFirstname("darshan");
 * employee.setLastname("patel");
 * 
 * session.save(employee); session.getTransaction().commit();
 * System.out.println("done"); session.close();
 * 
 * 
 * }
 * 
 * }
 */
