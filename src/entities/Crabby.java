package entities;

import static utilz.Constants.EnemyConstants.*;

public class Crabby extends Enemy {

	public Crabby(float x, float y) {
		super(x, y, CRABBY_WIDTH, CRABBY_HEIGHT, CRABBY);
        
	}

	@Override
	protected void intHitbos(float x, float y, int width, int height) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'intHitbos'");
	}

}