package org.accessModifiers;
import org.inheritance.InheritanceTypes;
public class Java extends InheritanceTypes {
	public void jdk() {
		System.out.println("jdk contains jre+jvm");
		}
	static byte Javaversion;
	public static void main(String[] args) {
		String IDE="ECLIPSE OXYGEN 3A";
		System.out.println("IDE="+IDE);
		System.out.println("jAVA VERSION="+Javaversion);
		Java a=new Java();
		a.jdk();
		a.types();
		a.Fivetypes();
		char initial='v';
		System.out.println(initial);
		
		
	}
}
