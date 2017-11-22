package StreamEg;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamTest {
	  public static void main(String[] args) {
		  

		  String [] strList = new String [] {"hellow","world","and","java"};

		  List<Integer> intList = Arrays.asList(1,3,5,7,9);
		  
		  //collect
		  List<String> coList = Arrays.stream(strList).collect(toList());
		  
		  
		  //创建数组-> 转成流->collect处理-> toList()
		  List<Character> character = Stream.of('h','e','l','o').collect(toList());
		  
		  //数组-> 转成流->遍历输出（consumer<T> 传参，没有返回值）
		  //Stream.of('h','e','l','o').forEach(System.out::print);
		  
		  //数组-> 转成流->并列->遍历输出
		  //Stream.of("w","o","r","l","d").parallel().forEach(System.out::print);
		  
		  //数组-> 转成流->map->遍历输出长度
		  //Stream.of("map","ap","p").map(String::length).forEach(System.out::print);
		  
		  //数组 -> 转成流 -> filter(Predicate<T>) -> 遍历输出长度为2的数组
		  //Stream.of("map","ap","pe").filter(s -> s.length() == 2).forEach(System.out::print);
		  
		  Stream.of("map","ap","pe").peek(s -> System.out.println(s)).forEach(System.out::print);
		  // --->map  mapap  appe  pe
		  
//		    IntStream.of(5, 10);
//		    Stream.of("1", "3", "5").mapToInt(Integer::parseInt).forEach(System.out::println);
//		    IntStream.builder().add(1).add(2).add(3).build();
//		    IntStream.concat(IntStream.builder().add(1).build(), IntStream.builder().add(1).build());
//		    IntStream emptyStream = IntStream.empty();
//		    IntStream.generate(() -> 1).limit(30);
//		    IntStream.iterate(0, n -> n + 3).limit(3).boxed().collect(Collectors.toList());
//		    IntStream.range(30, 50);
//		    IntStream.rangeClosed(30, 50);
		  
		  }
		}
