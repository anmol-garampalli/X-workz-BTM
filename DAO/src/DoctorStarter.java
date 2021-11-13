
public class DoctorStarter {

	public static void main(String[] args) {
		DoctorDAO dao = new DoctorDAO();
		dao.create(0, new DoctorDTO("Abhishek", "Cardiologist", "Anmol Hospital", "Male", 100000.0f, 25));
		dao.create(new DoctorDTO("Adarsh", "Dermatology", "Anmol Hospital", "Female", 100000.0f, 25));
		dao.indexOccupied();
		dao.matchBySpecalization("Cardiology");

		DoctorDTO[] ref = dao.getDoc();
		for (int moti = 0; moti < ref.length; moti++) {
			DoctorDTO docref = ref[moti];
			if (docref != null) {
				System.out.println(docref.getDoctorName());
				System.out.println(docref.getSpecilization());
				System.out.println(docref.getHospitalName());
				System.out.println(docref.getGender());
				System.out.println(docref.getSalary());
			} else{
				System.out.println("The array is filled completely");

		}

	}

}
}
