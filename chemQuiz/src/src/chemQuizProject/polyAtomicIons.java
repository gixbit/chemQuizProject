package src.chemQuizProject;
public class polyAtomicIons {
	public enum PolyFormulas {
		ClO4(0),
		ClO3(1),
		ClO2(2),
		ClO(3),
		SO4(4),
		SO3(5),
		HSO4(6),
		HSO3(7),
		S2O3(8),
		C2O4(9),
		NH4(10),
		BrO4(11),
		BrO3(12),
		BrO2(13),
		BrO(14),
		PO4(15),
		HPO4(16),
		H2PO4(17),
		CO3(18),
		HCO3(19),
		MnO4(20),
		O2(21),
		IO4(22),
		IO3(23),
		IO2(24),
		IO(25),
		NO3(26),
		NO2(27),
		CrO4(28),
		Cr2O7(29),
		CN(30),
		SCN(31),
		OH(32),
		CH2COOH(33); //
		private String name;
		private PolyFormulas(int n) {
			this.name = toString();
		}
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
	public enum PolyCharges {
		C0_1n(0), //perchlorate
		C1_1n(1), //chlorate
		C2_1n(2), //chlorite
		C3_1n(3), //hypochlorate
		C4_2n(4), //sulfate
		C5_2n(5), //sulfite
		C6_1n(6), //hydrogen sulfate
		C7_1n(7), //hydrogen sulfite
		C8_2n(8), //thiosulfate
		C9_2n(9), //oxalate
		C10_1p(10), //ammonium
		C11_1n(11), //perbromate
		C12_1n(12), //bromate
		C13_1n(13), //bromite
		C14_1n(14), //hypobromite
		C15_3n(15), //phosphate
		C17_2n(16), //hydrogen phosphate
		C18_1n(17), //dihydrogen phosphate
		C19_2n(18), //carbonate
		C20_1n(19), //hydrogen carbonate
		C21_1n(20), //permanganate
		C22_2n(21), //peroxide
		C23_1n(22), //periodate
		C24_1n(23), //iodate
		C25_1n(24), //iodite
		C26_1n(25), //hypoiodite
		C27_1n(26), //nitrate
		C28_1n(27), //nitrite
		C29_2n(28), //chromate
		C30_2n(29), //dichromate
		C31_1n(30), //cyanide
		C32_1n(31), //thiocyanate
		C33_1n(32), //oxalate
		C34_1n(33); //acetate};
		private String name;
		private PolyCharges(int n) {
			this.name = toString();
		}
		@Override
		public String toString() {
			this.name = super.toString();
			this.name = this.name.substring(this.name.length()-2).replace("p", "+").replace("n", "-");
			return this.name;
		}
	}
	public enum PolyNames {
		perchlorate(0),
		chlorate(1),
		chlorite(2),
		hypochlorite(3),
		sulfate(4),
		sulfite(5),
		hydrogen_sulfate(6),
		hydrogen_sulfite(7),
		thiosulfate(8),
		oxalate(9),
		ammonium(10),
		perbromate(11),
		bromate(12),
		bromite(13),
		hypobromite(14),
		phosphate(15),
		hydrogen_phosphate(16),
		dihydrogen_phosphate(17),
		carbonate(18),
		hydrogen_carbonate(19),
		permanganate(20),
		peroxide(21),
		periodate(23),
		iodate(24),
		iodite(25),
		hypoiodite(26),
		nitrate(27),
		nitrite(28),
		chromate(29),
		dichromate(30),
		cyanide(31),
		thiocyanate(32),
		hydroxide(33),
		acetate(34);
		private String name;
		private PolyNames(int n) {
			this.name = toString();
		}
		@Override
		public String toString() {
			this.name = super.toString().replace("_", " ");
			return this.name;
		}
	}
}