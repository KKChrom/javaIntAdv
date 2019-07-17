package array;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	public static String[][] board;
	public int count;

	public static void main(String[] args) {
		tictactoe t = new tictactoe();
		t.printBoard();
		Scanner scan = new Scanner(System.in);
		System.out.println("What row?");
		int r = scan.nextInt();
		System.out.println("What col?");
		int c = scan.nextInt();
		while(t.makeMove(r-1, c-1))
		{
			t.printBoard();
			System.out.println("What row?");
			r = scan.nextInt();
			System.out.println("What col?");
			 c = scan.nextInt();
			if(t.checkWin(board))
			{
				System.out.println("Game over");
			}
		}
	}

	public tictactoe() {
		board = new String[3][3];
		count = 2;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ".";
			}
		}
	}

	public boolean makeMove(int r, int c) {
		if (r >= 0 && r < 3 && c >= 0 && c < 3) {
		
			
				if (count % 2 == 1) {
					board[r][c] = ("X");
				} else {
					board[r][c] = ("O");
				}
				if (board[r][c].equals("")) {
					return false;
		}
	
		
	}
		count++;
		return true;
	}
	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+ " ");
			}
			System.out.println();
			}
		}
	public boolean checkWin(String[][] s)
	{
		if(s[1][0].equals(s[0][0]) && s[1][0].equals(s[2][0]))
		{
			return true;
		}
		else if(s[1][1].equals(s[0][1]) && s[1][1].equals(s[2][1]))
		{
			return true;
		}
		else if(s[1][2].equals(s[0][2]) && s[1][0].equals(s[2][2]))
		{
			return true;
		}
		if(s[0][0].equals(s[0][1]) && s[0][0].equals(s[0][2]))
		{
			return true;
		}
		else if(s[1][0].equals(s[1][1]) && s[0][1].equals(s[1][2]))
		{
			return true;
		}
		else if(s[2][0].equals(s[2][1]) && s[1][0].equals(s[2][2]))
		{
			return true;
		}
		else if(s[0][0].equals(s[1][1]) && s[0][0].equals(s[2][2]))
		{
			return true;
		}
		else if(s[0][2].equals(s[1][1]) && s[0][0].equals(s[2][0]))
		{
			return true;
		}
		else
		{
		return false;
		
		}
	}
		
	}
	


