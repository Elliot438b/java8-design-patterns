package com.evsward.builder;

public class Warcraft {
	private final String name;
	private final Generation generation;
	private final Visibility visibility;
	private final Autocannon autocannon;
	private final Bomb bomb;
	private final Missile missile;

	private Warcraft(Builder builder) {
		this.name = builder.name;
		this.generation = builder.generation;
		this.visibility = builder.visibility;
		this.autocannon = builder.autocannon;
		this.bomb = builder.bomb;
		this.missile = builder.missle;
	}

	public String getName() {
		return name;
	}

	public Generation getGengeration() {
		return generation;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public Autocannon getAutocannon() {
		return autocannon;
	}

	public Bomb getBomb() {
		return bomb;
	}

	public Missile getMissle() {
		return missile;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This is the ").append(generation).append(" named ").append(name);
		if (autocannon != null) {
			sb.append(" with ").append(autocannon);
		}
		if (bomb != null) {
			sb.append(" with ").append(bomb);
		}
		if (missile != null) {
			sb.append(" with ").append(missile);
		}
		if (visibility != null) {
			sb.append(" is ").append(visibility);
		}
		sb.append(".");
		return sb.toString();
	}

	public static class Builder {
		private final String name;
		private final Generation generation;
		private Visibility visibility;
		private Autocannon autocannon;
		private Bomb bomb;
		private Missile missle;

		public Builder(String name, Generation generation) {
			if (name == null || generation == null) {
				throw new IllegalArgumentException("the parameter name and generation cannot be null! ");
			}
			this.name = name;
			this.generation = generation;
		}

		public Builder isVisible(Visibility visibility) {
			this.visibility = visibility;
			return this;
		}

		public Builder withAutocannon(Autocannon autocannon) {
			this.autocannon = autocannon;
			return this;
		}

		public Builder withBomb(Bomb bomb) {
			this.bomb = bomb;
			return this;
		}

		public Builder withMissile(Missile missile) {
			this.missle = missile;
			return this;
		}

		public Warcraft build() {
			return new Warcraft(this);
		}

	}

}
