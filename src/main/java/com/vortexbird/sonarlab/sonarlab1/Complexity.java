package com.vortexbird.sonarlab.sonarlab1;

public class Complexity {

	
	public void calcular() {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < i; j++) {
				for (int j2 = 0; j2 < j; j2++) {
					if (j % 2 == 0) {
						calcular();
					}
				}

				for (int j2 = 0; j2 < j; j2++) {
					if (j2 % 2 != 0) {
						calcular();
					}
				}

			}

		}
	}

	public void calcular2(int param1, int param2, boolean flag) {

		java.util.logging.Logger log = java.util.logging.Logger.getLogger("calcular2");
		
		if (param1%2==0) {
			if (param2%2==0) {
				if (flag) {
					log.info("1 1 1");
				}else {
					log.info("1 1 0");
				}
			}else {
				if (flag) {
					log.info("1 0 1");
				}else {
					log.info("1 0 0");
				}
			}
		}else {
			if (param2%2==0) {
				if (flag) {
					log.info("0 1 1");
				}else {
					log.info("0 1 0");
				}
			}else {
				if (flag) {
					log.info("0 0 1");
				}else {
					log.info("0 0 0");
				}
			}
		}
	}

}
