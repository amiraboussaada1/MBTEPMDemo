package mbtepmdemo.proxy;

public abstract class ComSapMbtepmdemoServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.registerAll();
        mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.setGeneratedProxies(true);
        return mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.immortalize();
    }

    public abstract static class ComplexTypes
    {
        public static final com.sap.cloud.server.odata.ComplexType ctAddress = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getComplexType("mbtepmdemo.CT_Address");
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType businessPartner = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("mbtepmdemo.BusinessPartner");

        public static final com.sap.cloud.server.odata.EntityType businessPartnerFilter = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("mbtepmdemo.BusinessPartnerFilter");

        public static final com.sap.cloud.server.odata.EntityType clientRegistration = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("mbtepmdemo.ClientRegistration");

        public static final com.sap.cloud.server.odata.EntityType salesOrder = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntityType("mbtepmdemo.SalesOrder");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet businessPartnerFilterSet = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerFilterSet");

        public static final com.sap.cloud.server.odata.EntitySet businessPartnerSet = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("BusinessPartnerSet");

        public static final com.sap.cloud.server.odata.EntitySet clientRegistrationSet = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("ClientRegistrationSet");

        public static final com.sap.cloud.server.odata.EntitySet salesOrderSet = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parsed.getEntitySet("SalesOrderSet");
    }
}
