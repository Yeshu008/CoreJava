//package learning_need;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap{
    public static void main(String args[])
    {
        //1  Stream api**
        ArrayList <Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(11);
        List<Integer> ss=ar.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(ss);
        //consider map when to change elements in a list its intermediate and collect is final terminal method

        //Filters***\
        String s="python";
      boolean start=  s.startsWith("p");
      System.out.println(start);
      //2  stream filter**
      //List<Integer> ss=ar.stream().filter(x -> x.startsWith("P")).collect(Collectors.toList());
      //3   Sort**
    //.sorted() intermidatet method
    //4  forEach(x -> {print(x)})

    //reduce**
    //int sum =list.stream.reduce(0,(ans,i)->ans+i); indentity(initial ans) accumulator(var and element) combiner fun(to change)

    }
}