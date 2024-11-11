package mbtepmdemo.proxy;

public class BusinessPartnerFilter
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property countryFilter = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.getProperty("CountryFilter");

    public static final com.sap.cloud.server.odata.Property filterID = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.getProperty("FilterID");

    public BusinessPartnerFilter()
    {
        this(true, null);
    }

    public BusinessPartnerFilter(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public BusinessPartnerFilter(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter, withIndexMap);
    }

    public mbtepmdemo.proxy.BusinessPartnerFilter copy()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.copyEntity());
    }

    public String getCountryFilter()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(mbtepmdemo.proxy.BusinessPartnerFilter.countryFilter));
    }

    public long getFilterID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(mbtepmdemo.proxy.BusinessPartnerFilter.filterID));
    }

    public mbtepmdemo.proxy.BusinessPartnerFilter getOld()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long filterID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("FilterID", com.sap.cloud.server.odata.LongValue.of(filterID));
    }

    public static mbtepmdemo.proxy.BusinessPartnerFilterList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return mbtepmdemo.proxy.BusinessPartnerFilterList.share(from);
    }

    public void setCountryFilter(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartnerFilter.countryFilter, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setFilterID(final long value)
    {
        this.setDataValue(mbtepmdemo.proxy.BusinessPartnerFilter.filterID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
