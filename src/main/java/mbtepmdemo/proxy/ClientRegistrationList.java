package mbtepmdemo.proxy;

public class ClientRegistrationList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<mbtepmdemo.proxy.ClientRegistration>
{
    public static final mbtepmdemo.proxy.ClientRegistrationList empty = new mbtepmdemo.proxy.ClientRegistrationList(java.lang.Integer.MIN_VALUE);

    public ClientRegistrationList()
    {
        this(4);
    }

    public ClientRegistrationList(final int capacity)
    {
        super(capacity);
    }

    public final void add(final mbtepmdemo.proxy.ClientRegistration item)
    {
        this.getUntypedList().add(((Object)item));
    }

    public final void addAll(final mbtepmdemo.proxy.ClientRegistrationList list)
    {
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public final mbtepmdemo.proxy.ClientRegistrationList addThis(final mbtepmdemo.proxy.ClientRegistration item)
    {
        this.add(item);
        return this;
    }

    public final mbtepmdemo.proxy.ClientRegistrationList copy()
    {
        return this.slice(0);
    }

    public final mbtepmdemo.proxy.ClientRegistrationList filter(final com.sap.cloud.server.odata.core.Function1<mbtepmdemo.proxy.ClientRegistration, Boolean> predicate)
    {
        int n = this.length();
        if (n > 4)
        {
            n = 4;
        }
        final mbtepmdemo.proxy.ClientRegistrationList result = new mbtepmdemo.proxy.ClientRegistrationList(n);
        // for (let item of this)
        {
            final mbtepmdemo.proxy.ClientRegistrationList item_list = this;
            final int item_count = item_list.length();
            int item_index;
            for (item_index = 0; item_index < item_count; item_index++)
            {
                final mbtepmdemo.proxy.ClientRegistration item = item_list.get(item_index);
                if (predicate.call(item))
                {
                    result.add(item);
                }
            }
        }
        return result;
    }

    public final mbtepmdemo.proxy.ClientRegistration first()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.getUntypedList().first());
    }

    public static mbtepmdemo.proxy.ClientRegistrationList from(final java.util.List<mbtepmdemo.proxy.ClientRegistration> list)
    {
        return ClientRegistrationList.share(new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.ClientRegistration>(list).toAnyList());
    }

    public final mbtepmdemo.proxy.ClientRegistration get(final int index)
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.getUntypedList().get(index));
    }

    public final boolean includes(final mbtepmdemo.proxy.ClientRegistration item)
    {
        return this.indexOf(item) != -1;
    }

    public final int indexOf(final mbtepmdemo.proxy.ClientRegistration item)
    {
        return this.indexOf(item, 0);
    }

    public final int indexOf(final mbtepmdemo.proxy.ClientRegistration item, final int start)
    {
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public final void insertAll(final int index, final mbtepmdemo.proxy.ClientRegistrationList list)
    {
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public final void insertAt(final int index, final mbtepmdemo.proxy.ClientRegistration item)
    {
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<mbtepmdemo.proxy.ClientRegistration> iterator()
    {
        return this.toGeneric().iterator();
    }

    public final mbtepmdemo.proxy.ClientRegistration last()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.getUntypedList().last());
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.ClientRegistration item)
    {
        return this.lastIndexOf(item, 2147483647);
    }

    public final int lastIndexOf(final mbtepmdemo.proxy.ClientRegistration item, final int start)
    {
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public static mbtepmdemo.proxy.ClientRegistrationList of(final mbtepmdemo.proxy.ClientRegistration... items)
    {
        mbtepmdemo.proxy.ClientRegistrationList rest_items = new mbtepmdemo.proxy.ClientRegistrationList(items.length);
        for (mbtepmdemo.proxy.ClientRegistration items_item : items) rest_items.add(items_item);
        return rest_items;
    }

    public mbtepmdemo.proxy.ClientRegistrationList reversed()
    {
        final mbtepmdemo.proxy.ClientRegistrationList result = this.copy();
        result.reverse();
        return result;
    }

    public final void set(final int index, final mbtepmdemo.proxy.ClientRegistration item)
    {
        this.getUntypedList().set(index, ((Object)item));
    }

    public static mbtepmdemo.proxy.ClientRegistrationList share(final com.sap.cloud.server.odata.ListBase list)
    {
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final mbtepmdemo.proxy.ClientRegistrationList result = new mbtepmdemo.proxy.ClientRegistrationList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof mbtepmdemo.proxy.ClientRegistration)
                {
                    final mbtepmdemo.proxy.ClientRegistration var_item = ((mbtepmdemo.proxy.ClientRegistration)item);
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

    public final mbtepmdemo.proxy.ClientRegistration single()
    {
        return mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(this.getUntypedList().single());
    }

    public final mbtepmdemo.proxy.ClientRegistrationList slice(final int start)
    {
        return this.slice(start, 2147483647);
    }

    public final mbtepmdemo.proxy.ClientRegistrationList slice(final int start, final int end)
    {
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final mbtepmdemo.proxy.ClientRegistrationList result = new mbtepmdemo.proxy.ClientRegistrationList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    public final void sortBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> increasing)
    {
        this.sortWith(new mbtepmdemo.proxy.ClientRegistrationList.OrderBy(increasing));
    }

    public final mbtepmdemo.proxy.ClientRegistrationList sorted()
    {
        final mbtepmdemo.proxy.ClientRegistrationList result = this.copy();
        result.sort();
        return result;
    }

    public final mbtepmdemo.proxy.ClientRegistrationList sortedBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> increasing)
    {
        final mbtepmdemo.proxy.ClientRegistrationList result = this.copy();
        result.sortBy(increasing);
        return result;
    }

    @Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(mbtepmdemo.proxy.ComSapMbtepmdemoServiceMetadata.EntityTypes.clientRegistration);
    }

    public java.util.List<mbtepmdemo.proxy.ClientRegistration> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<mbtepmdemo.proxy.ClientRegistration>(this);
    }

    public static class OrderBy
    extends com.sap.cloud.server.odata.core.Comparer
    {
        private com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> _increasing_;

        public OrderBy(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> increasing)
        {
            this.set_increasing(increasing);
        }

        @Override public int compare(final Object left, final Object right)
        {
            final mbtepmdemo.proxy.ClientRegistration a = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(left);
            final mbtepmdemo.proxy.ClientRegistration b = mbtepmdemo.proxy.internal.Any_as_mbtepmdemo_proxy_ClientRegistration.cast(right);
            final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> increasing = this.get_increasing();
            return increasing.call(b, a) ? 1 : 0;
        }

        private final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> get_increasing()
        {
            return ((com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean>)com.sap.cloud.server.odata.core.CheckProperty.isDefined(this, "_increasing", this._increasing_));
        }

        private final void set_increasing(final com.sap.cloud.server.odata.core.Function2<mbtepmdemo.proxy.ClientRegistration, mbtepmdemo.proxy.ClientRegistration, Boolean> value)
        {
            this._increasing_ = value;
        }
    }
}
