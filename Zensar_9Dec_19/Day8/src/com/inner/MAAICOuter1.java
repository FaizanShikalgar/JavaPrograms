package com.inner;
//this is the demo of Argument Defined Anonymous Inner Classes Flavor II 
public class MAAICOuter1 
{
    public void Show(Switchable sw)
    {
    	sw.SwitchOn();
    	sw.SwitchOff();
    	
    }
	public static void main(String[] args)
	{
		MAAICOuter1 m = new MAAICOuter1();
		m.Show(new Switchable(){
			public void SwitchOn()
			{
				System.out.println("Device Switched On");
			}
			public void SwitchOff()
			{
				System.out.println("Device Switched Off");
			}
		});

	}

}
