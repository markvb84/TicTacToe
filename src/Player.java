abstract class Player {
    private String playerName;
    private String playerIcon;
    private int playerScore;

    Player(String name, String icon){
        this.playerName = name;
        this.playerIcon = icon;
    }

    abstract void turnPlayer(Grid grid, Player player);

    public String getName(){
        return this.playerName;
    }

    public String getPlayerIcon(){
        return this.playerIcon;
    }

    public void increaseScore(){
        this.playerScore++;
    }

    public int getScore(){
        return this.playerScore;
    }
}
