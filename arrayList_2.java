import java.util.*;
class arrayList_2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        // Multi Dimentional Linked List
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<4;i++){
            list.add(new ArrayList<>());
        }
        for (int i=0;i<4;i++){
            for(int j =0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}