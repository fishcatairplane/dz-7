enum Planet {
    MERCURY(1, 0, 57910000, 2440),
    VENUS(2, 108200000, 108200000 - 57910000, 6052),
    EARTH(3, 149600000, 149600000 - 108200000, 6371),
    MARS(4, 227900000, 227900000 - 149600000, 3389),
    JUPITER(5, 778500000, 778500000 - 227900000, 69911),
    SATURN(6, 1433000000, 1433000000 - 778500000, 58232),
    URANUS(7, 2877000000L, 2877000000L - 1433000000, 25362),
    NEPTUNE(8, 4503000000L, 4503000000L - 2877000000L, 24622);

    private final int orderFromSun;
    private final long distanceFromSun;
    private final long distanceFromPreviousPlanet;
    private final int radius;
    private Planet previousPlanet;
    private Planet nextPlanet;

    private Planet(int orderFromSun, long distanceFromSun, long distanceFromPreviousPlanet, int radius) {
        this.orderFromSun = orderFromSun;
        this.distanceFromSun = distanceFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
    }

    static {
        Planet[] planets = Planet.values();
        for (int i = 0; i < planets.length; i++) {
            int previousIndex = i - 1;
            int nextIndex = i + 1;

            if (previousIndex < 0) {
                previousIndex = planets.length - 1;
            }

            if (nextIndex >= planets.length) {
                nextIndex = 0;
            }

            planets[i].previousPlanet = planets[previousIndex];
            planets[i].nextPlanet = planets[nextIndex];
        }
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public Planet getPreviousPlanet() {
        return previousPlanet;
    }

    public Planet getNextPlanet() {
        return nextPlanet;
    }
}