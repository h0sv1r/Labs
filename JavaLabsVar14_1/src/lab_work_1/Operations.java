package lab_work_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Operations implements VectorAct, MassAct {
	private final static int N = 10;

	// ��������� ������ ����������� ������� �� 1 �� 10
	public void vectFillUp(ArrayList<Integer> list) {
		for (int i = 0; i < N; i++) {
			list.add((int) (Math.random() * 10 + 1));
		}
	}

	// ���� �������
	public ArrayList<Integer> vectSum(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(a.get(i) + b.get(i));
		}
		return list;
	}

	// ������ �������
	public ArrayList<Integer> vectSub(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(a.get(i) - b.get(i));
		}
		return list;
	}

	// ������ ���������� �������
	public ArrayList<Integer> vectSort(ArrayList<Integer> a) {
		Collections.sort(a, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		return a;

	}

	// �������� ���� ������� �� �������
	public void vectPrint(ArrayList<Integer> vect) {
		for (Integer i : vect) {
			System.out.print(i + " ");
		}
	}

	@Override
	public int[][] massAdd(int[][] mass1, int[][] mass2) {
		int[][] mass = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mass[i][j] = mass1[i][j] + mass2[i][j];
			}
		}

		return mass;
	}

	@Override
	public int[][] massSort(int[][] mass) {

		int[] tmpMass = new int[N];
		int[][] tmpMass2 = new int[N][N];
		for (int i = 0, a = 0; i < N; i++, a++) {
			for (int j = 0; j < N; j++) {
				tmpMass[j] = mass[i][j];
			}
			Arrays.sort(tmpMass);
			for (int b = 0; b < N; b++) {
				tmpMass2[a][b] = tmpMass[b];
			}
		}

		return tmpMass2;
	}

	@Override
	public void massPrint(int[][] mass) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}

	public ArrayList<Integer> massVectMul(int MC[][], ArrayList<Integer> D) {
		ArrayList<Integer> list = new ArrayList<>();
		int tmp;
		for (int i = 0; i < N; i++) {
			tmp = 0;
			for (int j = 0; j < N; j++) {
				tmp = tmp + MC[i][j] * D.get(j);
			}
			list.add(tmp);
		}
		return list;
	}

	

	@Override
	public int[][] massSub(int[][] mass1, int[][] mass2) {
		int[][] tmpMass = new int[N][N];
		for (int i = 0; i <N; i++) {
			for (int j = 0; j <N; j++) {
				tmpMass[i][j] = mass1[i][j] - mass2[i][j];
			}
		}
		return tmpMass;

	}

}
