package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2)
	{
		Pokemon winner = null;
		int rnum=(int)(Math.random()*10);
		if (rnum%2 == 1)
		{
			winner = p1;
			
		}
		else
		{
			winner = p2;
		}
		System.out.print("winner is="+winner);
		winner.setCp(winner.getCp()+500);
		
	}

}
