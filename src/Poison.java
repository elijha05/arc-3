public class Poison extends Status implements Status.DamageOverTime {
    private int damage;
    private double tick;

    public Poison(Enemy target,int duration, int damage, double tick){
        super("Fire", duration, target);
        this.damage = damage;
        this.tick = tick;
    }

    @Override
    public double GetSlowFactor() {
        return 0.7;
    }

    @Override
    public void ApplyStatus() {
        // apply status
    }

    @Override
    public String toString() {
        return "Poison has been applied"+" to "+ target.GetName()+"!";
    }

    @Override
    public String init(){
        return "(Poison) Damaging " + target.GetName() + " Over "+tick+"s!";
    }
}