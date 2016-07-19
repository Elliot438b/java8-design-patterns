package com.evsward.abstract_factory;

public class App {
	private Validation validation;
	private Pay pay;
	private Notice notice;

	public void doPayEvent(final PayChannelFactory factory) {
		setValidation(factory.doValidation());
		setPay(factory.doPay());
		setNotice(factory.doNotice());
	}

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public static void main(String[] args) {
		App app = new App();
		System.out.println("zhi fu bao pay transaction.");
		app.doPayEvent(new ZfbPayChannel());
		app.getValidation().doValidate();
		app.getPay().doPay();
		app.getNotice().doNotice();
		
		System.out.println("wei xin pay transaction.");
		app.doPayEvent(new WXinPayChannel());
		app.getValidation().doValidate();
		app.getPay().doPay();
		app.getNotice().doNotice();
	}
}
