class Car {
    int pos;
    double targettym;

    Car(int pos, double targettym) {
        this.pos = pos;
        this.targettym = targettym;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        Car cars[] = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i],
                (target - position[i]) * 1.0 / speed[i]);
        }

        Arrays.sort(cars, new Comparator<Car>() {//compare fn
            public int compare(Car a, Car b) {
                return a.pos - b.pos;
            }
        });

        if (n == 0)
            return 0;

        int ans = 0;

        for (int i = n - 1; i >= 1; i--) {//i=1 becoz we should not start with 0
            if (cars[i].targettym >=cars[i - 1].targettym) {
                cars[i - 1] = cars[i];
            } else {
                ans++;
            }
        }

        return ans + 1;
    }
}
