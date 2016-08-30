package com.evsward.double_dispatch;

public class SpaceStationISS extends SpaceStationMir {

	public SpaceStationISS(int left, int top, int right, int bottom) {
		super(left, top, right, bottom);
	}

	@Override
	public void collision(GameObject gameObject) {
		gameObject.collisionResolve(this);
	}

}
