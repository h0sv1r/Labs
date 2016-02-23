package lab_work_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Operations implements VectorAct, MassAct, ScalAct {
	private final static int N = 10;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// заповнити вектор випадковими числами в≥д 1 до 10
	public void vectFillUp(ArrayList<Integer> list) {
		for (int i = 0; i < N; i++) {
			list.add((int) (Math.random() * 10 + 1));
		}
	}

	// сума вектор≥в
	public ArrayList<Integer> vectSum(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(a.get(i) + b.get(i));
		}
		return list;
	}

	// р≥зниц€ вектор≥в
	public ArrayList<Integer> vectSub(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(a.get(i) - b.get(i));
		}
		return list;
	}

	// виконуЇ сортуванн€ вектора
	public ArrayList<Integer> vectSort(ArrayList<Integer> a) {
		Collections.sort(a, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		return a;

	}

	// виводить вм≥ст вектора на консоль
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
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tmpMass[i][j] = mass1[i][j] - mass2[i][j];
			}
		}
		return tmpMass;

	}

	@Override
	public int scalOutput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[][] massInput() {
		int[][] mass = new int[3][3];
		String s;
		String[] s1 = { "1", "1", "1" };
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("Input numbers in order x x x, where x - any number:");
				s = br.readLine();
				if (s1.length >= 5) {
					s1 = s.split(" ");
				} else {
					System.out.println("Incorrect input! Array string initialized by 1, 1, 1.");
				}
				for (int j = 0; j < 3; j++) {
					mass[i][j] = Integer.parseInt(s1[j]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return mass;
	}

	@Override
	public ArrayList<Integer> vectInput() {
		ArrayList<Integer> list = new ArrayList<>();
		String s;
		String[] s1 = { "1", "1", "1" };
		try {
			System.out.println("Input numbers in order x x x, where x - any number:");
			s = br.readLine();
			if (s1.length >= 5) {
				s1 = s.split(" ");
			} else {
				System.out.println("Incorrect input! Array string initialized by 1, 1, 1.");
			}
			for (int i = 0; i < 3; i++) {
				list.add(Integer.parseInt(s1[i]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
