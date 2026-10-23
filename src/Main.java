//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Enemy normal = new Enemy("Normal", 100, 5);

    normal.AddStatus(new Fire(normal,7, 3, 1));
    normal.AddStatus(new Chill(normal,4));
    normal.AddStatus(new Poison(normal,20, 1, 3));

    ArrayList<Status> nStatus = normal.GetStatuses();

    for(Status status : nStatus){
        System.out.println(status.toString());

        if (status instanceof Status.DamageOverTime){
            System.out.println(((Status.DamageOverTime) status).init());
        }
    }




}
