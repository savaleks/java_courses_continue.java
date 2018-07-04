package lesson16.testoUzduotys;
//sukurti metoda getCode(), kuris grazina enumo reiksmes mazosiomis raidemis.
public enum OSType {
    IOS,
    ANDROID,
    SYMBIAN;

    public String getCode() {
        return getCode().toLowerCase();
    }
}
