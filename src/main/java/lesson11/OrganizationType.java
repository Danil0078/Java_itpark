package lesson11;

public enum OrganizationType {
    OOO(100), ZAO(200), OAO(300);

    private final int number;

    OrganizationType(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

