import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Intersection {



    public static void main(String args[]){
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        boolean intersect = false;

        //example where lists do not intersect
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    intersect = true;
                    break;
                }
            }
        }

        System.out.println("Testing non-intersecting linked lists... intersect = " + intersect);

        //now add an intersection
        list2.add(3);
        intersect = false;
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    intersect = true;
                    break;
                }
            }
        }
        System.out.println("Testing intersecting linked lists... intersect = " + intersect);

        //now testing example where value is the same but no intersection

        list2 = new ArrayList<Integer>();
        Integer myInt = new Integer(1);
        list2.add(myInt);
        myInt = new Integer(2);
        list2.add(myInt);
        myInt = new Integer(3);
        list2.add(myInt);
        intersect = false;
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i) == list2.get(j)){
                    intersect = true;
                    break;
                }
            }
        }
        System.out.println("Testing non-intersecting linked list with same values... intersect = " + intersect);

    }
}
