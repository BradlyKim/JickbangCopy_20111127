package com.nepplus.jickbangcopy_20111127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20111127.adapters.RoomAdapter
import com.nepplus.jickbangcopy_20111127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mRoomAdapter: RoomAdapter

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add( RoomData(10000, "서울시 동대문구", 10, "2번째 방입니다.") )
        mRoomList.add( RoomData(5000, "서울시 동대문구", 0, "3번째 방입니다.") )
        mRoomList.add( RoomData(12000, "서울시 서대문구", -1, "4번째 방입니다.") )
        mRoomList.add( RoomData(9000, "서울시 서대문구", -2, "5번째 방입니다.") )
        mRoomList.add( RoomData(9500, "서울시 서대문구", 4, "6번째 방입니다.") )
        mRoomList.add( RoomData(5600, "서울시 종로구", 20, "7번째 방입니다.") )
        mRoomList.add( RoomData(15000, "서울시 종로구", 15, "8번째 방입니다.") )
        mRoomList.add( RoomData(11000, "서울시 중랑구", 0, "9번째 방입니다.") )
        mRoomList.add( RoomData(9900, "서울시 중랑구", -3, "10번째 방입니다.") )
        mRoomList.add( RoomData(70000, "서울시 중랑구", 4, "11번째 방입니다.") )

        mRoomAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )
        roomListView.adapter = mRoomAdapter



    }
}