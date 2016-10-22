package physics;

public class Vector2f {
	
	public float x, y;
	
	public Vector2f(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public void scale(float scale, Vector2f model){
		model.x *= scale;
		model.y *= scale;
	}
	
	public Vector2f add(Vector2f first, Vector2f second){
		return new Vector2f(first.x + second.x, first.y + second.y);
	} 
	
	public Vector2f subtract(Vector2f first, Vector2f second){
		return new Vector2f(first.x - second.x, first.y - second.y);
	}
	
	public float length(){
		return (float) Math.sqrt(Math.pow(this.x, 2.0f) + Math.pow(this.y, 2.0));
	}
	
	//finish with the last part containing the cosine function of angle between the two vectors
	public float dotProduct(Vector2f first, Vector2f second){
		return Math.abs(first.length()) * Math.abs(second.length());//add * cos(angle between a and b)
	}
	//TODO: add the cross product as a method
	
}
