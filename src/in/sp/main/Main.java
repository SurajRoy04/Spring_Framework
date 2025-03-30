package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;

public class Main {

    public static void main(String[] args) {
        // Load applicationContext.xml from classpath
    	String config_loc="in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        // Get the Student bean
        Student student = (Student) context.getBean("stdId");
        student.display();

        // Display bean values
       
    }
}
// JAR files to be download
// 1. spring-beans-xxx.jar
// 2. spring-context-xxx.jar
// 3. common-logging-xxx.jar
// 5. spring-expression-xxx.jar

