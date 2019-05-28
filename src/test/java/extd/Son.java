package extd;

public class Son extends Father {
    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Son [game=");
        builder.append(game);
        builder.append("]");
        return builder.toString();
    }

}
