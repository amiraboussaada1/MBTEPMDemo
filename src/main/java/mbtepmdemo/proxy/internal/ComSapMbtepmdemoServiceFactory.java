package mbtepmdemo.proxy.internal;

public abstract class ComSapMbtepmdemoServiceFactory
{
    public static void registerAll()
    {
        mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress.registerFactory(new mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateCTAddress());
        mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartner.registerFactory(new mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateBusinessPartner());
        mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter.registerFactory(new mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateBusinessPartnerFilter());
        mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration.registerFactory(new mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateClientRegistration());
        mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.salesOrder.registerFactory(new mbtepmdemo.proxy.internal.ComSapMbtepmdemoServiceFactory.CreateSalesOrder());
    }

    public static class CreateCTAddress
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new mbtepmdemo.proxy.CTAddress(false);
        }
    }

    public static class CreateBusinessPartner
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new mbtepmdemo.proxy.BusinessPartner(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new mbtepmdemo.proxy.BusinessPartner(false, indexMap);
        }
    }

    public static class CreateBusinessPartnerFilter
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new mbtepmdemo.proxy.BusinessPartnerFilter(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new mbtepmdemo.proxy.BusinessPartnerFilter(false, indexMap);
        }
    }

    public static class CreateClientRegistration
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new mbtepmdemo.proxy.ClientRegistration(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new mbtepmdemo.proxy.ClientRegistration(false, indexMap);
        }
    }

    public static class CreateSalesOrder
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new mbtepmdemo.proxy.SalesOrder(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new mbtepmdemo.proxy.SalesOrder(false, indexMap);
        }
    }
}
