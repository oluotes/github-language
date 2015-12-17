package com.winteam.language.customerservice;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Address")
public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Street 1")
   private java.lang.String street1;
   @org.kie.api.definition.type.Label(value = "Street 2")
   private java.lang.String street2;
   @org.kie.api.definition.type.Label(value = "City")
   private java.lang.String city;
   @org.kie.api.definition.type.Label(value = "State")
   private java.lang.String state;
   @org.kie.api.definition.type.Label(value = "Postal Code")
   private java.lang.String postalCode;
   @org.kie.api.definition.type.Label(value = "Country")
   private java.lang.String country;

   public address()
   {
   }

   public java.lang.String getStreet1()
   {
      return this.street1;
   }

   public void setStreet1(java.lang.String street1)
   {
      this.street1 = street1;
   }

   public java.lang.String getStreet2()
   {
      return this.street2;
   }

   public void setStreet2(java.lang.String street2)
   {
      this.street2 = street2;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getPostalCode()
   {
      return this.postalCode;
   }

   public void setPostalCode(java.lang.String postalCode)
   {
      this.postalCode = postalCode;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public address(java.lang.String street1, java.lang.String street2,
         java.lang.String city, java.lang.String state,
         java.lang.String postalCode, java.lang.String country)
   {
      this.street1 = street1;
      this.street2 = street2;
      this.city = city; 
      this.state = state;
      this.postalCode = postalCode;
      this.country = country;
   }
   
   public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2
				+ ", city=" + city + ", state=" + state + ", postalCode="
				+ postalCode + ", country=" + country + "]";
	}

}