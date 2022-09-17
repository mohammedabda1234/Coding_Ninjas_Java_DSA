package Test2DSA;

public class Dequeue {
    private	int[] deq;
    private  int front;
    private int rear;
    private  int si;

    Dequeue(int size){
        deq=new int[size];
        si=size;
        front=-1;
        rear=-1;
    }
    public void insertFront(int ele){

        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deq[front]=ele;
            return;
        }
        if((front+1)%si==rear){
            System.out.println("-1");
            return;
        }
        front=(front+1)%si;
        deq[front]=ele;

    }

    public void insertRear(int ele){
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            deq[rear]=ele;
            return;
        }
        if(front==rear-1 || rear==0 && front==si-1){
            System.out.println("-1");
            return;
        }
        if(rear==0)
            rear=si-1;
        else
            rear--;
        deq[rear]=ele;

    }
    public void deleteFront(){
        if(front==-1 && rear==-1){
            System.out.println("-1");
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        if(front==0)
            front=si-1;
        else
            front--;
    }

    public void deleteRear(){
        if(front==-1 && rear==-1){
            System.out.println("-1");
            return;
        }
        if(rear==front){
            rear=-1;
            front=-1;
            return;
        }
        rear=(rear+1)%si;
    }

    public int getFront(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return deq[front];
    }
    public int getRear(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return deq[rear];
    }
}
