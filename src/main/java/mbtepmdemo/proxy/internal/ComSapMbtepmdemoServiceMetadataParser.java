package mbtepmdemo.proxy.internal;

public abstract class ComSapMbtepmdemoServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceMetadataText.XML, "mbtepmdemo");
        metadata.setProxyVersion("24.7.1");
        return metadata;
    }
}
