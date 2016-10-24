package physics;
import util.Matrix;

public class Vector2f {
	
	public float x, y;
	public Matrix rotation;
	
	//common vectors for each multiple of (Math.PI/2) on graph.
	public static Vector2f right = new Vector2f(1.0f, 0.0f);
	public static Vector2f up = new Vector2f(0.0f, 1.0f);
	public static Vector2f left = new Vector2f(-1.0f, 0.0f);
	public static Vector2f down = new Vector2f(0.0f, -1.0f);
	
	public Vector2f(float x, float y){
		this.x = x;
		this.y = y;
		this.rotation = rotation;
		rotation =  new Matrix();
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
	
	public float findAngleBetween(Vector2f first, Vector2f second){
		float x = dotProduct(first, second);
		float y = first.length() + second.length();
		return (float) (Math.acos(x / y));
	}
	
	public void rotateVector(float angle){
		rotation.matrix = {
			{Math.cos(findAngleBetween(this, Vector2f.right)), -Math.sin(findAngleBetween(this, Vector2f.right))},
			{Math.sin(findAngleBetween(this, Vector2f.right)), Math.cos(findAngleBetween(this, Vector2f.right))}
		};
	}
	//TODO: add the cross product as a method
	
}
