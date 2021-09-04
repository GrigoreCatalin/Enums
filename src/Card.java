public class Card {
    private Rank myRank;
    private Suit mySuit;

    Card(Rank myRank, Suit mySuit) {
        this.myRank = myRank;
        this.mySuit = mySuit;
    }

    public Rank getMyRank(){
        return this.myRank;
    }

    public Suit getMySuit(){
        return this.mySuit;
    }

}
