import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerIndices = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            Integer index = playerIndices.get(callings[i]);
            if (index != null && index != 0) {
                String tmp = players[index - 1];
                players[index - 1] = players[index];
                players[index] = tmp;
                playerIndices.put(players[index], index);
                playerIndices.put(players[index - 1], index - 1);
            }
        }

        return players;
    }
}
