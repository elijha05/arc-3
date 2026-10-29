//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Enemy normal = new Enemy("Normal", 100, 5);
    Status fire = new Fire(normal,7, 3, 1);
    Status chill = new Chill(normal,4);
    Status poison = new Poison(normal,20, 1, 3);

    normal.AddStatus(fire);
    normal.AddStatus(chill);
    normal.AddStatus(poison);

    ArrayList<Status> nStatus = normal.GetStatuses();

    for(Status status : nStatus){
        System.out.println(status.toString());

        if (status instanceof Status.DamageOverTime){
            System.out.println(((Status.DamageOverTime) status).init());
        }
    }

    System.out.println(fire.toString());
    System.out.println(poison.GetName());
    System.out.println(chill.GetSlowFactor());




}
