package Player;

public class Crewmate extends Player
{
    public Crewmate(String colorPlayer, String playerName)
    {
        this.kill = false;
        this.task = 7;
        this.colorPlayer = colorPlayer;
        this.alive = true;
        this.playerName = playerName;
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
