package com.evsward.double_dispatch;

public class SpaceStationMir extends GameObject {
	public SpaceStationMir(int left, int top, int right, int bottom) {
		super(left, right, top, bottom);
	}

	@Override
	public void collision(GameObject gameObject) {
		gameObject.collisionResolve(this);
	}

	@Override
	public void collisionResolve(Meteoroid meteoroid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void collisionResolve(SpaceStationMir mir) {
		// TODO Auto-generated method stub

	}

	@Override
	public void collisionResolve(FlamingAsteroid asteroid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collisionResolve(SpaceStationISS iss) {
		// TODO Auto-generated method stub
		
	}

}
