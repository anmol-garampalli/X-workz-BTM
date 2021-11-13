
public class DoctorDAO {
	private DoctorDTO[] doc = new DoctorDTO[50];
	private int count;

	public DoctorDTO[] getDoc() {
		return doc;
	}
	public void create(DoctorDTO dto) { // create
		if (doc != null) {
			this.doc[count++] = dto;
			System.out.println("Invoked parametrized constructor");
		}
	}

	public void create(int index, DoctorDTO age) {
		if (age != null && index < doc.length && index >= 0) {
			this.doc[index] = age;
			System.out.println("Invoked parametirzed constructor");
		} else {
			System.out.println("Either age is full or pointing to null");
		}

	}

	public int indexOccupied() {
		System.out.println("index occupied is: ".concat(String.valueOf(count)));
		return this.count;
	}

	public boolean matchBySpecalization(String specalization) {
		for (int basappa = 0; basappa < doc.length; basappa++) {
			DoctorDTO ref = this.doc[basappa];
			if (ref != null) {
				System.out.println("array index is not null".concat(String.valueOf(basappa)));
				String spl = ref.getSpecilization();
				System.out.println("The specalization is ".concat(spl));
				if (spl.equals(specalization)) {
					System.out.println("values are equal");
					return true;

				} else {
					System.out.println("values are not equal");
				}
			}

		}

		return false;

	}

}// end of doctordao main class
