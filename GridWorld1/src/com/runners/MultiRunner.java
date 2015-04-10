package com.runners;

import info.gridworld.actor.ActorWorld;

import com.bugs.DancingBug;
import com.bugs.SpiralBug;
import com.bugs.ZBug;

public class MultiRunner {
	public static void main(String args) {	
		ActorWorld world = new ActorWorld();
		world.add(new SpiralBug());
		world.add(new ZBug(5));
		world.add(new DancingBug(new int[] {3, 5, 5, 2, 7, 9, 12, 3, 5, 3, 1, 1}));
	}
}
