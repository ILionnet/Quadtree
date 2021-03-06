package quadTree;

public class MyRectangle {
	float x;
	float y;
	float w;
	float h;
	
	public MyRectangle(float x, float y, float w, float h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public Boolean Contains(Point point) {
		return(point.x > this.x - this.w && 
				point.x < this.x + this.w &&
				point.y > this.y - this.h &&
				point.y < this.y + this.h);
	}

}
