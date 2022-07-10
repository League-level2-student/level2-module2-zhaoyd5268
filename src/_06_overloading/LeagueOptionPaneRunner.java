package _06_overloading;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane LeagueOptionPane = new	LeagueOptionPane();
		LeagueOptionPane.showCustomizableMessageDialog("The League is the Best!");
		
		
		LeagueOptionPane MoreCustomizableLeagueOptionPane = new LeagueOptionPane();
		MoreCustomizableLeagueOptionPane.showCustomizableMessageDialog("The League is the Absolute BEST!", "URGENT MESSAGE");
		
		LeagueOptionPane EvenMoreCustomizableLeagueOptionPane = new LeagueOptionPane();
		EvenMoreCustomizableLeagueOptionPane.showCustomizableMessageDialog("The League is Really the Absolute BEST!", "SUPER URGENT MESSAGE", "league.png" );
	
	}
}
