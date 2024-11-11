package mbtepmdemo.proxy;

public class CTAddress
    extends com.sap.cloud.server.odata.ComplexValue
{
    public static final com.sap.cloud.server.odata.Property addressType = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("AddressType");

    public static final com.sap.cloud.server.odata.Property building = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Building");

    public static final com.sap.cloud.server.odata.Property city = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property postalCode = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.getProperty("Street");

    public CTAddress()
    {
        this(true, null);
    }

    public CTAddress(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public CTAddress(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress, withIndexMap);
    }

    public mbtepmdemo.proxy.CTAddress copy()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.copyComplex());
    }

    public String getAddressType()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.addressType));
    }

    public String getBuilding()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.building));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.city));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.country));
    }

    public mbtepmdemo.proxy.CTAddress getOld()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.getOldComplex());
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.CTAddress.street));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static mbtepmdemo.proxy.CTAddressList list(final com.sap.cloud.server.odata.ComplexValueList from)
    {
        return mbtepmdemo.proxy.CTAddressList.share(from);
    }

    public void setAddressType(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.addressType, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBuilding(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.building, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.postalCode, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.CTAddress.street, com.sap.cloud.server.odata.StringValue.of(value));
    }
}
