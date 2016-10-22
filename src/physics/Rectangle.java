package physics;

public class Rectangle {

	public float width, height;
	public float x, y;
	public Coordinate[] coords;
	
	public Rectangle(float x, float y, float width, float height){
		this.x = x;
	    this.y = y;
	    this.width = width;
	    this.height = height;
	    coords[0] = new Coordinate(x, y);
	    coords[1] = new Coordinate(x + width, y);
	    coords[2] = new Coordinate(x, y + height);
	    coords[3] = new Coordinate(x + width, y + height);
	}
	
	public boolean collidesWith(Rectangle model){
		for(int c = 0; c < coords.length; c++){
			if((model.coords[c].x < (this.x + this.width)) && (model.coords[c].x > this.x) && (model.coords[c].y < (this.y + this.height)) && (model.coords[c].y > this.y)){
				return true;
			}
		}
		return false;
	}
	
}
