package trash2;

import java.util.Scanner;

import lab_work_3.Monitor;


public class Lab4 {

// Метод для вводу вектора розміром N
public static int[] vectorInput(){
Scanner sc = new Scanner(System.in);
int[] A = new int[N]; 
for (int i = 0; i <N; i++) {
            A[i] = sc.nextInt();
        }
return A;
    }

// Метод для вводу матриці розміром NxN
public static int[][] matrixInput(){
Scanner sc = new Scanner(System.in);
int[][] MA = new int[N][N]; 
for (int i = 0; i <N; i++) {
for (int j = 0; j <N; j++) {
                MA[i][j] = sc.nextInt();
            }
        }
return MA;
    }

// Метод для множення матриці на вектор
public static int[] matrixVectorMul(int MA[][], int A[]){
int[] x = new int[N];
int tmp;
for (int i = 0; i <N; i++) {
tmp = 0;
for (int j = 0; j <N; j++) {
tmp = tmp + MA[i][j] * A[j];
            }
            x[i] = tmp;
        }
return x;
    }

// Метод для віднімання двох векторів
public static int[] vectorSub(int a[], int b[]) {
int[] x = new int[N];
for (int i = 0; i <N; i++) {
            x[i] = a[i] - b[i];
        }
return x;
    }

// Метод для виведення вектора
public static void vectorOutput(int a[]){
for (int i = 0; i <N; i++) {
System.out.print(a[i] + " ");
        }
System.out.println();
    }

// Глобальні змінні АКА загальна пам'ять
public static int[] A, B, D;
public static int[][] MC;
final static int N = 3; // константа розмірності для матриць та векторів

public static void main(String[] args) {

// Процес 2
class Thread2 extends Thread {
Monitor monitor;

public Thread2 (Monitor mon) { 
monitor = mon;
            }

public void run(){
monitor.waitForFreeInput();
monitor.holdInput(); // захоплення монітору введення

// Введення векторів B і D
System.out.print("Entervector B: ");
B = vectorInput();
System.out.print("Entervector D: ");
D = vectorInput();

monitor.signalInputIsFree(); // звільнення монітору введення
monitor.signalVarInput(); // сигнал дозволу виконання арифм. операцій
            }   
        }

// Процес 3
class Thread3 extends Thread {
Monitor monitor;

public Thread3 (Monitor mon) {
monitor = mon;
            }
public void run(){
monitor.waitForFreeInput();
monitor.holdInput(); // захолення монітору введення

// введення матриці МС
System.out.println("Enter MC: ");
MC = matrixInput();

monitor.signalInputIsFree(); // сигнал звільнення монітору введення
monitor.signalVarInput(); // сигнал дозволу виконання арифм. операцій
monitor.waitResult(); // очікування сигналу виведення результату

// виведення результату
System.out.print("\nA = ");
vectorOutput(A); 
            }
        }

// Процес 4
class Thread4 extends Thread {
Monitor monitor;

public Thread4 (Monitor mon) {
monitor = mon;
            }
public void run(){
monitor.waitVarInput(); // Очікування двох сигналів дозволу для виконання арифм. операцій

A = vectorSub(matrixVectorMul(MC, B), D); // Обчислення арифм. виразу

monitor.signalResult(); // сигнал дозволу виводу результату
            }
        }

// Створення об'єкту монітора
Monitor m = new Monitor();

// Створення об'єктів тредів
        Thread2 T2 = new Thread2(m);
        Thread3 T3 = new Thread3(m);
        Thread4 T4 = new Thread4(m);

// Запуск тредів
        T2.start();
        T3.start();
        T4.start();
    }
}

