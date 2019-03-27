package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE, BOB;

    String catchPhrase;

    AliceBobEnum() {
        catchPhrase = "Hey, my name is " + this.name() + "!";
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public boolean isAlice() {
        return this == ALICE;
    }

    public boolean isBob() {
        return this == BOB;
    }
}
