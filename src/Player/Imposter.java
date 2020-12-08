package Player;

public class Imposter extends Player
{
    public Imposter(String colorPlayer, String playerName){
        this.kill = true;
        this.task = 0;
        this.colorPlayer = colorPlayer;
        this.alive = true;
        this.playerName = playerName;
    }
}
