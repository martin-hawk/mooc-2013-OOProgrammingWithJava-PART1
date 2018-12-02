
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Martynas Vanagas
 */
public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        if (this.size() == 0) {
            this.maxSize = 16;
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (this.size() + 1 <= maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int goals = 0;
        for (Player player : this.players) {
            goals += player.goals();
        }
        return goals;
    }
}
