package chapter6;

public class ProduitFishException extends Exception{
	public ProduitFishException()
	{
		
	}
	public ProduitFishException(String msg)
	{
		super(msg);
	}
	
	public ProduitFishException(Exception e)
	{
		super(e);
	}
}
