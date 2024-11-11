// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package mbtepmdemo.base;

import com.sap.cloud.server.odata.*;

public class RegisterHandlers {
    public static EntityHandler handler_BusinessPartner;
    public static EntityHandler handler_BusinessPartnerFilter;
    public static EntityHandler handler_ClientRegistration;
    public static EntityHandler handler_SalesOrder;

    public static void withServlet(mbtepmdemo.MainServlet servlet) {
        mbtepmdemo.proxy.ComSapMbtepmdemoService service = (mbtepmdemo.proxy.ComSapMbtepmdemoService)servlet.getBackendService();
        handler_SalesOrder = new mbtepmdemo.handler.SalesOrderHandler(servlet, service);
        handler_ClientRegistration = new mbtepmdemo.handler.ClientRegistrationHandler(servlet, service);
        handler_BusinessPartnerFilter = new mbtepmdemo.handler.BusinessPartnerFilterHandler(servlet, service);
        handler_BusinessPartner = new mbtepmdemo.handler.BusinessPartnerHandler(servlet, service);
        servlet.registerEntityHandler(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder, handler_SalesOrder);
        servlet.registerEntityHandler(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration, handler_ClientRegistration);
        servlet.registerEntityHandler(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter, handler_BusinessPartnerFilter);
        servlet.registerEntityHandler(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner, handler_BusinessPartner);
    }

    public static void startRefresh(mbtepmdemo.MainServlet servlet) {
        servlet.createRefreshSemaphores();
        servlet.startCacheRefreshThread(handler_SalesOrder, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.salesOrderSet, servlet.shutdown);
        servlet.startCacheRefreshThread(handler_BusinessPartner, mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntitySets.businessPartnerSet, servlet.shutdown);
    }
}
