import java.util.Stack;

public class CarouselRun {
    private final Stack<Integer> carousel;
    private int curr = 0;
    private int c = 0;
    private boolean flag = false;
    private int actionLimit;
    public CarouselRun (Stack<Integer> carousel) {
        this.carousel = carousel;
    }
    public CarouselRun (Stack<Integer> carousel, int actionLimit) {
        this.carousel = carousel;
        this.actionLimit = actionLimit;
        this.flag = true;
    }
    public int next() {
        int next;
        int size = this.carousel.size();
        if (this.carousel.isEmpty()) next = -1;

        else {
            if (this.curr == size) this.curr = 0;

            next = this.carousel.get(this.curr);
            this.carousel.set(this.curr, next - 1);

            if(this.carousel.get(this.curr) <= 0) this.carousel.remove(this.curr);
            else curr++;

            c++;
            if (this.c == this.actionLimit && flag) this.carousel.clear();
        }
        return next;
    }

    public boolean isFinished() {
        return this.carousel.isEmpty();
    }

}
