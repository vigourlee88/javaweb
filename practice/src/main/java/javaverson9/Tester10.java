package javaverson9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream() 方法public Stream<T> stream()
//stream 方法的作用就是将 Optional 转为一个 Stream，
//如果该 Optional 中包含值，那么就返回包含这个值的 Stream，
//否则返回一个空的 Stream（Stream.empty()）。
public class Tester10 {
	public static void main(String[] args) {
		List<Optional<String>> list = Arrays.asList(
			Optional.empty(),
			Optional.of("A"),
			Optional.empty(),
			Optional.of("B"));
	
	//filter the list based to print non-empty values
	
	//if optional is non-empty,get the value in stream,otherwise  return empty
	List<String> filteredList = list.stream()
			.flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
			.collect(Collectors.toList());
	
	
	//Optional::stream method will return a stream of either one 
	//or zero element if data is present or not.
	List<String> filteredListJava9 = list.stream()
			.flatMap(Optional::stream)
			.collect(Collectors.toList());
	
	System.out.println(filteredList);
	System.out.println(filteredListJava9);
  
	}
}
