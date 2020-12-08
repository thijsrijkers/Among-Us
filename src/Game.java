import Map.Map;
import Player.Crewmate;
import Player.Imposter;
import Player.Player;

import java.util.ArrayList;

public class Game
{
    private String gameID;
    private Map currentMap;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Game(String gameID, Map currentMap)
    {
        this.gameID = gameID;
        this.currentMap = currentMap;
    }

    public void EnterPlayer(Player player)
    {
        try
        {
            players.add(player);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("=============");
        }
    }

    public String GetPlayerName(Player player)
    {
        System.out.println(player.getName());
        System.out.println("=============");
        return player.getName();
    }

    public void GetPlayersFromList()
    {
        for (Player player : players)
        {
            System.out.println(player.getName());
        }
        System.out.println("=============");
    }

    public String GetNameCurrentMap()
    {
        System.out.println(currentMap.GetNameMap());
        System.out.println("=============");
        return currentMap.GetNameMap();
    }

    public String GetTypeCurrentMap()
    {
        System.out.println(currentMap.GetTypeMap().toString());
        System.out.println("=============");
        return currentMap.GetTypeMap().toString();
    }

    public void CheckPlayerLife(Player player)
    {
        System.out.println(player.isAlive());
        System.out.println("=============");
    }

    public int GetTaskPlayer(Player player)
    {
        System.out.print(player.getTask());
        return player.getTask();
    }
}
