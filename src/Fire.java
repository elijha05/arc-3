public class Fire extends Status implements Status.DamageOverTime {
    private int damage;
    private double tick;

    public Fire(Enemy target, int duration, int damage, double tick){
        super("Fire", duration, target);
        this.damage = damage;
        this.tick = tick;
    }

    @Override
    public double GetSlowFactor() {
        return 1;
    }

    @Override
    public void ApplyStatus() {
        // apply status
    }

    @Override
    public String toString() {
        return "Burn has been applied"+" to "+ target.GetName()+"!";
    }

    @Override
    public String init() {
        return "(Burn) Damaging " + target.GetName() + " -" + damage + " Over "+tick+"s!";
    }
}
