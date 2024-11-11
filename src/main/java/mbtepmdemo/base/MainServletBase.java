// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package mbtepmdemo.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    private static final boolean HAS_IMPORTED_SETS = false;

    public com.sap.cloud.server.odata.core.ThreadShutdown shutdown = new com.sap.cloud.server.odata.core.ThreadShutdown();

    public SQLDatabaseProvider provider;

    public mbtepmdemo.proxy.ComSapMbtepmdemoService service;

    public mbtepmdemo.HeaderProvider headerProvider;

    // logger for client interactions
    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("odata.server");

    // logger for cache database interactions
    public org.slf4j.Logger serviceLogger = org.slf4j.LoggerFactory.getLogger("odata.sql.my-database");

    public com.sap.cloud.server.odata.http.HttpDestination HTTP_DESTINATION_ES5;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        DataServlet.setCurrentServlet(this);
        this.setServiceName("MbtEpmDemoService");
        this.startMemoryMonitor(getIntegerSetting(mbtepmdemo.ProviderSettings.class, "MEMORY_MONITOR_INTERVAL", 10));
        this.checkServerRuntime("sap.cf");
        this.setTraceRequests(logger.isDebugEnabled());
        this.setTraceWithData(logger.isTraceEnabled());
        this.setPrettyTracing(mbtepmdemo.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setStreamBatchResponses(true);
        this.setStreamDeltaResponses(true);
        this.setStreamPlainResponses(true);
        this.setTrackChangesByDefault(false);
        this.setRequiresAuthentication(true);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(true);
        provider = new SQLDatabaseProvider("MbtEpmDemoService", "jdbc:h2:file:./MbtEpmDemoService.h2");
        provider.setTraceRequests(serviceLogger.isDebugEnabled());
        provider.setTraceWithData(serviceLogger.isTraceEnabled());
        provider.setCacheDatabase(true);
        provider.setCanModifySchema(getBooleanSetting(mbtepmdemo.ProviderSettings.class, "CAN_MODIFY_SCHEMA", true) && !HAS_IMPORTED_SETS);
        provider.setSelectAfterCreate(false);
        provider.setSelectAfterUpdate(false);
        provider.setEnableRowVersioning(true);
        provider.setMaintainVersionColumns(true);
        provider.setEnableChangeTracking(true);
        provider.setMaintainTrackingColumns(true);
        provider.setEnableKeyTracking(true);
        provider.setFlattenComplexProperties(true);
        provider.setGenerateForeignKeyConstraints(false);
        provider.setGenerateUniqueConstraints(false);
        provider.setDailyTableMetricsAt(LocalTime.of(3, 5, 0));
        StorageOptions options = provider.getStorageOptions();
        options.setQuotedIdentifiers(true);
        options.setSchemaVersion("1.0");
        options.setTablePrefix("MbtEpmDemoService_");
        options.setTableSuffix("_1_0");
        mbtepmdemo.ProviderSettings.init((mbtepmdemo.MainServlet)this);
        mbtepmdemo.ProviderSettings.init(provider);
        service = new mbtepmdemo.proxy.ComSapMbtepmdemoService(provider);
        headerProvider = mbtepmdemo.HeaderProvider.getInstance();
        headerProvider.servlet = (mbtepmdemo.MainServlet)this;
        headerProvider.service = service;
        HTTP_DESTINATION_ES5 = com.sap.cloud.server.odata.http.HttpDestination.lookup("ES5");
        com.sap.cloud.server.odata.csdl.CsdlDocument metadata = service.getMetadata();
        metadata.setLogger(this.getLogger());
        metadata.addCacheHandling();
        metadata.addDeltaHandling();
        metadata.addRepeatability();
        metadata.inheritAnnotations();
        metadata.applyAnnotations();
        metadata.removeServerOnly("SQL");
        metadata.removeReferences("Cache,HTTP,Security,SQL");
        this.addMetadataCapabilities();
        this.finalizeCompactMetadata();
        if (!provider.getCanModifySchema()) {
            provider.openSchemaWithRetryLoop();
        }
        else {
            provider.createSchemaWithRetryLoop(); // if not existing already
        }
        provider.startClientExpiryThread(shutdown);
        provider.startDeltaCleanupThread(shutdown);
        provider.startTableMetricsThread(shutdown);
        RegisterHandlers.withServlet((mbtepmdemo.MainServlet)this);
        RegisterListeners.withServlet((mbtepmdemo.MainServlet)this);
        RegisterHandlers.startRefresh((mbtepmdemo.MainServlet)this);
        this.logInfo("Started OData service");
        DataServlet.setCurrentServlet(null);
    }

    public void destroy() {
        shutdown.signal();
        this.logInfo("Stopped OData service");
    }

    public DataService getDataService() {
        return service;
    }
}
