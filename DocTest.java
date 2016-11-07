package practiceFusion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DocTest {

	static List<Doctor> ls = new ArrayList<Doctor>();

	@Test
	public void test() {

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

		List<Doctor> ans = DoctorProvider.getRelevantSpeciality(jimmy, ls);

		for (Doctor d : ans) {
			assertEquals(d.getSpeciality().toLowerCase().trim(), "dentist");
		}

		List<Doctor> ans2 = DoctorProvider.getRelevantArea(aalap, ls);

		for (Doctor d : ans2) {
			assertEquals(d.getArea().toLowerCase().trim(), "Sunnyvale".toLowerCase());
		}

	}

}
