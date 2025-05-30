
public class Main {
    public static void main(String[] args) {

        StackLinkedList<Object> stack=new StackLinkedList<>();
       stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push("hello ");
        stack.displayStack();


        /*

    ArrayList<String>stringList=new ArrayList<>();
    stringList.add("String");
    stringList.add("Ali");
        System.out.println(stringList);

    HashMap<String,Double>grades=new HashMap<>();
    grades.put("Ali",18.0);
    grades.put("Pelin",75.4);
    grades.put("Koray",4.5);
        System.out.println(grades);
    grades.put("ali",100.0);
        System.out.println(grades);
*/


    }
}