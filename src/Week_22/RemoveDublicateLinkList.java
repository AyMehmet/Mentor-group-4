package Week_22;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addAll(Arrays.asList(1));
        System.out.println(removeDublicateValuewithForeach(list));
  //    System.out.println(removeDublicateValuewithStream(list));

    }

    public static LinkedList<Integer> removeDublicateValuewithForeach(LinkedList<Integer> list){
        for (int i=0 ; i< list.size();i++)  {
           if (list.subList(i+1, list.size()).contains(list.get(i))){
               list.remove(i);
               i=i-1;
               //if (i!=0) i=-i;
           }
        }
        return list;
    }


    public static LinkedList<Integer> removeDublicateValuewithStream(LinkedList<Integer> list){
        return new LinkedList<>(list.stream().sorted().distinct().collect(Collectors.toList()));
    }

}
