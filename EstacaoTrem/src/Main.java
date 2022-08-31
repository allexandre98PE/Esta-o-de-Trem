public class Main {

	public static void main(String[] args) {
	
		Estacao t = new Estacao();

		Trem t1 = new Trem("Trem 1", t, true);
		Trem t2 = new Trem("Trem 2", t, true);
		Trem t3 = new Trem("Trem 3", t, true);
		Trem t4 = new Trem("Trem 4", t, true);
		Trem t5 = new Trem("Trem 5", t, true);
		Trem t6 = new Trem("Trem 6", t, true);
		Trem t7 = new Trem("Trem 7", t, true);
		Trem t8 = new Trem("Trem 8", t, true);
		Trem t9 = new Trem("Trem 9", t, true);
		Trem t10 = new Trem("Trem 10", t, true);
		Trem t11 = new Trem("Trem 11", t, true);
		Trem t12 = new Trem("Trem 12", t, true);
		Trem t13 = new Trem("Trem 13", t, true);
		Trem t14 = new Trem("Trem 14", t, true);
		Trem t15 = new Trem("Trem 15", t, true);

		Trem t16 = new Trem("Trem 16", t, false);
		Trem t17 = new Trem("Trem 17", t, false);
		Trem t18 = new Trem("Trem 18", t, false);
		Trem t19 = new Trem("Trem 19", t, false);
		Trem t20 = new Trem("Trem 20", t, false);
		Trem t21 = new Trem("Trem 21", t, false);
		Trem t22 = new Trem("Trem 22", t, false);
		Trem t23 = new Trem("Trem 23", t, false);
		Trem t24 = new Trem("Trem 24", t, false);
		Trem t25 = new Trem("Trem 25", t, false);
		Trem t26 = new Trem("Trem 26", t, false);
		Trem t27 = new Trem("Trem 27", t, false);
		Trem t28 = new Trem("Trem 28", t, false);
		Trem t29 = new Trem("Trem 29", t, false);
		Trem t30 = new Trem("Trem 30", t, false);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();
		t21.start();
		t22.start();
		t23.start();
		t24.start();
		t25.start();
		t26.start();
		t27.start();
		t28.start();
		t29.start();
		t30.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
			t11.join();
			t12.join();
			t13.join();
			t14.join();
			t15.join();
			t16.join();
			t17.join();
			t18.join();
			t19.join();
			t20.join();
			t21.join();
			t22.join();
			t23.join();
			t24.join();
			t25.join();
			t26.join();
			t27.join();
			t28.join();
			t29.join();
			t30.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ESTAÇÃO FECHADA");
	}

}
