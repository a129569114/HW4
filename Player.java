package H$;
import java.util.ArrayList;

public class Player {

	
		private int chips;
		private String name;
		private int bet;
		private ArrayList<Card> oneRoundCard = new ArrayList<Card>();
		
		
		public Player(String name1,int chips1)
		{
			name =name1;
			chips =chips1;
			
		}
		public void setOneRoundCard(ArrayList<Card> cards) {
			oneRoundCard = cards;
		}
		
		public void say_hello()
		{
			
			System.out.println("Hello, I am " + name + ".");
			System.out.println("I have " + chips + " chips.");
			
		}
		public  int make_bet()
		{ if( chips  !=0 &&  hit_me())
			bet =5;
	
			
			return bet;
		}
		boolean hit_me() {
			boolean a= true;
			int TotalValue =getTotalValue();
			if(TotalValue>16)
			{
				a =false;
			}
			// TODO Auto-generated method stub
			return a;
		}
		int getTotalValue() {
			int TotalValue = 0, NumberOfA = 0;
			for (Card item : oneRoundCard) {
				if (item.getRank() ==1)
				{
					if(TotalValue+10 >16)
					{
						TotalValue +=10;
					}
					else
					{
						TotalValue +=1;
					}
					
				}
				else if(item.getRank()>10)
				{
					TotalValue +=10;
				}
				else
				{
					
					TotalValue +=item.getRank();
					
				}
			
			}
			// TODO Auto-generated method stub
			return TotalValue;
		}

		public String get_name() {
			// TODO Auto-generated method stub
			return name;
		}
		public void increase_chips(int p1Bet) {
			chips +=p1Bet;
			// TODO Auto-generated method stub
			
		}
		public int get_current_chips() {
			// TODO Auto-generated method stub
			return  chips;
		}
		

		
		
		// TODO Auto-generated method stub

	

}
