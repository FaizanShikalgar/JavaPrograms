package com.inner;
//this is Plain- Old Anonymous inner Class Flavor II
interface Switchable
{
	void SwitchOn();
	void SwitchOff();
}
public class POAICOuterDemo 
{

	Switchable sw = new Switchable()
	{
		public void SwitchOn()
		{
			System.out.println("Anonymous device Switch On");
			
		}
		public void SwitchOff()
		{
			System.out.println("Anonymous device Switch Off");
		}
	};
	public void Show()
	{
		sw.SwitchOff();
		sw.SwitchOn();
	}
	public static void main(String[] args)
	{
		POAICOuterDemo o = new POAICOuterDemo();
		o.Show();

	}

}
