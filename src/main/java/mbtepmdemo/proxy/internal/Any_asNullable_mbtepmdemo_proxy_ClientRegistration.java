package mbtepmdemo.proxy.internal;

public abstract class Any_asNullable_mbtepmdemo_proxy_ClientRegistration
{
    public static mbtepmdemo.proxy.ClientRegistration cast(final Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof mbtepmdemo.proxy.ClientRegistration)
        {
            final mbtepmdemo.proxy.ClientRegistration var2_value = ((mbtepmdemo.proxy.ClientRegistration)value);
            return var2_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.ClientRegistration");
        }
    }
}
