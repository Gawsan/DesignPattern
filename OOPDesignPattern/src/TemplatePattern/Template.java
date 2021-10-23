package TemplatePattern;

public abstract class Template {
	abstract void eat();

	abstract void sleep();

	abstract void code();

	final void template() {
		eat();
		sleep();
		code();
	}

}
