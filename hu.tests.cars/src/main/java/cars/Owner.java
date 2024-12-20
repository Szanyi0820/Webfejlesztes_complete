package cars;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner {
	private OwnerProperties properties;

	public OwnerProperties getProperties( ) {
		return properties;
	}

	public void setProperties( OwnerProperties properties ) {
		this.properties = properties;
	}

	public static class OwnerProperties {
		private String name;
		private String email;

		private String plateNumber;

		private String contactNumber; // Changed from contact_number

		public String getName( ) {
			return name;
		}

		public void setName( String name ) {
			this.name = name;
		}

		public String getPlateNumber( ) {
			return plateNumber;
		}

		public void setPlateNumber( String plateNumber ) {
			this.plateNumber = plateNumber;
		}

		public String getEmail( ) {
			return email;
		}

		public void setEmail( String email ) {
			this.email = email;
		}

		@JsonProperty( "contact_number" )
		public String getContactNumber( ) {
			return contactNumber;
		}

		@JsonProperty( "contact_number" )
		public void setContactNumber( String contactNumber ) {
			this.contactNumber = contactNumber;
		}

		@Override
		public String toString( ) {
			return "Properties{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", plateNumber='" + plateNumber + '\'' + ", contactNumber='" + contactNumber + '\'' + '}';
		}
	}
}
