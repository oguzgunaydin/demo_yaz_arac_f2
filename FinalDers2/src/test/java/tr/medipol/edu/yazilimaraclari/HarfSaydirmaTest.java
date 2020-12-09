package tr.medipol.edu.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class HarfSaydirmaTest {

	@Test
	public void testHarfleriSaydir() {
		
		String cumle = "Medipol Universitesi ?";
		
		int sonuc = HarfSaydirma.harfleriSaydir(cumle);
		
		assertEquals(19, sonuc);
	}

}
