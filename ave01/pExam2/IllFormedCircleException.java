public class IllFormedCircleException extends Exception{
	private String reason;
	public IllFormedCircleException(String reason){
		this.reason = reason;
	}
	@Override
		public String toString(){
			return "Ill Formed Circle: " + reason;
	}
}
