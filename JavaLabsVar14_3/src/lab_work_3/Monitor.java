package lab_work_3;
public class Monitor {

protected int barrier = 2;
protected boolean canOutputResult = false;
protected boolean inputIsFree = true;

// метод очікування сигналу вводу
public synchronized void waitVarInput() {
while (barrier != 0) {
try {
wait();
            } catch (InterruptedException e) {}
        }
    }

// метод, що сигналізує про введення змінних
public synchronized void signalVarInput() {
barrier -= 1;
notify();
    }

// метод очікування сигналу виводу результату
public synchronized void waitResult() {
while (!canOutputResult) {
try {
wait();
            } catch (InterruptedException e) {}
        }
    }
// метод, що сигналізує про дозвіл виводу результату
public synchronized void signalResult() {
canOutputResult = true;
notify();
    }

// метод, що зобороняє виконання вводу
public synchronized void holdInput() {
inputIsFree = false;
    }

// метод, що очікує на звільнення вводу
public synchronized void waitForFreeInput() {
while (!inputIsFree) {
try {
wait();
            } catch (InterruptedException e) {}
        }
    }

// метод, що сигналізує про звільнення вводу
public synchronized void signalInputIsFree() {
inputIsFree = true;
notify();
    }
}

