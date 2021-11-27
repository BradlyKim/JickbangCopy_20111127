package com.nepplus.jickbangcopy_20111127.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.jickbangcopy_20111127.datas.RoomData
import java.util.ArrayList

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
}