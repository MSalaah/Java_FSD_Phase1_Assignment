public enum MenuEnum {
    LIST("1.List All Files"),
    ADD("2.User Interface Options"),
    CLOSE("3.Close Application");
    MenuEnum(String str) {
        name = str;
    }

    private final String name;

    public String toString() {
        return this.name;
    }
}
