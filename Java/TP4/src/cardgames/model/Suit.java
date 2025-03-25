package cardgames.model;

public enum Suit {
    CLUBS("♣"), DIAMONDS("♦"), HEARTS("♥"), SPADE("♠");

    private String code;
    private Suit(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
