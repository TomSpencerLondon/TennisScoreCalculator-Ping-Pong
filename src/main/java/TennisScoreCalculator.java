public class TennisScoreCalculator {

    public String score(int player1Points, int player2Points) {
        String player1Result = "love";
        String player2Result = "love";

        if(player1Points == 1){
            player1Result = "fifteen";
        }
        if(player2Points == 1){
            player2Result = "fifteen";
        }
        if(player1Points == 2){
            player1Result = "thirty";
        }
        if(player2Points == 2){
            player2Result = "thirty";
        }
        if(player2Points == 4){
            player2Result = "forty";
        }
        if(player1Points == 4){
            player1Result = "forty";
        }
        if(player1Points >= 2 && player1Points == player2Points){
            return "deuce";
        }
        if((player1Points > player2Points) && (player2Points > 2)){
            return "advantagePlayer1";
        }

        if((player2Points > player1Points) && (player1Points > 2)){
            return "advantagePlayer2";
        }

        return player1Result + ":" + player2Result;
    }
}
