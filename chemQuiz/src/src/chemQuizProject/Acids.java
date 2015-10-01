package src.chemQuizProject;
public class Acids {
	public enum NonOxygenAcids {
		hydrofluoric_acid,
		hydrochloric_acid,
		hydrobromic_acid,
		hydriodic_acid,
		hydrocyanic_acid,
		hydrosulfuric_acid;
		private String name;
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
	public enum OxygenAcids {
		acetic_acid,
		carbonic_acid,
		nitric_acid,
		nitrous_acid,
		perchloric_acid,
		chloric_acid,
		chlorous_acid,
		hypochlorous_acid,
		sulfuric_acid,
		sulfurous_acid,
		thiosulfuric_acid,
		permanganic_acid,
		chromic_acid,
		dichromic_acid,
		phosphorous_acid,
		phosphoric_acid;
		private String name;
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
	public enum NonOxygenAcidFormulas {
		HF,
		HCl,
		HBr,
		HI,
		HCN,
		H2S;
		private String name;
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
	public enum OxygenAcidFormulas {
		CH3COOH,
		H2CO3,
		HNO3,
		HNO2,
		HClO4,
		HClO3,
		HClO2,
		HClO,
		H2SO4,
		H2SO3,
		H2S2O3,
		HMnO4,
		H2CrO4,
		H2Cr2O7,
		H3PO3,
		H3PO4;
		private String name;
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
}