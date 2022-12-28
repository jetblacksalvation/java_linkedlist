import java.util.ArrayList;

class j_linkedlist{
    
    
    static List<Integer>  linkedlist;



    public static void main(String[] args) {
        ArrayList<Integer> arguements = new ArrayList<Integer>();

        arguements.add(10);
        arguements.add(50);
        linkedlist = new List<Integer>(arguements);
        // List<Integer>.Node temp_ptr = linkedlist.root;
        // while(temp_ptr != null){
        //     System.out.println("my data is "+temp_ptr.data);
        //     System.out.println("my class data is "+temp_ptr);

        //     temp_ptr = temp_ptr.next;
        // }   
        ////for some reason it's printing out in reverse?
        for( var x : linkedlist.getElems()){
            System.out.println(x + "is the value");
        }
    }
}