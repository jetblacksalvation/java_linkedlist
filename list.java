import java.util.ArrayList;

public class List<type>{
    //data stuff 
    public Node root;


    class Node{
        public type data;
        public Node next;
        Node(type var, Node next_){
            this.data = var;
            this.next = next_;
        }
    }
    public void insert(type data){
    
    }

    public List(ArrayList<type> args){
        if(args.size()!=0){
            root = new Node(args.get(0), null);
            Node temp_pointer = root;
            
            for(int x = 1; x< args.size(); x++){
                
                Node temp = new Node(args.get(x), null);//sorta like python
                //when doing stuff like this, it expects an actual variable, gross. 
                temp_pointer.next = temp;
                temp_pointer = temp_pointer.next;
            }
        }
    }
    public Iterable<type> getElems(){
        ArrayList<type> NodeElements = new ArrayList<type>();
        Node temp = root;
        while(temp != null){
            NodeElements.add(0,temp.data);
            temp = temp.next;
        }
        return NodeElements;

    }
}