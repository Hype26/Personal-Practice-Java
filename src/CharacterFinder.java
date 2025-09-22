public class CharacterFinder {
    public static void main(String[] args) {

        String country = "United State of AmErica";
        int howMany = 1;

        for ( int locationAt = 0; locationAt < country.length(); locationAt++) {

            if (country.charAt(locationAt) == 'e' || country.charAt(locationAt) == 'E') {

                System.out.println("\n" + country.charAt(locationAt) + " : " + howMany );
                System.out.println("Location of e: " + (locationAt + 1));

                howMany++;
            }

        }
    }
}
