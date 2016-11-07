package practiceFusion;

import java.util.ArrayList;
import java.util.List;

public class DoctorProvider {

	static List<Doctor> ls = new ArrayList<Doctor>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor ishan = new Doctor();
		ishan.setfName("Ishan");
		ishan.setlName("Shah");
		ishan.setArea("Sunnyvale");
		ishan.setScore(2.3);
		ishan.setSpeciality("Ortho");

		Doctor jimmy = new Doctor();
		jimmy.setfName("Jimmy");
		jimmy.setlName("Mehta");
		jimmy.setArea("SF");
		jimmy.setScore(3.3);
		jimmy.setSpeciality("Dentist");

		Doctor kunjan = new Doctor();
		kunjan.setfName("Kunjan");
		kunjan.setlName("Mehta");
		kunjan.setArea("MountainView");
		kunjan.setScore(2.3);
		kunjan.setSpeciality("Orthopaedic");

		Doctor brona = new Doctor();
		brona.setfName("Brona");
		brona.setlName("Kapadia");
		brona.setArea("PaloAlto");
		brona.setScore(3.4);
		brona.setSpeciality("Dentist");

		Doctor aalap = new Doctor();
		aalap.setfName("Aalap");
		aalap.setlName("Desai");
		aalap.setArea("Sunnyvale");
		aalap.setScore(2.9);
		aalap.setSpeciality("Opthamalogist");

		ls.add(ishan);
		ls.add(aalap);
		ls.add(brona);
		ls.add(kunjan);
		ls.add(jimmy);

		// Similar Speciality
		List<Doctor> lsAns1 = getRelevantSpeciality(brona, ls);

		for (Doctor dObj : lsAns1) {
			if (lsAns1.size() > 1) {
				System.out.println("Relevant Speciality:  " + dObj.getfName() + "  " + dObj.getlName() + " :"
						+ dObj.getSpeciality());
			} else {
				System.out.println("No other doctor with same speciality");
			}
		}

		// Similar Area
		List<Doctor> lsAns2 = getRelevantArea(brona, ls);

		for (Doctor dc : lsAns2) {
			if (lsAns2.size() > 1) {
				System.out.println("Same Area" + dc.getfName() + " " + dc.getlName() + " " + dc.getArea());
			} else {
				System.out.println("No other doctor in the same area");
			}
		}

		// Similar Rating
		List<Doctor> lsAns3 = getRelevantRating(brona, ls);

		for (Doctor doctor : lsAns1) {
			if (lsAns3.size() > 1) {
				System.out.println(
						"Similar Rating: " + doctor.getfName() + " " + doctor.getlName() + " :" + doctor.getScore());
			} else {
				System.out.println("No doctor with similar rating");
			}
		}

		System.out.println("Done with the project");
	}

	// This returns doctor with a rating having an absolute difference of 0.2
	public static List<Doctor> getRelevantRating(Doctor d, List<Doctor> ls2) {
		// TODO Auto-generated method stub

		final Double doctorRating = d.getScore();

		List<Doctor> ls4 = new ArrayList<>();

		for (int i = 0; i < ls2.size(); i++) {
			Double currentDoctorRating = ls2.get(i).getScore();

			if (Math.abs(currentDoctorRating - doctorRating) >= 0
					&& Math.abs(currentDoctorRating - doctorRating) <= 0.2) {
				ls4.add(ls2.get(i));
			}
		}

		return ls4;

	}

	// This returns a doctor in the same area
	static List<Doctor> getRelevantArea(Doctor d, List<Doctor> ls2) {
		// TODO Auto-generated method stub {
		// TODO Auto-generated method stub

		List<Doctor> ls4 = new ArrayList<>();
		final String doctorArea = d.getArea().toLowerCase().trim();

		for (int i = 0; i < ls2.size(); i++) {
			final String currentDoctorArea = ls2.get(i).getArea().toLowerCase().trim();

			if (currentDoctorArea.equals(doctorArea)) {
				ls4.add(ls2.get(i));
			}
		}

		return ls4;

	}

	// THis returns a doctor with similar speciality
	static List<Doctor> getRelevantSpeciality(Doctor d, List<Doctor> ls2) {
		// TODO Auto-generated method stub

		List<Doctor> ls4 = new ArrayList<>();
		final String doctorSpecialityArea = d.getSpeciality().toLowerCase().trim();

		for (int i = 0; i < ls2.size(); i++) {
			final String currentDoctorSpeciality = ls2.get(i).getSpeciality().toLowerCase().trim();

			if (currentDoctorSpeciality.equals(doctorSpecialityArea)) {
				ls4.add(ls2.get(i));
			}
		}

		return ls4;
	}

}
