package com.siddhart.utils;

import java.util.Random;

import com.siddhart.bean.Parent;
import com.siddhart.domain.UserDetails;

public class Collection {

	public UserDetails collection(Parent p)
	{
		
		UserDetails ud = new UserDetails();
		
		ud.setApplicationUuid(p.getApplicationUuid());
		
		if(p.getPayload().getCompany() != null)
		{
		ud.setCompanyCountry(p.getPayload().getCompany().getCountry());
		ud.setCompanyExternalId(p.getPayload().getCompany().getExternalId());
		ud.setCompanyName(p.getPayload().getCompany().getName());
		ud.setCompanyPhnNumber(p.getPayload().getCompany().getPhoneNumber());
		ud.setCompanyWebsite(p.getPayload().getCompany().getWebsite());
		ud.setCompanyemail(p.getPayload().getCompany().getEmail());
		}
		
		if(p.getPayload().getOrder() != null)
		{
		ud.setEditionCode(p.getPayload().getOrder().getEditionCode());
		ud.setPricingDuraciton(p.getPayload().getOrder().getPricingDuration());
		}
		
		ud.setUuid(p.getCreator().getUuid());
		
		if(p.getPayload().getAccount()!=null)
		{
		ud.setAccountIdentifier(p.getPayload().getAccount().getAccountIdentifier());
		}
		else
		{
			Random rand = new Random();

			int  n = rand.nextInt(50) + 1;
			ud.setAccountIdentifier(""+n);
			
		}
		ud.setEmail(p.getCreator().getEmail());
		ud.setAddress(p.getCreator().getAddress());
		ud.setFirstName(p.getCreator().getFirstName());
		ud.setFlag(p.getFlag());
		ud.setLanguage(p.getCreator().getLanguage());
		ud.setLastName(p.getCreator().getLastName());
		
		return ud;	
		
	}
}
