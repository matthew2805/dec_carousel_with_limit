public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    private final int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }
    @Override
    public CarouselRun run(){
        CarouselRun run = null;
        if(this.runCheck){
            run = new CarouselRun(this.carousel, actionLimit);
            this.runCheck = false;
        }
        return run;
    }
}
