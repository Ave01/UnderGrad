class CommercialBuilding{

	// ADD FIELDS
	private int numberOfUnits;
	private String streetAddress;
 
	public CommercialBuilding(int numberOU, String streetA)
		throws IllFormedCommercialBuildingException {
	
		if(numberOU < 1){
			throw new IllFormedCommercialBuildingException("Units are Less than 1");
		}

		if(streetA == null){
			throw new IllFormedCommercialBuildingException("null Street Address");
		}
	
		numberOfUnits = numberOU;
		streetAddress = streetA;
	}
}	

