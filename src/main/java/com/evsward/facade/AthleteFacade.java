package com.evsward.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 这是Facade类，那个外交官，对外发言人。 它将所有要实现的方法的类存储到一个private final
 * 的集合中。然后根据自身不同的业务去分别调用内部方法，有点像Business layer，但是更加抽象一些，是相对技术范抽象出来的一层。
 * 
 * @author xp020154
 *
 */
public class AthleteFacade {
	private final List<Athlete> athletes;

	public AthleteFacade() {
		athletes = new ArrayList<>();
		athletes.add(new Runner());
		athletes.add(new Swimmer());
		athletes.add(new Gymnast());
	}

	public void beginToTrain() {
		makeActions(athletes, Athlete.Action.GATHER, Athlete.Action.TRAIN);
	}

	public void warmUp() {
		makeActions(athletes, Athlete.Action.WARM_UP);
	}

	public void study() {
		makeActions(athletes, Athlete.Action.MEAL, Athlete.Action.COURSE);
	}

	private static void makeActions(Collection<Athlete> athletes, Athlete.Action... actions) {
		for (Athlete athlete : athletes) {
			athlete.action(actions);
		}
	}
}
