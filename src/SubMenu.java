public enum SubMenu {
    ADD("1.Add File"),
    DELETE("2.Delete File"),
    SEARCH("3.Search"),
    BACK("4.Back");

    SubMenu(String str) {
        name = str;
    }

    private final String name;

    public String toString() {
        return this.name;
    }
}
