package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Student;

@Configuration
//@Configuration indicates that the class is spring configuration class.
public class SpringConfigFile {
	
	@Bean
	public Student stdId1() {
		Student std=new Student();
		std.setName("amit");
		std.setRollno(108);
		std.setEmail("ni ew h");
		return std;
	}

}
