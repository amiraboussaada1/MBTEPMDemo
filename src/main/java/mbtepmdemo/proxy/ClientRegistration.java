package mbtepmdemo.proxy;

public class ClientRegistration
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property authorizedUser = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("AuthorizedUser");

    public static final com.sap.cloud.server.odata.Property clientGUID = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientGUID");

    public static final com.sap.cloud.server.odata.Property clientID = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.getProperty("ClientID");

    public ClientRegistration()
    {
        this(true, null);
    }

    public ClientRegistration(final boolean withDefaults)
    {
        this(withDefaults, null);
    }

    public ClientRegistration(final boolean withDefaults, final com.sap.cloud.server.odata.core.SparseIndexMap withIndexMap)
    {
        super(withDefaults, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration, withIndexMap);
    }

    public mbtepmdemo.proxy.ClientRegistration copy()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.copyEntity());
    }

    public String getAuthorizedUser()
    {
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(mbtepmdemo.proxy.ClientRegistration.authorizedUser));
    }

    public com.sap.cloud.server.odata.GuidValue getClientGUID()
    {
        return com.sap.cloud.server.odata.GuidValue.castRequired(this.getDataValue(mbtepmdemo.proxy.ClientRegistration.clientGUID));
    }

    public long getClientID()
    {
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(mbtepmdemo.proxy.ClientRegistration.clientID));
    }

    public mbtepmdemo.proxy.ClientRegistration getOld()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.getOldEntity());
    }

    @Override public boolean isProxy()
    {
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long clientID)
    {
        return new com.sap.cloud.server.odata.EntityKey().with("ClientID", com.sap.cloud.server.odata.LongValue.of(clientID));
    }

    public static mbtepmdemo.proxy.ClientRegistrationList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        return mbtepmdemo.proxy.ClientRegistrationList.share(from);
    }

    public void setAuthorizedUser(final String value)
    {
        this.setDataValue(mbtepmdemo.proxy.ClientRegistration.authorizedUser, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setClientGUID(final com.sap.cloud.server.odata.GuidValue value)
    {
        this.setDataValue(mbtepmdemo.proxy.ClientRegistration.clientGUID, value);
    }

    public void setClientID(final long value)
    {
        this.setDataValue(mbtepmdemo.proxy.ClientRegistration.clientID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
