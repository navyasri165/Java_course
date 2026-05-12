class AdvanceSwitch {
    public static void main(String[] args) {

        String day = "saturday";   // String must be capitalized, value in quotes
        String result = "";

        result = switch (day) {
            case "sunday", "saturday" -> "6am";   // concise arrow syntax
            case "monday" -> "9am";
            default -> "7am";
        };

        System.out.println(result);  // print the result
    }
}