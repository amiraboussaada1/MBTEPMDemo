package mbtepmdemo.proxy.internal;

public abstract class Any_as_mbtepmdemo_proxy_BusinessPartner
{
    public static mbtepmdemo.proxy.BusinessPartner cast(final Object value)
    {
        if (value instanceof mbtepmdemo.proxy.BusinessPartner)
        {
            final mbtepmdemo.proxy.BusinessPartner var_value = ((mbtepmdemo.proxy.BusinessPartner)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.BusinessPartner");
        }
    }
}
