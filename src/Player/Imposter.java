package Player;

public class Imposter extends Player
{
    public Imposter(String colorPlayer, String playerName){
        this.kill = true;
        this.task = 0;
        this.alive = true;
        this.playerName = playerName;
        this.colorPlayer = colorPlayer;
    }
}
