package mbtepmdemo.proxy;

public class BusinessPartner
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property addressType = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("AddressType");

    public static final com.sap.cloud.server.odata.Property building = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Building");

    public static final com.sap.cloud.server.odata.Property city = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property postalCode = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property street = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("Street");

    public static final com.sap.cloud.server.odata.Property businessPartnerID = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("BusinessPartnerID");

    public static final com.sap.cloud.server.odata.Property businessPartnerRole = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("BusinessPartnerRole");

    public static final com.sap.cloud.server.odata.Property companyName = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("CompanyName");

    public static final com.sap.cloud.server.odata.Property faxNumber = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("FaxNumber");

    public static final com.sap.cloud.server.odata.Property legalForm = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("LegalForm");

    public static final com.sap.cloud.server.odata.Property phoneNumber = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("PhoneNumber");

    public static final com.sap.cloud.server.odata.Property toSalesOrders = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.getProperty("ToSalesOrders");

    public BusinessPartner()
    {
        this(true, null);
    }

    public BusinessPartner(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BusinessPartner(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner, withIndexMap);
    }

    public mbtepmdemo.proxy.BusinessPartner copy()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartner.cast(this.copyEntity());
    }

    public String getAddressType()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.addressType));
    }

    public String getBuilding()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.building));
    }

    public long getBusinessPartnerID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.businessPartnerID));
    }

    public String getBusinessPartnerRole()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.businessPartnerRole));
    }

    public String getCity()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.city));
    }

    public String getCompanyName()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.companyName));
    }

    public String getCountry()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.country));
    }

    public String getFaxNumber()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.faxNumber));
    }

    public String getLegalForm()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.legalForm));
    }

    public mbtepmdemo.proxy.BusinessPartner getOld()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartner.cast(this.getOldEntity());
    }

    public String getPhoneNumber()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.phoneNumber));
    }

    public String getPostalCode()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.postalCode));
    }

    public String getStreet()
    {
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.street));
    }

    public mbtepmdemo.proxy.SalesOrderList getToSalesOrders()
    {
        return mbtepmdemo.proxy.SalesOrderList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(mbtepmdemo.proxy.BusinessPartner.toSalesOrders)));
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long businessPartnerID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("BusinessPartnerID", com.sap.cloud.server.odata.LongValue.of(businessPartnerID));
    }

    public static mbtepmdemo.proxy.BusinessPartnerList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return mbtepmdemo.proxy.BusinessPartnerList.share(from);
    }

    public void setAddressType(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.addressType, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBuilding(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.building, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setBusinessPartnerID(final long value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.businessPartnerID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setBusinessPartnerRole(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.businessPartnerRole, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCity(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCompanyName(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.companyName, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setFaxNumber(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.faxNumber, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setLegalForm(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.legalForm, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPhoneNumber(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.phoneNumber, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setPostalCode(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.postalCode, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setStreet(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartner.street, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setToSalesOrders(final mbtepmdemo.proxy.SalesOrderList value)
    {
        mbtepmdemo.proxy.BusinessPartner.toSalesOrders.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
