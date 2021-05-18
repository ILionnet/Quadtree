package quadTree;

import java.util.ArrayList;
import java.util.List;

public class QuadTree {	
	
	MyRectangle boundary;
	int capacity;
	List<Point> points = new ArrayList<Point>();
	QuadTree northwest;
	QuadTree northeast;
	QuadTree southwest;
	QuadTree southeast;
	Boolean divided = false;
	
	
	public QuadTree(MyRectangle boundary, int n) {
		this.boundary = boundary;
		this.capacity = n;		
	}
	
	
		
	public void Subdivide() {
		float x = this.boundary.x;
		float y = this.boundary.y;
		float w = this.boundary.w;
		float h = this.boundary.h;		
		
		
		MyRectangle ne = new MyRectangle(x + w/2, y-w/2, w/2, h/2);
		this.northeast = new QuadTree(ne, this.capacity);
		
		MyRectangle nw = new MyRectangle(x - w/2, y-w/2, w/2, h/2);
		this.northwest = new QuadTree(nw, this.capacity);
		
		MyRectangle se = new MyRectangle(x + w/2, y+w/2, w/2, h/2);
		this.southeast = new QuadTree(se, this.capacity);
		
		MyRectangle sw = new MyRectangle(x - w/2, y+w/2, w/2, h/2);
		this.southwest = new QuadTree(sw, this.capacity);
		
		this.divided = true;
		
	}
	
	public void Insert(Point point) {
		
		if(!this.boundary.Contains(point)) {
			return;
		}
		
		if(this.points.size() < this.capacity) {
			this.points.add(point);
		}else {
			if(!this.divided) {
				this.Subdivide();
				this.divided = true;
			}
			this.northeast.Insert(point);
			this.northwest.Insert(point);
			this.southeast.Insert(point);
			this.southwest.Insert(point);
		}
	}

}
