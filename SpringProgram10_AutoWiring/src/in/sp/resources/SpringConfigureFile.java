package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigureFile 
{
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		
		addr.setHouseno(100);
		addr.setCity("Siliguri");
		addr.setPincode(100);
		
		return addr;
		
	}
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setRollno(101);
		std.setName("Suraj");
		//std.setAddress(createAddrObj());       //manually DI 
		
		return std;
	}
}
