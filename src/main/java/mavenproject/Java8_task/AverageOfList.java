package mavenproject.Java8_task;
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class AverageOfList {
    public static void main(String args[]){
        IntStream listStream=IntStream.range(5,25);
        OptionalDouble optionalDouble=listStream.average();
        if(optionalDouble.isPresent()){
            System.out.println("Average is: "+optionalDouble.getAsDouble());
        }
        else{
            System.out.println("Try again!");
        }
    }

}
