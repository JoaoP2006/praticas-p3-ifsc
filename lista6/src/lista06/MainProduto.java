package lista06;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Desktop> desktops = new ArrayList<>();
		// a
		Desktop pa = new Desktop();

		pa.setCodeBarras(12353l);
		pa.setFabricante("positivo");
		pa.setGamer(false);

		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("mouse");
		pecas.add("Monitor samsumg");

		pa.setPecas(pecas);
		desktops.add(pa);

		// b

		Desktop pb = new Desktop();

		pb.setCodeBarras(555505l);
		pb.setFabricante("SAMSUNG");
		pb.setGamer(true);

		ArrayList<String> pecas1 = new ArrayList<>();
		pecas1.add("mouse");
		pecas1.add("Monitor paia");
		pecas1.add("Mouse pad");

		pb.setPecas(pecas1);
		desktops.add(pb);

		// c
		Desktop pc = new Desktop();

		pc.setCodeBarras(4564333l);
		pc.setFabricante("Lenovo");
		pc.setGamer(false);

		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("mouse");
		pecas2.add("Monitor quebrado");
		pc.setPecas(pecas2);
		desktops.add(pc);
		// smart
		ArrayList<Smartphone> smartphones = new ArrayList<>();

		Smartphone sa = new Smartphone();

		sa.setCodeBarras(5326668l);
		sa.setFabricante("apple");
		sa.setCor("rosa");
		sa.setDimensoesTela("1960x700 cm");

		smartphones.add(sa);

		Smartphone sb = new Smartphone();

		sb.setCodeBarras(5326668l);
		sb.setFabricante("Samsung");
		sb.setCor("preto");
		sb.setDimensoesTela("1200x700 cm");

		smartphones.add(sb);

		Smartphone sc = new Smartphone();

		sc.setCodeBarras(5326668l);
		sc.setFabricante("Xioami");
		sc.setCor("Azul");
		sc.setDimensoesTela("1500x720 cm");

		smartphones.add(sc);

		// for

		for (Smartphone smartphone : smartphones) {

			System.out.println(smartphone.getCor());
			System.out.println(smartphone.getCodeBarras());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());

		}

		for (Desktop desktop : desktops) {

			System.out.println(desktop.getCodeBarras());
			System.out.println(desktop.getGamer());
			System.out.println(desktop.getFabricante());

			for (String pecas6 : desktop.getPecas()) {
				System.out.println(pecas6);
			}
		}
	}

}
