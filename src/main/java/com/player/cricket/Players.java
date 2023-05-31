package com.player.cricket;

import jakarta.persistence.*;
// addming the table details
@Entity
@Table(name="players")
public class Players {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Column(name="player_name")
   private String name;
    @Column(name="matches")
   private int matches;
    @Column(name="runs")
    private int runs;

    public Players(String name, int matches, int runs) {
        this.name = name;
        this.matches = matches;
        this.runs = runs;
    }

    public Players() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "players{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", matches=" + matches +
                ", runs=" + runs +
                '}';
    }
}
