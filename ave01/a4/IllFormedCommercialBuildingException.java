
class IllFormedCommercialBuildingException extends Exception{

	private String reason;
	
	// Add constructor
	public IllFormedCommercialBuildingException(String f){
		reason = f;
	}

	@Override
	public String toString(){
		return "Ill Formed Building Exception" + reason;
	}
}

