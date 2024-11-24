import java.util.*;
class arrayList_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List= new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            List.add(sc.nextInt());
        }
        
    
        ArrayList<String> list= new ArrayList<String>();
        list.add("God");
        System.out.println(list);
        System.out.println(List);
        System.out.println(List.contains(34));
    }
}