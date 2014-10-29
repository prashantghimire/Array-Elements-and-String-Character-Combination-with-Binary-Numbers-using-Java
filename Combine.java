import java.util.Scanner;
public class Combine {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter what you want to use combination for,\nEnter (\"array\" or \"string\"):");
		
		while(scan.hasNext()){
			String combChoice = scan.next();
			if(combChoice.equals("string")){
				System.out.println("Enter a string that you want to get combination of:");
				String input = scan.next().trim();
				System.out.println("Enter the number of letters in one combination,\nEnter \"all\" for all possible combinations:");
				String choice = scan.next().trim();
				if(!choice.equals("all")){
					printArray(getCombination(input, Integer.parseInt(choice)));
				}
				else{
					printArray(getCombination(input));
				}
			}
			else if(combChoice.equalsIgnoreCase("array")){
				System.out.println("Enter items seperate by comma(not space), Eg. Apple,Banana,Coconut,Orange");
				String input = scan.next().trim();
				String [] inputAsArray = input.split(",");
				for (int i = 0; i < inputAsArray.length; i++) {
					inputAsArray[i] = inputAsArray[i].trim();
				}
				System.out.println("Enter the number of letters in one combination,\nEnter \"all\" for all possible combinations:");
				String choice = scan.next().trim();
				if(!choice.equals("all")){
					
					printArray(itemCombinator(inputAsArray,Integer.parseInt(choice)));
				}
				else{
					printArray(itemCombinator(inputAsArray));
				}
			}
			else{
				System.out.println("Wrong choice, Please enter again!");
			}
			System.out.println("Enter what you want to use combination for(\"array\" or \"string\"):");
		}
		scan.close();
	}
	public static void printArray(String[] toPrint){
		System.out.println("Combination Result:");
		for (int i = 0; i < toPrint.length; i++) {
			System.out.println(toPrint[i]);
		}
	}
	public static String[] itemCombinator(String[] array, int numbers){
		int len = array.length;
		String [] resultArray;
		String result = "";
		int [][] bin = binaries(len);
		for (int i = 0; i < bin.length; i++) {
			String comb= "";
			int count = 0;
			for (int j = 0; j < len; j++) {
				if(bin[i][j] == 1){
					comb+=array[j]+ " ";
					count = count + 1;
				}
				if(i<bin.length - 1){
				}
			}
			result += comb+"-";
		}
		resultArray = result.split("-");
		return resultArray;
	}

	public static String[] itemCombinator(String[] array){
		int len = array.length;
		String [] resultArray;
		String result = "";
		int [][] bin = binaries(len);
		for (int i = 0; i < bin.length; i++) {
			String comb= "";
			for (int j = 0; j < len; j++) {
				if(bin[i][j] == 1){
					comb+=array[j]+" ";
				}
			}
			result += comb+"-";
		}
		resultArray = result.split("-");
		return resultArray;
	}
	
	public static String[] getCombination(String s, int numbers){
		int len = s.length();
		String [] resultArray;
		String result = "";
		int [][] bin = binaries(len);
		for (int i = 0; i < bin.length; i++) {
			String comb= "";
			for (int j = 0; j < len; j++) {
				if(bin[i][j] == 1){
					comb+=s.charAt(j);
				}
			}
			if(comb.length() == numbers){
				result += comb+"-";
			}
		}
		resultArray = result.split("-");		
		return resultArray;
	}
	
	public static String[] getCombination(String s){
		int len = s.length();
		String [] resultArray;
		String result = "";
		int [][] bin = binaries(len);
		for (int i = 0; i < bin.length; i++) {
			String comb= "";
			for (int j = 0; j < len; j++) {
				if(bin[i][j] == 1){
					comb+=s.charAt(j);
				}
			}
			result +=comb+"-";
		}
		resultArray = result.split("-");
		return resultArray;
	}
	
	public static int[][] binaries(int length){ 
		int row = (int)Math.pow(2, length);
		int binaries[][] = new int[row][length];
		for(int i = 0; i < row; i ++){
			binaries[i] = bin(i,length);
		}
		return binaries;
	}
	public static int[] bin(int i,int len){
		String s = Integer.toBinaryString(i);
		int l = s.length();
		int [] res = new int[len];
		for (int j = 0; j < l; j++) {
			res[res.length - j - 1] = s.charAt(l-j-1) - '0';
		}
		return res;
	}
}
