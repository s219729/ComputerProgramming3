public class Counter {
    private int counter = 0;

    public void increase(){
        this.counter += 1;
    }

    public void decrease(){
        this.counter -= 1;
    }

    public void increase(int n){
        this.counter = this.counter + n;
    }
    public void decrease(int n){
        this.counter = this.counter - n;
    }

    public int value(){
        return this.counter;
    }

}
