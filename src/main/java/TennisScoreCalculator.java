import java.util.HashMap;

public class TennisScoreCalculator {
    HashMap<Integer, String> score;

    public TennisScoreCalculator() {
        this.score = new HashMap<Integer, String>();
        score.put(0, "love");
        score.put(1, "fifteen");
        score.put(2, "thirty");
        score.put(3, "forty");
    }

    public String score(int player1Points, int player2Points) {
        String player1Result = "love";
        String player2Result = "love";

        if(player1Points >= 2 && player1Points == player2Points){
            return "deuce";
        }
        if((player1Points > player2Points) && (player2Points > 2)){
            return "advantagePlayer1";
        }
        if((player2Points > player1Points) && (player1Points > 2)){
            return "advantagePlayer2";
        }

        player1Result = convertScore(player1Points);
        player2Result = convertScore(player2Points);


        return player1Result + ":" + player2Result;
    }

    private String convertScore(int points){
        return score.get(points);
    }
}
