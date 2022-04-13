import java.util.Arrays;

public class HoorayList <E> {
    // E is placeholder for element
    private static final int DEFAULT_CAPACITY = 10;
    private int mCapacity;
    private int mSize;

    private E[] mData;

    // default Constructor
    public HoorayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public HoorayList(int capacity)
    {
        mCapacity = DEFAULT_CAPACITY;
        mSize = 0;
        // Initialize our mData array w length 10
        mData = (E[]) new Object[mCapacity];
    }

    public E get(int index)
    {
        if (index < 0 || index >= mSize)
            throw new IndexOutOfBoundsException("Index must be >= 0 and < "+ mSize);

        return mData[index];
    }

    public E set(int index, E element)
    {
        E temp = this.get(index); // temp is old value. Uses code from get function
        mData[index] = element;
        return temp;

    }

    public boolean add(E element)
    {
        //check if its full
        if (mSize >= mCapacity)
        {
            // double capacity
            // This downcasts object to E
            E[] newData = (E[]) new Object[mCapacity*2];
            for (int i = 0; i < mSize; i++) {
                newData[i] = mData[i];
            }
            mData = newData;
            // Copy all old values

        }
        // Adds to end of HoorayList
        mData[mSize++] = element;

        // Update our capacity
        mCapacity *= 2;

        return true;
    }

    public E remove(int index)
    {
        // Make a copy of the old element
        E temp = mData[index];
        for (int i = index; i < mSize; i++) {
            mData[i] = mData[i+1];
        }
        // Make size go down by 1
        mSize--;
        return temp;
    }

    // remove paulding

    public void clear()
    {
        // Start a new array
        mData = (E[]) new Object[mCapacity];
    }

    @Override
    public String toString() {
        String output = "[";
        // Is actual data that is filled, capacity is possible data
        for (int i = 0; i < mSize; i++) {
            output += mData[i] + ",";
        }
        output += "Hooray!]";
        return output;
    }
}
