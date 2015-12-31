public class Queue {
    static final int max = 10;
    int[] arrayQueue = new int[max];
    int top, bottom, dequeued;

    void initialize(){
        top = 0;
        bottom = 0;
    }

    void enqueue(int num){
        if(top < max){
            arrayQueue[top++] = num;
        }
        else {
            System.out.println("Kuruk dolu!");
        }
    }

    int dequeue(){
        dequeued = arrayQueue[bottom];
        adjustQueue();
        top--;
        return dequeued;
    }

    void adjustQueue(){
        for(int i = 0; i < max; i++){
            arrayQueue[i] = arrayQueue[i + 1];
        }
    }

    void isEmpty(){
        if(top == 0){
            System.out.println("Kuyruk dolu!");
        }
        else
            System.out.println("Kuyruk uygun.");
    }

    void printQueue(){
        if(top != 0){
                for(int i = 0; i < top; i++){
                System.out.println(i+1 + ". eleman: " + arrayQueue[i]);
            }
        }
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(234);
        queue.enqueue(6);
        queue.enqueue(56);
        queue.enqueue(49);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
    }


}
