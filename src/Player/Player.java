package Player;

public abstract class Player
{
    public String colorPlayer;
    public Boolean kill;
    public int task;
    public boolean alive;
    public String playerName;

    public Player()
    {
    }


    public String getColorPlayer()
    {
        return colorPlayer;
    }

    public Boolean getKill()
    {
        return kill;
    }

    public int getTask()
    {
        return task;
    }

    public void setColorPlayer(String colorPlayer)
    {
        this.colorPlayer = colorPlayer;
    }

    public void setKill(Boolean kill)
    {
        this.kill = kill;
    }

    public void setTask(int task)
    {
        this.task = task;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
}
