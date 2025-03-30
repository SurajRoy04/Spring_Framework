package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

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
	public Address createAddrObj2() {
		Address addr=new Address();
		
		addr.setHouseno(100);
		addr.setCity("G");
		addr.setPincode(100);
		
		return addr;
		
	}
	@Bean
	public Subjects createSubjObj() {
		Subjects subj = new Subjects();
		
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");
		
		subj.setSubjects(subjects_list);
		
		return subj;
	}
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setRollno(101);
		std.setName("Suraj");
		//std.setAddress(createAddrObj()); //manually DI 
		//std.setSubjects(createSubjObj());
		
		return std;
	}
}
