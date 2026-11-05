import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
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


    System.out.println(System.getProperty("user.dir"));

    ArrayList<Status> roster = new ArrayList<>();

    FileWriter writer = new FileWriter("save.txt");
    for (Status v : nStatus) {
        writer.write(v.toCSV() + "\n"); // one object per line
    }
    writer.close();

    Scanner fileScanner = new Scanner(new File("save.txt"));
    while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        String[] parts = line.split(",");

        String type = parts[0];
        String target = parts[1];
        int duration = Integer.parseInt(parts[2]);
        int damage;
        double tick;

        if (parts.length > 3) {
            damage = Integer.parseInt(parts[3]);
            tick = Double.parseDouble(parts[4]);
        } else {
            damage = 0;
            tick = 0;
        }

        if (type.equals("Fire")){
            roster.add(new Fire(new Enemy(target, 100, 50), duration, damage, tick));
        } else if (type.equals("Poison")) {
            roster.add(new Poison(new Enemy(target, 100, 50), duration, damage, tick));
        } else if (type.equals("Chill")){
            roster.add(new Chill(new Enemy(target, 100, 50), duration));
        }

        System.out.println(roster);
    }
}
