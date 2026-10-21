public abstract class Status {
    protected Enemy target;
    protected String name;
    protected int duration;

    public Status(String name, int duration, Enemy target){
        this.name = name;
        this.duration = duration;
        this.target = target;
    }



    public abstract double GetSlowFactor();
    public abstract void ApplyStatus();
    public abstract String toString();

    public String GetName(){
        return name;
    }
}
