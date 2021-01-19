package ex_6;
import java.util.Scanner;

public class App_6 {
	public static int max (int a, int b) {
		if (a > b) {
			return a;
		} else return b;
	}
	public static int knapsack(int weights[], int costs[], int needed) {
	    int n = weights.length;
	    int dp[][] = new int[needed + 1][n + 1];
	    for (int j = 1; j <= n; j++) {
	        for (int w = 1; w <= needed; w++) {
	            if (weights[j-1] <= w) {
	                dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
	            } else {
	                dp[w][j] = dp[w][j - 1];
	            }
	        }
	    }
	    return dp[needed][n];
	}

	public static void main(String[] args) {
		int N = 0; int i,j; boolean tr = true;
		Scanner in = new Scanner(System.in);
		while (tr) {
			try {
				System.out.print("input N: ");
				N = Integer.parseInt(in.nextLine()); 
				tr = false;
			} catch (Exception ex) {
				System.out.println("does not fit");
				tr = true;
			}
		}
		tr = true;
		int W = 0;
		while (tr) {
			try {
				System.out.print("Neded: ");
				W = Integer.parseInt(in.nextLine()); 
				tr = false;
			} catch (Exception ex) {
				System.out.println("does not fit");
				tr = true;
			}
		}
		tr = true;
		int [] w = new int[N]; int [] v = new int[N];
		for ( i = 0; i < N; i++) {
			while (tr) {
				try {
					System.out.print(i+1+"weight");
					w[i] = Integer.parseInt(in.nextLine());
					System.out.print(" cost ");
					v[i] = Integer.parseInt(in.nextLine());
					tr = false;
				} catch (Exception ex) {
					System.out.println("does not fit");
					tr = true;
				}
				
			}
			tr = true;
		}
		System.out.print("Maximum value: "+knapsack(w, v,  W));
	}
}
