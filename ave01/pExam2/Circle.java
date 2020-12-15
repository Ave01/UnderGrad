public class Circle extends IllFormedCircleException{
	
	private int radius;

	public Circle(int radius) throws IllFormedCirceException{
		if(radius <= 0){
			throw new IllFormedCircleException("Invalid Radius");
		}
		public void setRadius(int radius) throws IllFormedCircleException{
			if(radius <= 0){
				throw new IllFormedCircleException("Invalid Radius");
			}
			else{
			this.radius = radius;
			}
		}
		public int getRadius(){ return radius; }
		@Override
		public String toString(){
			return "circle: radius = " + radius;
		}
	}
}
