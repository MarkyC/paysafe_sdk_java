package com.paysafe.threedsecureV2;

import com.google.gson.annotations.Expose;
import com.paysafe.common.AddressDetails;
import com.paysafe.common.Carrier;
import com.paysafe.common.ShipMethod;
import com.paysafe.common.impl.AddressContainer;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

/**
 * The Class ShippingDetails.
 */
public class ShippingDetails extends AddressContainer implements DomainObject {

	/** The carrier. */
	  @Expose
	  private Carrier carrier;
	  
	  /** The ship method. */
	  @Expose
	  private ShipMethod shipMethod;
	  
	  /** The recipient name. */
	  @Expose
	  private String recipientName;
	  
	  /** The company. */
	  @Expose
	  private String company;
	  
	  /** The street. */
	  @Expose
	  private String street;
	  
	  /** The street2. */
	  @Expose
	  private String street2;
	  
	  /** The city. */
	  @Expose
	  private String city;
	  
	  /** The state. */
	  @Expose
	  private String state;
	  
	  /** The country. */
	  @Expose
	  private Country country;
	  
	  /** The zip. */
	  @Expose
	  private String zip;
	  

	  /**
	   * Gets the recipient name.
	   *
	   * @return the recipient name
	   */
	  public final String getRecipientName() {
	    return recipientName;
	  }

	  /**
	   * Sets the recipient name.
	   *
	   * @param recipientName the new recipient name
	   */
	  public final void setRecipientName(final String recipientName) {
	    this.recipientName = recipientName;
	  }
	  
	  /**
	   * Gets the ship method.
	   *
	   * @return the ship method
	   */
	  public final ShipMethod  getShipMethod() {
		  return shipMethod;
		}
	  
	  /**
	   * Sets the ship method.
	   *
	   * @param shipMethod the new ship method
	   */
	  public final void setShipMethod(final ShipMethod shipMethod) {
		    this.shipMethod = shipMethod;
		  }

	  /**
	   * Gets the carrier.
	   *
	   * @return the carrier
	   */
	  public final Carrier getCarrier() {
	    return carrier;
	  }

	  /**
	   * Sets the carrier.
	   *
	   * @param carrier the new carrier
	   */
	  public final void setCarrier(final Carrier carrier) {
	    this.carrier = carrier;
	  }
	  
	  /**
	   * Gets the street.
	   *
	   * @return the street
	   */
	  public final String getStreet() {
		    return street;
		  }

	  /**
	   * Sets the street.
	   *
	   * @param street the new street
	   */
	  public final void setStreet(final String street) {
		    this.street = street;
		  }
	  
	  /**
	   * Gets the street2.
	   *
	   * @return the street2
	   */
	  public final String getStreet2() {
		    return street2;
		  }

	  /**
	   * Sets the street2.
	   *
	   * @param street2 the new street2
	   */
	  public final void setStreet2(final String street2) {
		    this.street2 = street2;
		  }
	  
	  /**
	   * Gets the city.
	   *
	   * @return the city
	   */
	  public final String getCity() {
		    return city;
		  }

	  /**
	   * Sets the city.
	   *
	   * @param city the new city
	   */
	  public final void setCity(final String city) {
		    this.city = city;
		  }
	  
	  /**
	   * Gets the state.
	   *
	   * @return the state
	   */
	  public final String getState() {
		    return state;
		  }

	  /**
	   * Sets the state.
	   *
	   * @param state the new state
	   */
	  public final void setState(final String state) {
		    this.state = state;
		  }
	  
	   /**
	    * Gets the country.
	    *
	    * @return the country
	    */
	   public final Country getCountry() {
		    return country;
		  }

	   /**
	    * Sets the country.
	    *
	    * @param country the new country
	    */
	   public final void setCountry(final Country country) {
		    this.country = country;
		  }
	  
	  /**
	   * Gets the zip.
	   *
	   * @return the zip
	   */
	  public final String getZip() {
		    return zip;
		  }

	  /**
	   * Sets the zip.
	   *
	   * @param zip the new zip
	   */
	  public final void setZip(final String zip) {
		    this.zip = zip;
		  }

	  /**
	   * Gets the company.
	   *
	   * @return the company
	   */
	  public String getCompany() {
			return company;
		}
	  /**
	   * Sets the company.
	   *
	   * @param company the new company
	   */
		public void setCompany(String company) {
			this.company = company;
		}
	  /**
	   * The sub-builder class for ShippingDetails.
	   *
	   * @param <BLDRT> the parent builder
	   */
	  public static class ShippingDetailsBuilder<BLDRT extends GenericBuilder> extends
	          NestedBuilder<ShippingDetails, BLDRT> {

	    /** The shipping details. */
	    private final ShippingDetails shippingDetails = new ShippingDetails();
	    
	    /** The address details. */
	    private AddressDetails addressDetails = new AddressDetails();

	    /**
	     * Instantiates a new shipping details builder.
	     *
	     * @param parent the parent
	     */
	    public ShippingDetailsBuilder(final BLDRT parent) {
	      super(parent);
	    }

	    /**
	     * Instantiates a new shipping details builder.
	     *
	     * @param parent the parent
	     * @param a the a
	     */
	    public ShippingDetailsBuilder(
	            final BLDRT parent,
	            com.paysafe.customervault.Address a) {
	      super(parent);
	      if (null != a.getAddressDetails()) {
	        addressDetails = a.getAddressDetails();
	      }
	      shippingDetails.setRecipientName(a.getRecipientName());
	    }

	    /**
	     * Build this ShippingDetails object.
	     *
	     * @return shippingDetails
	     */
	    @Override
	    public final ShippingDetails build() {
	      shippingDetails.setAddressDetails(addressDetails);
	      return shippingDetails;
	    }

	    /**
	     * Set the street property.
	     *
	     * @param street the street
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> street(final String street) {
	      addressDetails.setStreet(street);
	      return this;
	    }

	    /**
	     * Set the street2 property.
	     *
	     * @param street2 the street2
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> street2(final String street2) {
	      addressDetails.setStreet2(street2);
	      return this;
	    }

	    /**
	     * Set the city property.
	     *
	     * @param city the city
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> city(final String city) {
	      addressDetails.setCity(city);
	      return this;
	    }

	    /**
	     * Set the state property.
	     *
	     * @param state the state
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> state(final String state) {
	      addressDetails.setState(state);
	      return this;
	    }

	    /**
	     * Set the country property.
	     *
	     * @param country the country
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> country(final String country) {
	      addressDetails.setCountry(country);
	      return this;
	    }

	    /**
	     * Set the zip property.
	     *
	     * @param zip the zip
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> zip(final String zip) {
	      addressDetails.setZip(zip);
	      return this;
	    }


	    /**
	     * Set the carrier property.
	     *
	     * @param carrier the carrier
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> carrier(final Carrier carrier) {
	      shippingDetails.setCarrier(carrier);
	      return this;
	    }

	    /**
	     * Set the shipMethod property.
	     *
	     * @param string the ship method
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> shipMethod(final ShipMethod shipMethod) {
	      shippingDetails.setShipMethod(shipMethod);
	      return this;
	    }
	    /**
	     * Set the company property.
	     *
	     * @param company the company
	     * @return ShippingDetailsBuilder< BLDRT >
	     */
	    public final ShippingDetailsBuilder<BLDRT> company(final String company){
	    	shippingDetails.setCompany(company);
			return this;
	    }
	  }
	}
