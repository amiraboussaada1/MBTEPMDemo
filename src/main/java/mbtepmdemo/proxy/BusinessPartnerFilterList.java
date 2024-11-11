package mbtepmdemo.proxy;

public class BusinessPartnerFilterList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<mbtepmdemo.proxy.BusinessPartnerFilter>
{
    public static final mbtepmdemo.proxy.BusinessPartnerFilterList empty = new mbtepmdemo.proxy.BusinessPartnerFilterList(java.lang.Integer.MIN_VALUE);

    public BusinessPartnerFilterList()
    {
        this(4);
    }

    public BusinessPartnerFilterList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final mbtepmdemo.proxy.BusinessPartnerFilterList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList addThis(final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.add(item);
        return this;
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList copy()
    {
        return this.slice(0);
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList filter(final com.sap.cloud.server.odata.core.Function1<mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = new mbtepmdemo.proxy.BusinessPartnerFilterList(n);
        // for (let item of this)
        {
            final mbtepmdemo.proxy.BusinessPartnerFilterList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final mbtepmdemo.proxy.BusinessPartnerFilter item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilter first()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().first());
    }

    public static mbtepmdemo.proxy.BusinessPartnerFilterList from(final java.util.List<mbtepmdemo.proxy.BusinessPartnerFilter> list)
    {
        return BusinessPartnerFilterList.share(new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.BusinessPartnerFilter>(list).toAnyList());
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilter get(final int index)
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final mbtepmdemo.proxy.BusinessPartnerFilter item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final mbtepmdemo.proxy.BusinessPartnerFilterList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<mbtepmdemo.proxy.BusinessPartnerFilter> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilter last()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.BusinessPartnerFilter item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static mbtepmdemo.proxy.BusinessPartnerFilterList of(final mbtepmdemo.proxy.BusinessPartnerFilter... items)
    {
        mbtepmdemo.proxy.BusinessPartnerFilterList rest_items = new mbtepmdemo.proxy.BusinessPartnerFilterList(items.length);
        for (mbtepmdemo.proxy.BusinessPartnerFilter items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public mbtepmdemo.proxy.BusinessPartnerFilterList reversed()
    {
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final mbtepmdemo.proxy.BusinessPartnerFilter item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static mbtepmdemo.proxy.BusinessPartnerFilterList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = new mbtepmdemo.proxy.BusinessPartnerFilterList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof mbtepmdemo.proxy.BusinessPartnerFilter)
                {
                    final mbtepmdemo.proxy.BusinessPartnerFilter var_item = ((mbtepmdemo.proxy.BusinessPartnerFilter)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilter single()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(this.getUntypedList().single());
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = new mbtepmdemo.proxy.BusinessPartnerFilterList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
    {
        this.sortWith(new mbtepmdemo.proxy.BusinessPartnerFilterList.OrderBy(increasing));
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList sorted()
    {
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.sort();
        return result;
    }

    public final mbtepmdemo.proxy.BusinessPartnerFilterList sortedBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
    {
        final mbtepmdemo.proxy.BusinessPartnerFilterList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.businessPartnerFilter);
    }

    public java.util.List<mbtepmdemo.proxy.BusinessPartnerFilter> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.BusinessPartnerFilter>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final mbtepmdemo.proxy.BusinessPartnerFilter a = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(left);
            final mbtepmdemo.proxy.BusinessPartnerFilter b = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_BusinessPartnerFilter.cast(right);
            final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.BusinessPartnerFilter, mbtepmdemo.proxy.BusinessPartnerFilter, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
