package mbtepmdemo.proxy;

public class CTAddressList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<mbtepmdemo.proxy.CTAddress>
{
    public static final mbtepmdemo.proxy.CTAddressList empty = new mbtepmdemo.proxy.CTAddressList(java.lang.Integer.MIN_VALUE);

    public CTAddressList()
    {
        this(4);
    }

    public CTAddressList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final mbtepmdemo.proxy.CTAddressList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final mbtepmdemo.proxy.CTAddressList addThis(final mbtepmdemo.proxy.CTAddress item)
    {
        this.add(item);
        return this;
    }

    public final mbtepmdemo.proxy.CTAddressList copy()
    {
        return this.slice(0);
    }

    public final mbtepmdemo.proxy.CTAddressList filter(final com.sap.cloud.server.odata.core.Function1<mbtepmdemo.proxy.CTAddress, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final mbtepmdemo.proxy.CTAddressList result = new mbtepmdemo.proxy.CTAddressList(n);
        // for (let item of this)
        {
            final mbtepmdemo.proxy.CTAddressList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final mbtepmdemo.proxy.CTAddress item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final mbtepmdemo.proxy.CTAddress first()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().first());
    }

    public static mbtepmdemo.proxy.CTAddressList from(final java.util.List<mbtepmdemo.proxy.CTAddress> list)
    {
        return CTAddressList.share(new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.CTAddress>(list).toAnyList());
    }

    public final mbtepmdemo.proxy.CTAddress get(final int index)
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final mbtepmdemo.proxy.CTAddress item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final mbtepmdemo.proxy.CTAddress item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final mbtepmdemo.proxy.CTAddress item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final mbtepmdemo.proxy.CTAddressList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<mbtepmdemo.proxy.CTAddress> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final mbtepmdemo.proxy.CTAddress last()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.CTAddress item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.CTAddress item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static mbtepmdemo.proxy.CTAddressList of(final mbtepmdemo.proxy.CTAddress... items)
    {
        mbtepmdemo.proxy.CTAddressList rest_items = new mbtepmdemo.proxy.CTAddressList(items.length);
        for (mbtepmdemo.proxy.CTAddress items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public mbtepmdemo.proxy.CTAddressList reversed()
    {
        final mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final mbtepmdemo.proxy.CTAddress item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static mbtepmdemo.proxy.CTAddressList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final mbtepmdemo.proxy.CTAddressList result = new mbtepmdemo.proxy.CTAddressList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof mbtepmdemo.proxy.CTAddress)
                {
                    final mbtepmdemo.proxy.CTAddress var_item = ((mbtepmdemo.proxy.CTAddress)item);
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

    public final mbtepmdemo.proxy.CTAddress single()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(this.getUntypedList().single());
    }

    public final mbtepmdemo.proxy.CTAddressList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final mbtepmdemo.proxy.CTAddressList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final mbtepmdemo.proxy.CTAddressList result = new mbtepmdemo.proxy.CTAddressList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> increasing)
    {
        this.sortWith(new mbtepmdemo.proxy.CTAddressList.OrderBy(increasing));
    }

    public final mbtepmdemo.proxy.CTAddressList sorted()
    {
        final mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.sort();
        return result;
    }

    public final mbtepmdemo.proxy.CTAddressList sortedBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> increasing)
    {
        final mbtepmdemo.proxy.CTAddressList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    public com.sap.cloud.server.odata.ComplexValueList toComplexList()
    {
        return com.sap.cloud.server.odata.ComplexValueList.share(this).withItemType(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.ComplexTypes.ctAddress);
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toComplexList();
    }

    public java.util.List<mbtepmdemo.proxy.CTAddress> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.CTAddress>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final mbtepmdemo.proxy.CTAddress a = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(left);
            final mbtepmdemo.proxy.CTAddress b = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_CTAddress.cast(right);
            final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.CTAddress, mbtepmdemo.proxy.CTAddress, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
