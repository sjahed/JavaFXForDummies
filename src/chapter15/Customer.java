package chapter15;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {

	private final StringProperty firstName =
			new SimpleStringProperty(this, "firstName","");	
	
	ReadOnlyIntegerWrapper customerNumber =
			new ReadOnlyIntegerWrapper(this,"customerNumber",0);
	
	public final Integer getCustomerNumber(){
		return customerNumber.get();
	}
	
	public final ReadOnlyIntegerProperty customerNumberProperty(){
		return customerNumber.getReadOnlyProperty();
	}
	
	public final StringProperty firstNameProperty(){
		return firstName;
	}
	public final String getFirstName(){
		return firstName.get();
	}
	public final void setFirstName(String value){
		firstName.set(value);
	}
	
	
}
