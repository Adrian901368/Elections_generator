import java.util.Random;
public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	public static void main(String[] args) {
		Knight[] k = new Knight[100];
		Ogre[] o = new Ogre[100];

		Random random = new Random();

		int minRange = 1;
		int maxRange = 100;

		int energy = random.nextInt(maxRange - minRange + 1) + minRange;

		// another kind of an ogre has been added: BadOgre
		// this is just the initialization of ogre and knight arrays so that different combinations would occur
		for (int i = 0; i < 20; i++) {
			k[i] = new Knight();
			k[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			o[i] = new BadOgre();
			o[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			o[i].hungry = true;
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy + " - before fight");
		}

		for (int i = 20; i < 40; i++) {
			k[i] = new Knight();
			k[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			o[i] = new MiniBadOgre();
			o[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy + " - before fight");
		}

		for (int i = 40; i < 70; i++) {
			k[i] = new Knight();
			k[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			o[i] = new Ogre();
			o[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy + " - before fight");
		}

		for (int i = 70; i < 100; i++) {
			k[i] = new SuperKnight();
			k[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			o[i] = new Ogre();
			o[i].energy = random.nextInt(maxRange - minRange + 1) + minRange;;
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy + " - before fight");
		}

		// the clash loop with an output statement
		for (int i = 0; i < 100; i++) {
			clash(o[i], k[i]);
			
			System.out.println(i + ":"
					+ "knight " + k[i].energy + " / "
					+ "ogre " + o[i].energy);
		}
	}
}
