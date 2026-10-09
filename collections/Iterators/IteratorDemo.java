import java.util.*;
class IteratorDemo{
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("list is empty "+ list.isEmpty());
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(6,500);
        System.out.println(list);
        System.out.println("contains "+list.contains(30));
        System.out.println("list is empty "+ list.isEmpty());
        for( int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.set(4,50));
        System.out.println(list.remove(3));
        for(Integer value:list){
            System.out.println(value);
        }
    }
}


 // System.out.println("using iterator");
  
        // Iterator<Integer> it = list.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // System.out.println("using ListIterator");
  
        // ListIterator<Integer> listIt = list.listIterator();
        // while(listIt.hasNext()){
        //     System.out.println(listIt.next());
        // }
        // while(listIt.hasPrevious()){
        //     System.out.println(listIt.previous());
        // }