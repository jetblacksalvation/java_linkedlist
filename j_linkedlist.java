import java.util.ArrayList;

class j_linkedlist{
    
    
    static List<Integer>  linkedlist;



    public static void main(String[] args) {
        ArrayList<Integer> arguements = new ArrayList<Integer>();

        arguements.add(10);
        arguements.add(50);
        linkedlist = new List<Integer>(arguements);
 
        for( var x : linkedlist.getElems()){
            System.out.println(x + "is the value");
        }
    }
}