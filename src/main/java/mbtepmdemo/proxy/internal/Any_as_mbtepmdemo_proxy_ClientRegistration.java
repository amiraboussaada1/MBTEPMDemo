package mbtepmdemo.proxy.internal;

public abstract class Any_as_mbtepmdemo_proxy_ClientRegistration
{
    public static mbtepmdemo.proxy.ClientRegistration cast(final Object value)
    {
        if (value instanceof mbtepmdemo.proxy.ClientRegistration)
        {
            final mbtepmdemo.proxy.ClientRegistration var_value = ((mbtepmdemo.proxy.ClientRegistration)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.ClientRegistration");
        }
    }
}
