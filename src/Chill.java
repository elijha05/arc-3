public class Chill extends Status {

    public Chill(Enemy target, int duration){
        super("Chill", duration, target);
    }

    @Override
    public double GetSlowFactor() {
        return 0.5;
    }

    @Override
    public void ApplyStatus() {
        // apply status
    }

    @Override
    public String toString() {
        return "Chill has been applied"+" to "+ target.GetName()+"!";
    }
}
