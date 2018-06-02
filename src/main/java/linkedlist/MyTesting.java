package linkedlist;

import java.util.LinkedList;

public class MyTesting {

    public static void main(String[] args){

        LinkedList<String> movies=new LinkedList<String>();

        movies.add("Batman");
        movies.add("Superman");
        movies.add("Spider man");
        movies.add("Iron man");
        movies.add("Hulk");

        System.out.println(movies);
        //adding elements at the beginning of the list
        movies.offer("Dead Pool");
        movies.addFirst("Avengers");
        movies.offerFirst("sdfs");
        System.out.println(movies);
       // movies.offerFirst("sdf");



    }
}
