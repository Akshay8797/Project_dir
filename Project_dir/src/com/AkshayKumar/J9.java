package com.AkshayKumar;
abstract class Persistence {
	abstract void persist();
}
class FilePersistence extends Persistence {
	void persist()
	{
		System.out.println("Data Persisted into File");
	}
}
class DatabasePersistence extends Persistence {
	void persist()
	{
		System.out.println("Data Persisted into Database");
	}
}
public class J9 {
	public static Persistence getPersistence()
	{
		return new DatabasePersistence();
	}
	public static void main(String[] args)
	{
		Persistence p=J9.getPersistence();
		p.persist();
	}
}