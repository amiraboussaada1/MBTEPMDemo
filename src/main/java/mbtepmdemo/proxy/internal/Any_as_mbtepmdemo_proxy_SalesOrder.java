package mbtepmdemo.proxy.internal;

public abstract class Any_as_mbtepmdemo_proxy_SalesOrder
{
    public static mbtepmdemo.proxy.SalesOrder cast(final Object value)
    {
        if (value instanceof mbtepmdemo.proxy.SalesOrder)
        {
            final mbtepmdemo.proxy.SalesOrder var_value = ((mbtepmdemo.proxy.SalesOrder)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.SalesOrder");
        }
    }
}
