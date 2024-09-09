package Accenture;

// Alice has to climb N stairs to reach top. In each step Alice can climb
// either 1 step or M steps.Find minimum number of steps to reach the top

public class minimumJumps {
    public static void main(String[] args) {
        int N=5,M=3;

      // Greedy Algorithm:
        int steps=N/M + N%M;

        System.out.println("Number of Jumps are: "+steps);

    }
}
