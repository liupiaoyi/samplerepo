package work.test;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lambdaFunc.interf.Person;
import work.pojo.Student;

public class StudentTest {
	
	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<>();
		
		Integer [] scopes = new Integer [] {100,95,90,85,80,75,70};
		for (int i = 1; i <= 50; i++) {
			int sindex = (int) (Math.random()*7);
			ls.add( new Student(i,"stu"+i,scopes[sindex]) );
			//System.out.println( new Student(i,"stu"+i,scopes[sindex]) );
		}

		Map<Double, Long> collect = ls.stream().collect(Collectors.groupingBy(Student::getScope,Collectors.counting() ));
		Map<Double, List<Student>> collect2 = ls.stream().collect(Collectors.groupingBy(Student::getScope ));
		System.out.println(collect);
		collect2.forEach((k,y) -> y.forEach(System.out::println));
		
		
		
//		Stream<Student> stream = ls.stream();
//		Stream<Student> sf = stream.filter(s -> s.getScope()==100);
//		sf.forEach(System.out::println);
		

//		List<Student> retList = findMathStudent(ls,s -> s.getScope()==100);
//		System.out.print(retList.size()+"::");
//		Stream.of(retList).forEach(System.out::println);
		
	}
	
	public static List<Student> findMathStudent(List<Student> student,Predicate<Student> pre) {
		List<Student> ss = new ArrayList<>();
		
		for (Student s : student) {			
			if(pre.test(s)) {
				ss.add(s);
			}
		}		
		return ss;
	}
	
	
}
