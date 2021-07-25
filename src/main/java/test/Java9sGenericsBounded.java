package test;

public class Java9sGenericsBounded {
		public static void main(String[] args) {
				// valid
				Glass<Water> aGlassOfWater = new Glass<>();
				Water bisleri = new Water();
				aGlassOfWater.liquid = bisleri;
				
				Glass<Juice> aGlassOfMelonJuice = new Glass<>();
				Juice melonJuice = new Juice();
				aGlassOfMelonJuice.liquid = melonJuice;
				
				System.out.println(aGlassOfWater.getLiquidTaste());
				System.out.println(aGlassOfMelonJuice.getLiquidTaste());
				
				// invalid
				/*Glass<Diesel> aGlassOfDiesel = new Glass<>();
				Diesel crudeDiesel = new Diesel();
				aGlassOfDiesel.liquid = crudeDiesel;*/
				
				Glass<Juice> aGlassOfLemonJuice = new Glass<>();
				CitrusJuice lemonJuice = new CitrusJuice();
				System.out.println("citrus juice taste:\t" + aGlassOfLemonJuice.getLiquidTaste(lemonJuice));
				
				// invalid
				//System.out.println("melon juice taste:\t" + aGlassOfLemonJuice.getLiquidTaste(aGlassOfMelonJuice));
		}
}

interface Liquid{
		public String taste();
}
class Diesel{}
class Cake{}

class Juice implements Liquid{
		@Override
		public String taste() {
				return "SWEET";
		}
}
class CitrusJuice extends Juice{
		public String taste() {
				return "sour";
		}
}
class Water implements Liquid{
		@Override
		public String taste() {
				return "Neutral";
		}
}

//class Something<? extends  Number>{ }

//class Glass<T extends Liquid & Liquid>{ both class and interface
class Glass<T extends Liquid>{ // T is declared at class level
		public T liquid; // T is declared aat field level
		public String getLiquidTaste(){
				return liquid.taste();
		}
		public <U extends Juice> String getLiquidTaste(U juice){
				return juice.taste();
		}
}

/*
* consider this:
* class Juice{}
* interface Liquid{}
* class OrangeJuice extends Juice implements Liquid{}
*
* In Regular java,
* Juice juice = new OrangeJuice(); // is perfectly Fine
* But in generics,
* Glass<Juice> juiceGlass = new Glass<OrangeJuice>(); // is invalid
* Basically Glass<ReferenceType> and Glass<SubType> is completely different
* */