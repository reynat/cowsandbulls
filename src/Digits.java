public class Digits implements Code {

    public final int key;

    public Digits(int newKey) {
        this.key = newKey;
    }

    @Override
    public boolean equals(Object object) {
        Digits otherCode = (Digits) object;
        return (this.key == otherCode.key);
    }

}