package com.evsward.double_dispatch;

public class Rectangle {
	private int left;
	private int top;
	private int right;
	private int bottom;

	public Rectangle(int left, int right, int top, int bottom) {
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	boolean intersectsWith(Rectangle r) {
		return !(r.getLeft() > getRight() || r.getRight() < getLeft() || r.getTop() > getBottom()
				|| r.getBottom() < getTop());
	}

	@Override
	public String toString() {
		return String.format("[%d,%d,%d,%d]", getLeft(), getTop(), getRight(), getBottom());
	}

}
