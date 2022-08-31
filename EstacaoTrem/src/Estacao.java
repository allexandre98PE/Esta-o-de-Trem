import java.util.concurrent.Semaphore;

public class Estacao {

	Semaphore t1 = new Semaphore(1);
	Semaphore t2 = new Semaphore(1);
	Semaphore t3 = new Semaphore(1);
	Semaphore t4 = new Semaphore(1);


	public void controle(String name, boolean direcao) {

		if (direcao == true) {
			int aux = 1 + (int) (Math.random() * (3 - 1));
			if(aux == 1) {
				try {
					t1.acquire();
					System.out.println("Direcao Norte-Sul (ATENCAO) PLATAFORMA 1 -> "+name+" parou\n");
					Thread.sleep(1000);
					System.out.println("Direcao Norte-Sul (ATENCAO) PLATAFORMA 1 -> "+name+" saiu\n");
					t1.release();
					return;
				} catch (InterruptedException e) {
				}

			}if(aux == 2) {
				try {
					t2.acquire();
					System.out.println("Direcao Norte-Sul (ATENCAO) PLATAFORMA 2 -> "+name+" parou\n");
					Thread.sleep(1000);
					System.out.println("Direcao Norte-Sul (ATENCAO) PLATAFORMA 2 -> "+name+" saiu\n");
					t2.release();
					return;
				} catch (InterruptedException e) {
				}
			}
		} else{
			int aux = 3 + (int) (Math.random() * (5 - 3));
			if(aux == 3) {
				try {
					t3.acquire();
					System.out.println("Direcao Sul-Norte (ATENCAO) PLATAFORMA 3 -> "+name+" parou\n");
					Thread.sleep(1000);
					System.out.println("Direcao Sul-Norte (ATENCAO) PLATAFORMA 3 -> "+name+" saiu\n");
					t3.release();
					return;
				} catch (InterruptedException e) {
				}
			}

			if(aux == 4) {
				try {
					t4.acquire();
					System.out.println("Direcao Sul-Norte (ATENCAO) PLATAFORMA 4 -> "+name+" parou\n");
					Thread.sleep(1000);
					System.out.println("Direcao Sul-Norte (ATENCAO) PLATAFORMA 4 -> "+name+" saiu\n");
					t4.release();
					return;
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
