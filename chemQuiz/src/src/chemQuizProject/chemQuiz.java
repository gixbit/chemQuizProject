package src.chemQuizProject;
import java.util.Scanner;
import src.chemQuizProject.Acids.NonOxygenAcidFormulas;
import src.chemQuizProject.Acids.NonOxygenAcids;
import src.chemQuizProject.Acids.OxygenAcidFormulas;
import src.chemQuizProject.Acids.OxygenAcids;
import src.chemQuizProject.polyAtomicIons.PolyCharges;
import src.chemQuizProject.polyAtomicIons.PolyFormulas;
import src.chemQuizProject.polyAtomicIons.PolyNames;
public class chemQuiz {
	private enum QuestionTypes {
		Naming,
		Charges,
		Formula,
		Acid_Formulas,
		Oxygen_Acid_Formulas,
		Acid_Naming,
		Oxygen_Acid_Naming;
		private String name;
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
	private static int type = -1;
	private static int selected=-1;
	private static String answer = null;
	private static PolyNames[] polyNames = PolyNames.values();
	private static PolyCharges[] polyCharges = PolyCharges.values();
	private static PolyFormulas[] polyFormulas = PolyFormulas.values();
	private static QuestionTypes[] qType = QuestionTypes.values();
	private static NonOxygenAcids[] nonOxygenAcids = NonOxygenAcids.values();
	private static NonOxygenAcidFormulas[] nonOxygenAcidFormulas = NonOxygenAcidFormulas.values();
	private static OxygenAcids[] oxygenAcids = OxygenAcids.values();
	private static OxygenAcidFormulas[] oxygenAcidFormulas = OxygenAcidFormulas.values();
	private static float[] totals = {0,0}; //{total[0], right[1]};
	public static int rand(int y) {
		int x = (int) Math.floor((Math.random()*(y))); 
		return x;
	}
	public static int type() {
		type = rand(6);
		if (type < 3) {
			selected = rand(polyNames.length);//polyNames.length
		}
		else if (type == 3 || type == 4) {
			selected = rand(nonOxygenAcids.length);
		}
		else if (type == 5 || type == 6) {
			selected = rand(oxygenAcids.length);
		}
		return type;
	}
	public static String selected(int x) {
		String[] question = {
				("Random question type: "+qType[0]+"."), //Names
				("Random question type: "+qType[1]+"."), //Charges
				("Random question type: "+qType[2]+"."), //Formulas
				("Random question type: "+qType[3]+"."), //nonoxygen acid naming
				("Random question type: "+qType[4]+"."), //oxygen acid naming
				("Random question type: "+qType[5]+"."), //nonoxygen acid formula
				("Random question type: "+qType[6]+".") //oxygen acid formula
				};
		return question[x];
	}
	public static String askQuestion(int x) {
		String theQuestion = null;
		if (type == 0) {
			theQuestion = "Name the following polyatomic ion: "+polyFormulas[selected]+", With the charge: "+polyCharges[selected]+" (For example: "+polyFormulas[rand(polyNames.length)]+")";
		}
		else if (type == 1) {
			theQuestion = "What is the charge of the polyatomic ion: "+polyNames[selected]+" (For example: "+polyCharges[rand(polyCharges.length)]+")";
		}
		else if (type == 2) {
			theQuestion = "What is the formula of the polyatomic ion: "+polyNames[selected]+", With the charge: "+polyCharges[selected]+" (For example: "+polyFormulas[rand(polyFormulas.length)]+")";
		}
		else if (type == 3) {
			theQuestion = "What is the name of the acid: "+nonOxygenAcidFormulas[selected]+" (For example: "+nonOxygenAcids[rand(nonOxygenAcids.length)]+")";
		}
		else if (type == 4) {
			theQuestion = "What is the formula of the acid: "+nonOxygenAcids[selected]+" (For example: "+nonOxygenAcidFormulas[rand(nonOxygenAcidFormulas.length)]+")";
		}
		else if (type == 5) {
			theQuestion = "What is the name of the acid: "+oxygenAcidFormulas[selected]+" (For example: "+oxygenAcids[rand(oxygenAcids.length)]+")";
		}
		else if (type == 6) {
			theQuestion = "What is the formula of the acid: "+oxygenAcids[selected]+" (For example: "+oxygenAcidFormulas[rand(oxygenAcidFormulas.length)]+")";
		}
		return theQuestion;
	}
	public static boolean answer(String attempt) {
		if (type == 0) {
			answer = polyNames[selected].toString();
		}
		else if (type == 1) {
			answer = polyCharges[selected].toString();
		}
		else if (type == 2) {
			answer = polyFormulas[selected].toString();
		}
		else if (type == 3) {
			answer = nonOxygenAcids[selected].toString();
		}
		else if (type == 4) {
			answer = nonOxygenAcidFormulas[selected].toString();		
		}
		else if (type == 5) {
			answer = oxygenAcids[selected].toString();
		}
		else if (type == 6) {
			answer = oxygenAcidFormulas[selected].toString();
		}
		
		if (attempt.equalsIgnoreCase(answer)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void right(boolean score) {
		if (score) {
			totals[0]++;
			totals[1]++;
		}
		else {
			totals[0]++;
		}
	}
	public static float percentage(){ 
		if (totals[0] > 0) {
			
			return (float) ((totals[1]/totals[0])*100.0);
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String[] result = {"You got the right answer.\n","You got the wrong answer.\n"};
		Scanner in = new Scanner(System.in);
		boolean stop = false;
		System.out.println("Type 'q' to quit at any time...");		
		while(!stop) {
			System.out.printf("%s\n",selected(type()));
			System.out.printf("%s\n", askQuestion(selected));
			String current = in.nextLine().trim();
			if (current.equalsIgnoreCase("q")) {
				stop = true;
			}
			else if (answer(current)) {
				System.out.printf("%s\n\n",result[0]);
				right(true);
			}
			else {
				System.out.printf("%s\n",result[1]);
				System.out.printf("The answer was %s\n\n", answer);
				right(false);
			}
		}
		in.close();
		System.out.printf("You did %.0f questions and got %.0f out of %.0f right for a percentage of %.1f%%",totals[0], totals[1], totals[0], percentage());
	}
}