public class StackLinkedList<T> implements Stack<T>{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop()throws MyEmptyStackException {
        if(top==null){

            throw new MyEmptyStackException("stack is empty");
        }

        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
    public void displayStack(){

        if(this.top==null){
            System.out.println("empty");
        }
        else{
            StackItem<T>tempNode=top;
            while(tempNode !=null){
                System.out.println(tempNode.getData());
                tempNode=tempNode.getNext();
                tempNode.setNext(tempNode.getNext());
            }

        }
    }

}
