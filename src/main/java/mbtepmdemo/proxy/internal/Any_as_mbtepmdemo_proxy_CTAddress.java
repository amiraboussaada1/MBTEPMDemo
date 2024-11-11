package mbtepmdemo.proxy.internal;

public abstract class Any_as_mbtepmdemo_proxy_CTAddress
{
    public static mbtepmdemo.proxy.CTAddress cast(final Object value)
    {
        if (value instanceof mbtepmdemo.proxy.CTAddress)
        {
            final mbtepmdemo.proxy.CTAddress var_value = ((mbtepmdemo.proxy.CTAddress)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "mbtepmdemo.proxy.CTAddress");
        }
    }
}
