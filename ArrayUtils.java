/*
Niels Graham
APCS1 pd10
HW27 -- Objectify Your Array Tools
2015-11-9
*/


public class ArrayUtils{
    public static int intLinSearch(int[] a, int target){
	int counter = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] == target){
		counter = i;
		return counter;
	    }
	}
	return -1;
    }
    public static int strLinSearch(String[] a, String target){
	int counter;
	for (int i = 0; i < a.length; i++){
	    if (a[i].equals(target)){
		counter = i;
		return counter;
	    }
	}
	return -1;
    }
    public static int intFreq(int[] a, int target){
	int counter = 0;
	for (int i = 0; i < size(); i++){
	    if (a[i] == target)
		counter +=1;
	}
	return counter;
    }
    public static int strFreq(String[] a, String target){
	int counter = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i].equals(target))
		counter +=1;
	}
	return counter;
    }
    public static String strStringifier(String[] a){
	String retStr = "";
	for (int i = 0; i < a.length; i++){
	    retStr+= a[i]+ " ";
	}return retStr;
    }
    public static String intStringifier(int[] a){
	String retStr = "";
	for (int i = 0; i < a.length; i++){
	    retStr+= Integer.toString(a[i])+ " ";
	}return retStr;
    }
    public static void main(String[] args){
	String[] s = {"hi", "my", "name", "is", "niels"};
	int[] x = {1, 2, 3, 4, 5, 6};
	System.out.println(strStringifier(s));
	System.out.println(intStringifier(x));

    }
						
}
   
