package OOP3;
public class Pair<T,S> {
    private  T first;
    private S second;
    public Pair(T first,S second){
       this.first = first;
       this.second = second;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public T getFirst() {
        return first;
    }
    public void setSecond(S second) {
        this.second = second;
    }
    public S getSecond() {
        return second;
    }
}
