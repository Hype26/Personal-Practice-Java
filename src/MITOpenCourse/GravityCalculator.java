package MITOpenCourse;

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        /* Computing
        x(t) = 0.5 × at^2 + v(i)t + x(i)
        a Acceleration (m/s^2) -9.81
        t Time (s) 10
        v(i) Initial velocity (m/s) 0
        x(i) Initial position 0
         */


        finalPosition = 0.5 * (gravity * fallingTime * fallingTime) +
                (initialVelocity * fallingTime) +
                initialPosition;

        String formattedFinalPosition = String.format("%.2f", finalPosition);

        System.out.print("The object's position after " + fallingTime +
                " seconds is " + formattedFinalPosition + " m.");
    }
}