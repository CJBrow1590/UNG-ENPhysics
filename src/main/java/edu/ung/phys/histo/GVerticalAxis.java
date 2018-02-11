package edu.ung.phys.histo;

import processing.core.PApplet;

public class GVerticalAxis {

	public PApplet parent;
	public Axis axis;
	
	public GVerticalAxis(PApplet parent, Axis axis) {
		this.parent = parent;
		this.axis = axis;
	}

	public void display() {
		int textSize = 20;
		parent.stroke(0);
		parent.strokeWeight((float) 2.75);
		parent.line(0, parent.height, 0, 0);
		parent.textSize(textSize);
		parent.fill(0);
		parent.text(Double.toString(axis.min), (int) (-1.5*textSize), parent.height + (int) (0.5*textSize));
		parent.text(Double.toString(axis.min + 0.5*(axis.max-axis.min)), (int) (-1.5*textSize), (int) (0.5*parent.height) + (int) (0.5*textSize));
		parent.text(Double.toString(axis.max), (int) (-1.5*textSize), (int) (0.5*textSize));
	}

}
