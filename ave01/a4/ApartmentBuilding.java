class ApartmentBuilding extends CommercialBuilding{

	public boolean penthouseApartment = false;
	public int numberOfUnits;
	public String streetAddress;

	public ApartmentBuilding(int numberOU, String streetA, boolean penthouseA)		 throws IllFormedCommercialBuildingException {

	super(numberOU, streetA);
	if(penthouseA == true){
		throw new IllFormedCommercialBuildingException("There is no penthouse");
	}

	penthouseApartment = penthouseA;
	numberOfUnits = numberOU;
	streetAddress = streetA;
	
	}
}
