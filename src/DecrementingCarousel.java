import java.util.Stack;

public class DecrementingCarousel {
    final Stack<Integer> carousel = new Stack<>();
    final int capacity;
    boolean runCheck = true;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
    }

    public boolean addElement(int element){
        boolean flag = true;
        if (element <= 0 || this.carousel.size() == this.capacity || !this.runCheck)
            flag = false;
        else this.carousel.addElement(element);
        return flag;
    }

    public CarouselRun run(){
        CarouselRun run = null;
        if(this.runCheck){
            run = new CarouselRun(this.carousel);
            this.runCheck = false;
        }
        return run;
    }
}
