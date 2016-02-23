package lab_work_3;

import java.util.ArrayList;

public interface VectorAct {
	public void vectFillUp(ArrayList<Integer> list);
	
	public ArrayList<Integer> vectSum(ArrayList<Integer> a, ArrayList<Integer> b);
	
	public ArrayList<Integer> vectSub(ArrayList<Integer> a, ArrayList<Integer> b);
	
	public ArrayList<Integer> vectSort(ArrayList<Integer> a);
	
	public void vectPrint(ArrayList<Integer> vect);
	
	public ArrayList<Integer> vectInput();
	
	public ArrayList<Integer> vectMul(ArrayList<Integer> a, ArrayList<Integer> b);
}
