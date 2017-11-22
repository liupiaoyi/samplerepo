package lambdaFunc.interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindMathMethodTest {
	public static void main(String[] args) {
		
		List<Person> ls = new ArrayList<>();
		ls.add( new Person(20,"张三",8000.0) );
		ls.add( new Person(10,"张三",8000.0) );
		ls.add( new Person(10,"张三",9000.0) );
		ls.add( new Person(10,"张三",100000.0) );
		
		//List<Person> retList = findMathPerson(ls,p -> p.getId()==10);
		List<Person> retList = findMathPerson(ls,p -> p.getSalary()>10000);
		for (Person person : retList) {
			System.out.println(person);
		}
	}
	
	public static List<Person> findMathPerson(List<Person> p,Predicate<Person> pre) {
		List<Person> ps = new ArrayList<>();
		
		for (Person person : p) {			
			if(pre.test(person)) {
				ps.add(person);
			}
		}		
		return ps;
	}
}
