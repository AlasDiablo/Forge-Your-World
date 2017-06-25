package alasdiablo_rom279.forgeworld.proxy;

import alasdiablo_rom279.forgeworld.init.inititems;

public class client implements common{

	@Override
	public void init() {
		inititems.registerRenders();
	}

}
