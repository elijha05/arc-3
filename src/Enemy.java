import java.util.ArrayList;

public class Enemy {
    private String name;
    private int health;
    private int speed;

    ArrayList<Status> currentStatus = new ArrayList<>();

    Enemy(String name, int health, int speed){
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    public void AddStatus(Status status){
        currentStatus.add(status);
    }

    public ArrayList<Status> GetStatuses(){
        return currentStatus;
    }

    public String GetName(){
        return name;
    }
}
