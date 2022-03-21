package binar.andlima.chaptertiga.serializable

import android.os.Parcel
import android.os.Parcelable

data class NewParcelable(val name : String?) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NewParcelable> {
        override fun createFromParcel(parcel: Parcel): NewParcelable {
            return NewParcelable(parcel)
        }

        override fun newArray(size: Int): Array<NewParcelable?> {
            return arrayOfNulls(size)
        }
    }
}
