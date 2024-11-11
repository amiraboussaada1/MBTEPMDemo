// Note: This handler will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package mbtepmdemo.handler;

import com.sap.cloud.server.odata.*;

public class BusinessPartnerFilterHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private mbtepmdemo.MainServlet servlet;
    private mbtepmdemo.proxy.ComSapMbtepmdemoService service;

    public BusinessPartnerFilterHandler(mbtepmdemo.MainServlet servlet, mbtepmdemo.proxy.ComSapMbtepmdemoService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartnerFilter entity = (mbtepmdemo.proxy.BusinessPartnerFilter)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartnerFilter entity = (mbtepmdemo.proxy.BusinessPartnerFilter)entityValue;
        entity.setMustBeModified(true);
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartnerFilter entity = (mbtepmdemo.proxy.BusinessPartnerFilter)entityValue;
        service.deleteEntity(entity);
    }
}
