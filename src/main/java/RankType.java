public enum RankType {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ACE(1),
    JACK(10),
    QUEEN(11),
    KING(12);

    private final int value;

    RankType(int value){
        this.value = value;
    }


    public int getValue(){
        return this.value;
    }


}
