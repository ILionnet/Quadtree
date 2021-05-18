package quadTree;

import java.util.Random;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.Rectangle;
import java.awt.Color;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method

		MyRectangle boundary = new MyRectangle(200, 200, 200, 200);
		QuadTree qt = new QuadTree(boundary, 4);

		System.out.println("Capacidade: " + qt.capacity);
		
		for (int i = 0; i < 6; i++) {
			Random gen = new Random();
			Point p = new Point(gen.nextInt(401), gen.nextInt(401), 10);
			qt.Insert(p);
		}
		

		
		for (int i = 0; i < qt.points.size(); i++) {
			System.out.println("x: " + qt.points.get(i).x + " y: " + qt.points.get(i).y);
			
		}
		
		System.out.println("Foi dividido? " + qt.divided);
		
		
		if(qt.northeast != null) {
			System.out.println("Pontos no nordeste: " + qt.northeast.points.size());
			for (int i = 0; i < qt.northeast.points.size(); i++) {
				System.out.println("x: " + qt.northeast.points.get(i).x + " y: " + qt.northeast.points.get(i).y);			
			}			
		}
		
		
		if(qt.northwest != null) {
			System.out.println("Pontos no noroeste: " + qt.northwest.points.size());
			for (int i = 0; i < qt.northwest.points.size(); i++) {
				System.out.println("x: " + qt.northwest.points.get(i).x + " y: " + qt.northwest.points.get(i).y);			
			}		
		}
		
		
		if(qt.southeast != null) {
			System.out.println("Pontos no sudeste: " + qt.southeast.points.size());
			for (int i = 0; i < qt.southeast.points.size(); i++) {
				System.out.println("x: " + qt.southeast.points.get(i).x + " y: " + qt.southeast.points.get(i).y);			
			}		
		}
		
		
		if(qt.southwest != null) {
			System.out.println("Pontos no sudoeste: " + qt.southwest.points.size());
			for (int i = 0; i < qt.southwest.points.size(); i++) {
				System.out.println("x: " + qt.southwest.points.get(i).x + " y: " + qt.southwest.points.get(i).y);			
			}		
		}
	}
	

}
