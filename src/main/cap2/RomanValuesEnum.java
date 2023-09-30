package main.cap2;

public enum RomanValuesEnum {

    I(1),

    V(5),

    X(10),

    L(50),

    C(100),

    D(500),

    M(1000);

    public final int integerValue;

    RomanValuesEnum(int intergerValue) {
        this.integerValue = intergerValue;
    }

    public int getIntergerValue() {
        return this.integerValue;
    }
}
