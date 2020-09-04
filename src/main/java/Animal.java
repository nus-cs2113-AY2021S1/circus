public abstract class Animal implements Asset{
    private int value = 10;
    public abstract String speak();
    @Override
    public int getValue(){
        return value;
    }
}
