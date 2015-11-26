package sun.bob.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bob.sun on 15/11/26.
 */
public class Data implements Parcelable {
    private String data;

    public Data(){

    }
    protected Data(Parcel in) {
        data = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getData() {
        return data;
    }

    public Data setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(data);
    }
}
