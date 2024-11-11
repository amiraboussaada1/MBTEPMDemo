// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package mbtepmdemo.base;

import com.sap.cloud.server.odata.*;

public class RegisterListeners {
    public static EntityListener listener_BusinessPartner;
    public static EntityListener listener_BusinessPartnerFilter;
    public static EntityListener listener_ClientRegistration;
    public static EntityListener listener_SalesOrder;

    public static void withServlet(mbtepmdemo.MainServlet servlet) {
        mbtepmdemo.proxy.ComSapMbtepmdemoService service = (mbtepmdemo.proxy.ComSapMbtepmdemoService)servlet.getDataService();
        listener_BusinessPartner = new mbtepmdemo.listener.BusinessPartnerListener(servlet, service);
        listener_BusinessPartnerFilter = new mbtepmdemo.listener.BusinessPartnerFilterListener(servlet, service);
        listener_ClientRegistration = new mbtepmdemo.listener.ClientRegistrationListener(servlet, service);
        listener_SalesOrder = new mbtepmdemo.listener.SalesOrderListener(servlet, service);
        servlet.registerEntityListener(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner, listener_BusinessPartner);
        servlet.registerEntityListener(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter, listener_BusinessPartnerFilter);
        servlet.registerEntityListener(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration, listener_ClientRegistration);
        servlet.registerEntityListener(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder, listener_SalesOrder);
    }
}
