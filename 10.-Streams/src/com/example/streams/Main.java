
package com.example.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    final Collection< Task > tasks = Arrays.asList(
        new Task( Status.OPEN, 5 ),
        new Task( Status.OPEN, 13 ),
        new Task( Status.CLOSED, 8 )
        );

    //Calculate total points of all active tasks using sum()
    final long totalPointsOfOpenTasks = tasks
        .stream()
        .filter( task -> task.getStatus() == Status.OPEN )
        .mapToInt( Task::getPoints )
        .sum();
    System.out.println( "Total points: " + totalPointsOfOpenTasks );

    // Calculate total points of all tasks
    final double totalPoints = tasks
        .stream()
        .parallel()
        .map( task -> task.getPoints() ) // or map( Task::getPoints )
        .reduce( 0, Integer::sum );
    System.out.println( "Total points (all tasks): " + totalPoints );
    
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    List<String> filtered1 = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

  }
}