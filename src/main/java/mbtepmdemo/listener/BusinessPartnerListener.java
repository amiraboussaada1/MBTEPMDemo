// Note: This listener will be overwritten if the service is regenerated.
// To allow customization and avoid overwriting upon service regeneration,
// please delete this comment.

package mbtepmdemo.listener;

import com.sap.cloud.server.odata.*;

public class BusinessPartnerListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private mbtepmdemo.MainServlet servlet;
    private mbtepmdemo.proxy.ComSapMbtepmdemoService service;

    public BusinessPartnerListener(mbtepmdemo.MainServlet servlet, mbtepmdemo.proxy.ComSapMbtepmdemoService service) {
        super();
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public void beforeQuery(DataQuery query) {
        allowUnused(query);
    }

    public void beforeSave(EntityValue entityValue) {
        // Shared code for beforeCreate / beforeUpdate.
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        mbtepmdemo.proxy.BusinessPartner entity = (mbtepmdemo.proxy.BusinessPartner)entityValue;
        allowUnused(entity);
    }
}
