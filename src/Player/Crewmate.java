package Player;

public class Crewmate extends Player
{
    public Crewmate(String colorPlayer, String playerName)
    {
        this.kill = false;
        this.task = 7;
        this.alive = true;
        this.playerName = playerName;
        this.colorPlayer = colorPlayer;
    }

    public void doTask(int task)
    {
        task--;
    }

    public void die(boolean alive)
    {
        this.alive = false;
    }
}
