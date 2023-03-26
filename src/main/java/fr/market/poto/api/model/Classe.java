package fr.market.poto.api.model;

public enum Classe {
    SIX("6 ème"),
    CINQUIEME("5 ème"),
    QUATRIEME("4 ème"),
    TROISIEME("3 ème"),
    SECONDE("2 nde"),
    PREMIERE("1ere"),
    TERMINALE("Tle");

    private String label;

    Classe(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
