package ca.mcgill.ecse.flightmanagementsystem.application;

import ca.mcgill.ecse.flightmanagementsystem.model.FMS;

public class FMSApplication {
	private static FMS fms;
	
	public static void main(String[] args) {
		fms = getFMS();
	}
	
	public static FMS getFMS() {
		if (fms == null) {
			fms = new FMS();
		}
		return fms;
	}
}
