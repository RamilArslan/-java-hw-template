package hw06;

public enum DayOfWeek {
    SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday");

    private final String value;

    DayOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "value='" + value + '\'' +
                '}';
    }
}
