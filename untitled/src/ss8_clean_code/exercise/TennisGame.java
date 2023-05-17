package ss8_clean_code.exercise;

public class TennisGame {
    /**
     *
     * @param namePlayerA
     * @param namePlayerB
     * @param scorePlayerA
     * @param scorePlayerB
     * @return
     */
    public static String getScore(String namePlayerA, String namePlayerB, int scorePlayerA, int scorePlayerB) {
        String score = "";
        if (scorePlayerA == scorePlayerB) {
            score = getEqual(scorePlayerA);
        } else if (scorePlayerA >= 4 || scorePlayerB >= 4) {
            score = getAdvantege(namePlayerA, namePlayerB, scorePlayerA, scorePlayerB);
        } else {
            score = getScoreResults(scorePlayerA, scorePlayerB, score);
        }
        return score;
    }


    private static String getScoreResults(int scorePlayerA, int scorePlayerB, String score) {
        int callingScore;
        for (int i = 1; i < 3; i++) {
            callingScore = scorePlayerA;
            if (i != 1) {
                score += "-";
                callingScore = scorePlayerB;
            }
            switch (callingScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


    private static String getAdvantege(String namePlayerA, String namePlayerB, int scorePlayerA, int scorePlayerB) {
        String score;
        int result = scorePlayerA - scorePlayerB;
        if (result == 1) score = "Advantage " + namePlayerA;
        else if (result == -1) score = "Advantage " + namePlayerB;
        else if (result >= 2) score = "Win for " + namePlayerA;
        else score = "Win for " + namePlayerB;
        return score;
    }


    private static String getEqual(int numberScore) {
        String score;
        switch (numberScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}
