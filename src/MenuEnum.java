public enum MenuEnum {
    LIST("1.List All Files"),
    ADD("2.Add File"),
    DELETE("3.Delete"),
    SEARCH("4.Search"),
    CLOSE("5.Close Application");
    MenuEnum(String str) {
        name = str;
    }

    private final String name;

    public String toString() {
        return this.name;
    }
}
