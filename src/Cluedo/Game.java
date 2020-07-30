package Cluedo;

import Cluedo.GameBoard.Board;
import Cluedo.Hypothesis.Accusation;
import Cluedo.Hypothesis.Solution;

import java.util.ArrayList;

public class Game {
    private Board board;
    private Solution solution;
    private ArrayList<Player> players;
    private ArrayList<Accusation> unrefutedAccusations;
}
