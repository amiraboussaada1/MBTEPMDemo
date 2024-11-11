package mbtepmdemo.proxy;

public abstract class ComSapMbtepmdemoServiceManager
{
    private static mbtepmdemo.proxy.ComSapMbtepmdemoService service_;

    public static mbtepmdemo.proxy.ComSapMbtepmdemoService getService()
    {
        synchronized (ComSapMbtepmdemoServiceManager.class)
        {
            return ((mbtepmdemo.proxy.ComSapMbtepmdemoService)com.sap.cloud.server.odata.core.CheckProperty.isDefined(mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.class, "service (static)", mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.service_));
        }
    }

    public static void setService(final mbtepmdemo.proxy.ComSapMbtepmdemoService value)
    {
        synchronized (ComSapMbtepmdemoServiceManager.class)
        {
            mbtepmdemo.proxy.ComSapMbtepmdemoServiceManager.service_ = value;
        }
    }
}
