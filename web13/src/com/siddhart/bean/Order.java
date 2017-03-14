package com.siddhart.bean;

import java.util.List;

public class Order {
	
		private String editionCode;
		private String addonOfferingCode;
		private String pricingDuration;
		private List<Items> items;
		private List<String> customAttributes;
		
			public String getEditionCode() {
				return editionCode;
			}
			public void setEditionCode(String editionCode) {
				this.editionCode = editionCode;
			}
			public String getAddonOfferingCode() {
				return addonOfferingCode;
			}
			public void setAddonOfferingCode(String addonOfferingCode) {
				this.addonOfferingCode = addonOfferingCode;
			}
			public String getPricingDuration() {
				return pricingDuration;
			}
			public void setPricingDuration(String pricingDuration) {
				this.pricingDuration = pricingDuration;
			}
			public List<Items> getItems() {
				return items;
			}
			public void setItems(List<Items> items) {
				this.items = items;
			}
			public List<String> getCustomAttributes() {
				return customAttributes;
			}
			public void setCustomAttributes(List<String> customAttributes) {
				this.customAttributes = customAttributes;
			}
						
}
