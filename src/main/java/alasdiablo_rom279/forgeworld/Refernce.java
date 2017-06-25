package alasdiablo_rom279.forgeworld;

public class Reference {
	
	public static enum FWItems {
		FLOUR("flour", "ItemFlour");
		
		private String unlocalizedName;
		private String registryName;
		
		FWItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}

}
