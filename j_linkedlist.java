import java.util.ArrayList;

class j_linkedlist{
    
    
    static list<Integer>  linkedlist  ;



    public static void main(String[] args) {
        ArrayList<Integer> arguements = new ArrayList<Integer>();
        arguements.add(10);
        arguements.add(50);

        linkedlist = new list<Integer>(arguements);
        list<Integer>.Node temp_ptr = linkedlist.root;
        while(temp_ptr != null){
            System.out.println("my data is "+temp_ptr.data);
            System.out.println("my class data is "+temp_ptr);

            temp_ptr = temp_ptr.next;
        }   
    }
}