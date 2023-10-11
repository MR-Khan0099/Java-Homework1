package Homework1;

public class MathCalc {
	public static void main(String[] args) {
		
        // Constants for the diameters of the Earth and the Sun in miles
        double diameterEarth = 7600.0;
        double diameterSun = 865000.0;

        // Calculate the radii of the Earth and the Sun
        double radiusEarth = diameterEarth / 2.0;
        double radiusSun = diameterSun / 2.0;

        // Calculate the volume of the Earth
        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);

        // Calculate the volume of the Sun
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);

        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double ratio = volumeSun / volumeEarth;

        // Output the results
        System.out.println("The volume of the Earth is " + volumeEarth + " cubic miles.");
        System.out.println("The volume of the Sun is " + volumeSun + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + ratio);
    }
}

