package MITOpenCourse;

public class Marathon {
    public static void main (String[] arguments) {
        int lowestTime = 5_000;
        int nameIndex = 0;

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            if (times[i] < lowestTime) {
                lowestTime = times[i];
                nameIndex = i;
            }
            //System.out.println(names[i] + ": " + times[i]);
        }
        System.out.printf("Fastest time was %ss  by %s", lowestTime, names[nameIndex] );
    }
}