package lab_work_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Operations implements VectorAct, MassAct, ScalAct {
	private final static int N = 3;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Заповнює вектор випадковими значеннями від 1 до 3
	 */
	public void vectFillUp(ArrayList<Integer> list) {
		for (int i = 0; i < N; i++) {
			list.add((int) (Math.random() * 3 + 1));
		}
	}

	/**
	 * Сума векторів
	 */
	public ArrayList<Integer> vectSum(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(a.get(i) + b.get(i));
		}
		return list;
	}

	/**
	 * Різниця векторів
	 */
	public ArrayList<Integer> vectSub(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(a.get(i) - b.get(i));
		}
		return list;
	}

	/**
	 * Сортування вектора
	 */
	public ArrayList<Integer> vectSort(ArrayList<Integer> a) {
		Collections.sort(a, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		return a;

	}

	/**
	 * Вивід вектора на стандартну консоль виводу
	 */
	public void vectPrint(ArrayList<Integer> vect) {
		for (Integer i : vect) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Сума двох матриць
	 */
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

	/**
	 * Сортування матриці по рядках
	 */
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

	/**
	 * Вивід масиву на стандартну консоль виводу
	 */
	@Override
	public void massPrint(int[][] mass) {
		for (int i = 0; i < N; i++) {
			System.out.print("{");
			for (int j = 0; j < N; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
	}

	/**
	 * Добуток матриці на вектор
	 */
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

	/**
	 * Різниця матриць
	 */
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
	
	/**
	 * Вивід скалярної величини на стандартну консоль виводу
	 */
	@Override
	public void scalOutput() {
		System.out.println("a = " + Data.a);
	}

	/**
	 * Зчитування значень масива зі стандартної консолі вводу
	 */
	@Override
	public int[][] massInput() {
		int[][] mass = new int[3][3];
		String[] s;
		for (int i = 0; i < 3;) {
			try {
				System.out.println("Input mass row numbers in order x x x, where x - any number:");
				s = br.readLine().split(" ");
				if (s.length == 3) {
					for (int j = 0; j < 3; j++) {
						mass[i][j] = Integer.parseInt(s[j]);

					}
					i++;
				}else{
					System.out.println("Incorrect input");
				}
			} catch (IOException | ArrayIndexOutOfBoundsException e) {
				System.out.print("Incorrect input! Lets try again!");
			}

		}

		return mass;
	}

	/**
	 * Зчитування значень вектора зі стандартної консолі вводу
	 */
	@Override
	public ArrayList<Integer> vectInput() {
		ArrayList<Integer> list = new ArrayList<>();
		String[] s;
		try {
			
			boolean check = true;
			while (check) {
				System.out.println("Input numbers in order x x x, where x - any number:");
				s = br.readLine().split(" ");
				if (s.length == 3) {
					for (int i = 0; i < 3; i++) {
						list.add(Integer.parseInt(s[i]));
					}
					check=false;
				}else{
					System.out.println("Incorrect input");
				}
			}
		} catch (IOException | ArrayIndexOutOfBoundsException e) {
			System.out.print("Incorrect input! Lets try again!");
		}

		return list;
	}
	
	/**
	 * Множення векторів
	 */
	@Override
	public ArrayList<Integer> vectMul(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(A.get(i) * B.get(i));
		}
		return list;
	}

	/**
	 * Скалярна сума
	 */
	@Override
	public int scalSum(ArrayList<Integer> a) {
		int tmp = 0;
		for (Integer entry : a) {
			tmp += entry;
		}
		return tmp;
	}

}
