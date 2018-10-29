package praticasAgeis;

public class Rank {

private int value;
private String rank;

public Rank() {
}

public Rank(int value, String rank) {
    this.value = value;
    this.rank = rank;
}

public int getValue() {
    return value;
}

public void setValue(int value) {
    this.value = value;
}

public String getRank() {
    return rank;
}

public void setRank(String rank) {
    this.rank = rank;
}

@Override
public String toString() {
    String stg = "";
    stg += this.rank + "(" + this.value + ")";
    return stg;
}
}
