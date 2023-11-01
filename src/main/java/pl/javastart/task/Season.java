package pl.javastart.task;

public enum Season {
    SPRING(new String[]{"marzec", "kwiecień", "maj"}, "Wiosna"),
    SUMMER(new String[]{"czerwiec", "lipiec", "sierpień"}, "Lato"),
    AUTUMN(new String[]{"wrzesień", "październik", "listopad"}, "Jesień"),
    WINTER(new String[]{"grudzień", "styczeń", "luty"}, "Zima");

    private final String [] months;
    private final String translation;

    Season(String[] months, String translation) {
        this.months = months;
        this.translation = translation;
    }

    public String[] getMonths() {
        return months;
    }

    public String getTranslation() {
        return translation;
    }

    public static Season findSeason(String input) {
        for (Season season : Season.values()) {
            if (season.translation.equalsIgnoreCase(input)) {
                return season;
            }
        }
        return null;
    }
}