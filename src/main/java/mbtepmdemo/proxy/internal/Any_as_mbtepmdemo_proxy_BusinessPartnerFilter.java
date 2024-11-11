package mbtepmdemo.proxy.internal;

public abstract class Any_as_mbtepmdemo_proxy_BusinessPartnerFilter
{
    public static mbtepmdemo.proxy.BusinessPartnerFilter cast(final Object value)
    {
        if (value instanceof mbtepmdemo.proxy.BusinessPartnerFilter)
        {
            final mbtepmdemo.proxy.BusinessPartnerFilter var_value = ((mbtepmdemo.proxy.BusinessPartnerFilter)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.BusinessPartnerFilter");
        }
    }
}
