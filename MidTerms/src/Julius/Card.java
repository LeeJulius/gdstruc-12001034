package Julius;

import java.util.Objects;

public class Card {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

