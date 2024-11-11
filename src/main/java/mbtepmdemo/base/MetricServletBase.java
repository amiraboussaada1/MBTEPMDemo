// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MetricServlet class in the parent folder.

package mbtepmdemo.base;

import com.sap.cloud.server.odata.*;

public abstract class MetricServletBase extends com.sap.cloud.server.odata.metrics.MetricServlet {
    private static final long serialVersionUID = 1L;

    public com.sap.cloud.server.odata.metrics.MetricService service;

    public SQLDatabaseProvider provider;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        this.setStreamBatchResponses(true);
        this.setStreamPlainResponses(true);
        this.setRequiresAuthentication(true);
        provider = new SQLDatabaseProvider("MbtEpmDemoService.metrics", "jdbc:h2:file:./MbtEpmDemoService.metrics.h2");
        provider.setCacheDatabase(true);
        provider.setMetricProvider(true);
        provider.setCanModifySchema(getBooleanSetting(mbtepmdemo.ProviderSettings.class, "CAN_MODIFY_SCHEMA", true));
        boolean trace = getBooleanSetting(mbtepmdemo.MetricServlet.class, "TRACE_METRIC_SERVLET", false);
        boolean debug = trace || getBooleanSetting(mbtepmdemo.MetricServlet.class, "DEBUG_METRIC_SERVLET", false);
        this.setTraceRequests(debug);
        this.setTraceWithData(trace);
        this.setPrettyTracing(trace);
        trace = getBooleanSetting(mbtepmdemo.MetricServlet.class, "TRACE_METRIC_SERVICE", false);
        debug = trace || getBooleanSetting(mbtepmdemo.MetricServlet.class, "DEBUG_METRIC_SERVICE", false);
        provider.setTraceRequests(debug);
        provider.setTraceWithData(trace);
        StorageOptions options = provider.getStorageOptions();
        options.setQuotedIdentifiers(true);
        options.setSchemaVersion("1.0");
        options.setTablePrefix("MbtEpmDemoService_");
        options.setTableSuffix("_1_0");
        mbtepmdemo.ProviderSettings.init(provider);
        service = new com.sap.cloud.server.odata.metrics.MetricService(provider);
        com.sap.cloud.server.odata.csdl.CsdlDocument metadata = service.getMetadata();
        metadata.applyAnnotations();
        metadata.removeReferences("Security,SQL");
        super.init(config, provider);
    }
}
