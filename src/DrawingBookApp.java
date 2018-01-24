// My solution to the HackerRank problem "Drawing Book."
// https://www.hackerrank.com/challenges/drawing-book/problem

import java.util.Scanner;

public class DrawingBookApp {
	static int solve(int n, int p) {
		// Complete this function
		int countFront = 0;
		int countBack = 0;
		//check to see if # of pages is even
		if(n % 2 == 0){
			for (int i = 0; i <= n; i+=2) {
				if (p == i || p == (i + 1)) {
					break;
				} else {
					countFront++;
				}
			}
			for(int j = n; j >= 0; j-=2) {
				if (p == j || p == (j + 1)) {
					break;
				} else {
					countBack++;
				}
			}
		//if # of pages is odd	
		} else {
			for (int i = 1; i <= n; i+=2) {
				if (p == i || p == (i - 1)) {
					break;
				} else {
					countFront++;
				}
			}
			for(int j = n; j >= 1; j-=2) {
				if (p == j || p == (j - 1)) {
					break;
				} else {
					countBack++;
				}
			}
		}

		int count = Math.min(countFront, countBack);
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of pages of the book, n (integer 1 - 100000): ");
		int n = in.nextInt();
		System.out.print("Enter the page number to turn to (integer 1 - n): ");
		int p = in.nextInt();
		int result = solve(n, p);
		System.out.println(result);
		in.close();
	}
}
