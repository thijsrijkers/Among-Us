import Map.Map;
import Map.Mira;
import Player.Crewmate;
import Player.Imposter;
import Player.Player;

public class main
{
        public static void main(String[] args) {
                Player player = new Crewmate("yellow", "Tom");
                Player player2 = new Imposter("red", "Tim");
                Player player3 = new Crewmate("blue", "Sylvan");
                Map map = new Mira();
                Game gameTest = new Game("69", map);

                gameTest.EnterPlayer(player);
                gameTest.EnterPlayer(player2);
                gameTest.EnterPlayer(player3);

                gameTest.GetPlayerName(player3);
                gameTest.GetNameCurrentMap();
                gameTest.GetTaskPlayer(player);
                gameTest.GetTypeCurrentMap();

                gameTest.CheckPlayerLife(player3);
                gameTest.GetPlayersFromList();
        }
}
