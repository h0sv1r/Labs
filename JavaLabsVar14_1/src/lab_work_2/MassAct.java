package lab_work_2;

import java.util.ArrayList;

public interface MassAct {
	public int[][] massAdd(int[][] mass1, int[][] mass2);

	public int[][] massSort(int[][] mass);

	public void massPrint(int[][] mass);

	public ArrayList<Integer> massVectMul(int MC[][], ArrayList<Integer> D);

	public int[][] massSub(int[][] mass1, int[][] mass2);
	
	public int[][] massInput();
}
